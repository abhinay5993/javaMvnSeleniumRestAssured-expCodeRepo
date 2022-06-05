package com.prog.odinsexps.multithread;

public class AllBollyWoodFilterAppExp implements Runnable {

	public void printMsgBySharukh() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			Thread.sleep(1000);
			System.out.println("\nsharukh Movies-" + i);
		}
	}

	@Override
	public synchronized void run() {
		try {
			String getThreadVal = Thread.currentThread().getName();
			if (getThreadVal.equalsIgnoreCase("sharukh") || getThreadVal.equalsIgnoreCase("all")) {
				printMsgBySharukh();
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}