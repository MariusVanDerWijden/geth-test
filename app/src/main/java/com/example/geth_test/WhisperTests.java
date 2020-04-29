package com.example.geth_test;

import org.ethereum.geth.Context;
import org.ethereum.geth.Criteria;
import org.ethereum.geth.Geth;
import org.ethereum.geth.Message;
import org.ethereum.geth.NewMessage;
import org.ethereum.geth.NewMessageHandler;
import org.ethereum.geth.WhisperClient;

public class WhisperTests {

	private static MainActivity cb;

	public static void runWhisperTests(MainActivity _cb) {
		cb = _cb;
		cb.log("\nWHISPER TESTS \n");
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					WhisperClient client = new WhisperClient("ws://192.168.178.38:8546");
					NewMessage msg = Geth.newNewMessage();

					msg.setPayload("message".getBytes());
					msg.setTopic("geth-test-message".getBytes());
					msg.setPublicKey("0x0E91E4643c7923F6E57699b98254be2eba99f9aC".getBytes());
					msg.setTTL(60);
					msg.setPowTime(2);
					msg.setPowTarget(2.5);
					client.post(new Context(), msg);
					NewMessageHandler msgh = new NewMessageHandler() {
						@Override
						public void onError(String s) {
							cb.log("MessageHandler failed: "+s);
							cb.logFail();
						}

						@Override
						public void onNewMessage(Message message) {
							cb.log("Received Message: "+ message.toString());
						}
					};
					Criteria criteria = new Criteria("geth-test-message".getBytes());
					client.subscribeMessages(new Context(),criteria,  msgh, 1);
				} catch (Exception e) {
					cb.log(e.toString());
					e.printStackTrace();
					cb.logFail();
				}
			}
		}).start();
	}
}
