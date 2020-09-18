package com.example.geth_test;

import android.os.SystemClock;

import com.example.geth_test.bindings.Tuple;
//import com.example.geth_test.bindings.TupleTest2;

import org.ethereum.geth.Account;
import org.ethereum.geth.Address;
import org.ethereum.geth.BigInt;
import org.ethereum.geth.BigInts;
import org.ethereum.geth.CallOpts;
import org.ethereum.geth.Context;
import org.ethereum.geth.EthereumClient;
import org.ethereum.geth.Geth;
import org.ethereum.geth.KeyStore;
import org.ethereum.geth.Node;
import org.ethereum.geth.Signer;
import org.ethereum.geth.TransactOpts;
import org.ethereum.geth.Transaction;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class BindingTests {

	public static void testBinding(MainActivity cb) throws Exception {
		cb.log("Binding tests\n");
		EthereumClient infura = NodeTests.getInfuraClient();
		cb.log("Connected to infura\n");
		final KeyStore ks = AccountTests.getKeyStore(cb);
		TransactOpts txopts = Geth.newTransactOpts();
		Signer s = new Signer() {
			@Override
			public Transaction sign(Address address, Transaction transaction) throws Exception {
				Account ac = ks.getAccounts().get(0);
				ks.unlock(ac, "");
				return ks.signTx(ac, transaction, new BigInt(5)); //use goerli chainID
			}
		};
		txopts.setSigner(s);
		txopts.setFrom(ks.getAccounts().get(0).getAddress());
		cb.log("Asking suggested gas price\n");
		txopts.setGasPrice(infura.suggestGasPrice(new Context()));
		txopts.setNonce(infura.getNonceAt(new Context(), ks.getAccounts().get(0).getAddress(), -1));
		//tupleTest2Deploy(txopts, infura, cb, ks);
	}

	/*
	public static void tupleTest2Deploy(TransactOpts opts, EthereumClient ec, MainActivity cb, KeyStore ks) throws Exception {
		cb.log("Deploying...\n");
		cb.log("sender: "+ opts.getFrom().getHex() +"\n");
		cb.log("nonce:" + opts.getNonce() +"\n");
		TupleTest2 t = TupleTest2.deploy(opts, ec);
		cb.log("Contract deployed at: "+ t.Address.getHex() + "\n");

		SystemClock.sleep(1000);
		callTupleTest(t, opts, cb, ec, ks);
	}

	public static void callTupleTest(TupleTest2 contract, TransactOpts opts, MainActivity cb, EthereumClient ec, KeyStore ks) throws Exception {
		cb.log("Calling g...");
		opts.setNonce(ec.getPendingNonceAt(new Context(), ks.getAccounts().get(0).getAddress()));
		TupleTest2.T t = contract.new T();
		CallOpts co = Geth.newCallOpts();
		co.setPending(true);
		contract.a(co, t);
	}

	public static void tupleDeploy(TransactOpts opts, EthereumClient ec, MainActivity cb) throws Exception {
		cb.log("Deploying...\n");
		Tuple t = Tuple.deploy(opts, ec);
		cb.log("Contract deployed at: "+ t.Address.getHex() + "\n");
		callFunc(t);
	}

	public static void callFunc(Tuple t) throws Exception {
		CallOpts co = new CallOpts();
		Tuple.TupleS a = t.new TupleS();
		Tuple.TupleT[][] b = {{t.new TupleT()} , {t.new TupleT()} };
		Tuple.TupleT[][] c= {{t.new TupleT()} , {t.new TupleT()} };
		Tuple.TupleS[] d  = {t.new TupleS(), t.new TupleS()};
		BigInts e = new BigInts(1234);
		Tuple.Func1Results res = t.func1(co, a, b, c, d, e);
		System.out.println(res);
	}

*/


}
