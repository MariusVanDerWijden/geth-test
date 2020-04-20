package com.example.geth_test;

import androidx.appcompat.app.AppCompatActivity;

import org.ethereum.geth.Address;
import org.ethereum.geth.BigInt;
import org.ethereum.geth.Block;
import org.ethereum.geth.Context;
import org.ethereum.geth.EthereumClient;
import org.ethereum.geth.Geth;
import org.ethereum.geth.Hash;
import org.ethereum.geth.Header;
import org.ethereum.geth.Node;
import org.ethereum.geth.NodeConfig;
import org.ethereum.geth.NodeInfo;
import org.ethereum.geth.Transaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            EthereumClient ec = getInfuraClient();
            runTests(ec);
        } catch(Exception e) {
            log("Could not connect: " + e.toString());
            e.printStackTrace();
        }
    }

    private EthereumClient getInfuraClient() throws Exception {
        String infura = "wss://mainnet.infura.io/ws/v3/2e5a3920f039435d9bb23729c7b65186";
        return new EthereumClient(infura);
    }
    private EthereumClient getLocalNode() throws Exception{
        NodeConfig conf = Geth.newNodeConfig();
        Node node = Geth.newNode(getFilesDir() + "/.ethereum", conf);
        node.start();
        NodeInfo info = node.getNodeInfo();
        String s = String.format("Name: %s Address: %s Protocols: %s\n",
                info.getName(), info.getListenerAddress(), info.getProtocols());
        return node.getEthereumClient();
    }

    private void runTests(EthereumClient ec) throws Exception {
        Context ctx = new Context();
        String result = "RESULT:\n\n";
        TestGetBalance(ctx, ec);
        TestGetBlock(ctx, ec);
        TestGetTransaction(ctx, ec);
        TestGetHeader(ctx, ec);
    }


    private void log(String s) {
        TextView tv = findViewById(R.id.hello_world);
        tv.append(s);
    }

    private void TestGetBalance(Context ctx, EthereumClient ec) throws Exception {
        Address coinbase = new Address("0x57d22b967c9dc64e5577f37edf1514c2d8985099");
        BigInt big = ec.getBalanceAt(ctx, coinbase, -1);
        String s = "Address: " + coinbase.getHex() + "\n";
        s += "Balance: " + big.toString() + " wei\n";
        log(s);
    }

    private void TestGetBlock(Context ctx, EthereumClient ec) throws Exception {
        Block b = ec.getBlockByNumber(ctx, 9890000);
        Hash hash = b.getHash();
        Block b2 = ec.getBlockByHash(ctx, hash);
        if(!b.equals(b2)){
            throw new Exception(
                    String.format("Invalid Blocks B1: %s B2: %s\n",
                            b.getHash().toString(), b2.getHash().getHex()));
        }
        log(String.format("Retrieved block: %s with hash %s\n",
                b.getHash().getHex(), b2.getHash().getHex()));
    }

    private String TestGetTransaction(Context ctx, EthereumClient ec) throws Exception {
        Block b = ec.getBlockByNumber(ctx, 9890000);
        // Retrieve the seventh transaction of block 9890000
        Transaction tx = ec.getTransactionInBlock(ctx, b.getHash(), 7);
        Transaction tx2 = ec.getTransactionByHash(ctx, tx.getHash());
        if(!tx.equals(tx2)){
            throw new Exception(
                    String.format("Invalid transactions Tx1: %s, Tx2: %s",
                            tx.getHash().getHex(), tx2.getHash().getHex()));
        }
        log(String.format("Tx hash: %s \n",tx.getHash().getHex()));
    }

    private String TestGetHeader(Context ctx, EthereumClient ec) throws Exception {
        Block b = ec.getBlockByNumber(ctx, 9890000);
        Header h1 = b.getHeader();
        Header h2 = ec.getHeaderByHash(ctx, h1.getHash());
        Header h3 = ec.getHeaderByNumber(ctx, 9890000);
        if(!h1.equals(h2)) {
            throw new Exception(
                    String.format("Invalid header h1; %s, h2: %s",
                            h1.getHash().getHex(), h2.getHash().getHex()));
        }
        if(!h2.equals(h3)) {
            throw new Exception(
                    String.format("Invalid header h2; %s, h3: %s",
                            h2.getHash().getHex(), h3.getHash().getHex()));
        }
        log(String.format("Header hash: %s \n",h1.getHash().getHex()));
    }


}
