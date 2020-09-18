package com.example.geth_test;

import android.os.SystemClock;

import org.ethereum.geth.Address;
import org.ethereum.geth.BigInt;
import org.ethereum.geth.Block;
import org.ethereum.geth.Context;
import org.ethereum.geth.Enode;
import org.ethereum.geth.Enodes;
import org.ethereum.geth.EthereumClient;
import org.ethereum.geth.Geth;
import org.ethereum.geth.Hash;
import org.ethereum.geth.Header;
import org.ethereum.geth.Node;
import org.ethereum.geth.NodeConfig;
import org.ethereum.geth.NodeInfo;
import org.ethereum.geth.SyncProgress;
import org.ethereum.geth.Transaction;

public class NodeTests {

	private static MainActivity cb;

	public static void runInfuraTests(MainActivity _cb) throws Exception{
		cb = _cb;
		cb.log("INFURA TESTS\n");
		EthereumClient ec = getInfuraClient();
		runTests(ec);
	}

	public static void runLesTests(MainActivity _cb) throws Exception {
		cb = _cb;
		cb.log("\nLES TESTS\n");
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					EthereumClient ev = getLocalNode();
					runTests(ev);
				} catch (Exception e) {
					cb.log(e.toString());
					e.printStackTrace();
					cb.logFail();
				}
			}
		}).start();
	}

	public static EthereumClient getInfuraClient() throws Exception {
		String infura = "wss://goerli.infura.io/ws/v3/2e5a3920f039435d9bb23729c7b65186";
		return new EthereumClient(infura);
	}

	private static EthereumClient getLocalNode() throws Exception{
		NodeConfig conf = Geth.newNodeConfig();
		conf.setEthereumGenesis(Geth.goerliGenesis());
		Enodes bn = Geth.foundationBootnodes();
		Enode enode = new Enode("enode://189aab7dafa38ba15db6ecb2ada7a4d0f951b6dc52337983c2babb81f8844242b7e7bc5a8dddeeb39a8e88308cda81f5b84d961a1e0e52a6ea60d6ad6b390fe4@13.48.178.34:30303?discport=1102");
		conf.addBootstrapNode(enode);
		Node node = Geth.newNode(cb.getFilesDir() + "/.ethereum/goerli", conf);
		node.start();
		NodeInfo info = node.getNodeInfo();
		cb.log(String.format("Name: %s Address: %s Protocols: %s\n",
				info.getName(), info.getListenerAddress(), info.getProtocols()));
		cb.log("waiting for peers");
		boolean finishedSyncing = false;
		boolean syncing = false;
		while(!finishedSyncing) {
			SyncProgress sn = node.getEthereumClient().syncProgress(new Context());

			if (sn != null) {
				if(!syncing) {
					cb.log("highest block:" + sn.getHighestBlock());
				}
				syncing = true;
				SystemClock.sleep(1000);
			} else if (syncing){
				finishedSyncing = true;
			}
			SystemClock.sleep(1000);
		}
		return node.getEthereumClient();
	}

	private static void runTests(EthereumClient ec) throws Exception {
		Context ctx = new Context();
		TestGetBalance(ctx, ec);
		TestGetBlock(ctx, ec);
		TestGetTransaction(ctx, ec);
		TestGetHeader(ctx, ec);
		cb.log("Successful ran tests");
		cb.logSuccess();
	}

	private static void TestGetBalance(Context ctx, EthereumClient ec) throws Exception {
		Address coinbase = new Address("0x57d22b967c9dc64e5577f37edf1514c2d8985099");
		BigInt big = ec.getBalanceAt(ctx, coinbase, -1);
		String s = "Address: " + coinbase.toString() + "\n";
		s += "Balance: " + big.toString() + " wei\n";
		cb.log(s);
	}

	private static void TestGetBlock(Context ctx, EthereumClient ec) throws Exception {
		Block b = ec.getBlockByNumber(ctx, 1000000);
		Hash hash = b.getHash();
		Block b2 = ec.getBlockByHash(ctx, hash);
		if(!b.equals(b2)){
			throw new Exception(
					String.format("Invalid Blocks B1: %s B2: %s\n",
							b.getHash().toString(), b2.getHash().toString()));
		}
		cb.log(String.format("Retrieved block: %s with hash %s\n",
				b.getNumber(), b2.getHash()));
	}

	private static void TestGetTransaction(Context ctx, EthereumClient ec) throws Exception {
		Block b = ec.getBlockByNumber(ctx, 1000000);
		// Retrieve the second transaction of block 1000000
		Transaction tx = ec.getTransactionInBlock(ctx, b.getHash(), 1);
		Transaction tx2 = ec.getTransactionByHash(ctx, tx.getHash());
		if(!tx.equals(tx2)){
			throw new Exception(
					String.format("Invalid transactions Tx1: %s, Tx2: %s",
							tx.getHash().toString(), tx2.getHash().toString()));
		}
		cb.log(String.format("Tx hash: %s \n",tx.getHash()));
	}

	private static void TestGetHeader(Context ctx, EthereumClient ec) throws Exception {
		Block b = ec.getBlockByNumber(ctx, 1000000);
		Header h1 = b.getHeader();
		Header h2 = ec.getHeaderByHash(ctx, h1.getHash());
		Header h3 = ec.getHeaderByNumber(ctx, 1000000);
		if(!h1.equals(h2)) {
			throw new Exception(
					String.format("Invalid header h1; %s, h2: %s",
							h1.getHash().toString(), h2.getHash().toString()));
		}
		if(!h2.equals(h3)) {
			throw new Exception(
					String.format("Invalid header h2; %s, h3: %s",
							h2.getHash().toString(), h3.getHash().toString()));
		}
		cb.log(String.format("Header hash: %s \n",h1.getHash()));
	}
}
