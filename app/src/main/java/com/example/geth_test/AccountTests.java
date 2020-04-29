package com.example.geth_test;

import org.ethereum.geth.Account;
import org.ethereum.geth.Geth;
import org.ethereum.geth.KeyStore;

public class AccountTests {

	static String SK   = "0xcdfbe6f7602f67a97602e3e9fc24cde1cdffa88acd47745c0b84c5ff55891e1b";
	static String ADDR = "0xb02A2EdA1b317FBd16760128836B0Ac59B560e9D";

	public static KeyStore getKeyStore(MainActivity cb) throws Exception{
		KeyStore ks = new KeyStore(cb.getFilesDir().getAbsolutePath(), Geth.StandardScryptN, Geth.StandardScryptP);
		try {
			ks.importECDSAKey(Geth.decodeFromHex(SK), "");
		} catch (Exception e) {
			if (!e.toString().endsWith("error: account already exists")) {
				throw e;
			}
		}
		Account acc =  ks.getAccounts().get(0);
		if (!acc.getAddress().getHex().equals(ADDR)) {
			throw new Exception("Wrong SK/ADDR");
		}
		cb.log("1\n");
		return ks;
	}
}
