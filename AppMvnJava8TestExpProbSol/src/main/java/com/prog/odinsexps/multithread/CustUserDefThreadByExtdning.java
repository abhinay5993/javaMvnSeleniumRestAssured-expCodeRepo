package com.prog.odinsexps.multithread;

public class CustUserDefThreadByExtdning extends Thread {
	
	CustUserDefThreadByExtdning(String threadName) {
		super(threadName);
	}
	
	@Override
	public void run() {
		System.out.println("\nMy User Def Thread class started : " + Thread.currentThread());
		for (int i = 1; i <= 10; i++) {
			System.out.println("\nTask Running Progress '"+Thread.currentThread()+"' Level : " + i);
			try {
				sleep(i*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("\nTask Exit Done : "+Thread.currentThread().getName());
	}
	
}