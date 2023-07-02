package com.prog.odinsexps.multithread;

public class MultiThreadingDay2AppMeths {

	public static void main(String[] args) throws InterruptedException {
		System.err.println("\nMain Thread Started!!..it will help to spwan/Birth child Threads .."+Thread.currentThread().getName());
		
		new Thread().setDaemon(true);
		
		Thread thObj1 = new Thread(() -> {
			System.out.println("\nTask Starting for : " + Thread.currentThread());
			for (int i = 0; i <= 5; i++) {
				System.out.println("\nTask "+Thread.currentThread()+" count : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\nTask Exit : " + Thread.currentThread());
		}, "Abhinay-1_ThreadApp1");
		
		Thread thObj2 = new Thread(() -> {
			System.out.println("\nCalled Join() on it...");
			System.out.println("\nTask Starting for : " + Thread.currentThread());
			for (int i = 0; i <= 10; i++) {
				System.out.println("\nTask "+Thread.currentThread()+" count : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\nTask Exit : " + Thread.currentThread());
		}, "QASDET-1_ThreadApp-2");

		
		Thread thObj3 = new Thread(() -> {
			System.out.println("\nTask Starting for : " + Thread.currentThread());
			for (int i = 0; i <=12; i++) {
				System.out.println("\nTask "+Thread.currentThread()+" count : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\nTask Exit : " + Thread.currentThread());
		}, "DEMON-1_ThreadApp-3");
		
		Thread thObj4 = new Thread(() -> {
			System.out.println("\nTask Starting for : " + Thread.currentThread());
			for (int i = 0; i <=7; i++) {
				System.out.println("\nTask "+Thread.currentThread()+" count : " + i);
				try {
					Thread.sleep(500);
					System.out.println("thObj4 --> Object called join() for 1000 ms");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\nTask Exit : " + Thread.currentThread());
		}, "DEMON-2_Cust1App-4");
		
		//Marking as Demon
		thObj4.setDaemon(true);
		thObj3.setDaemon(true);
		
		//Setting Thread priority before starting
		thObj3.setPriority(Thread.MAX_PRIORITY);
		//Thread.NORM_PRIORITY --> Default Priority
		thObj4.setPriority(Thread.NORM_PRIORITY);
		thObj1.setPriority(Thread.NORM_PRIORITY);
		thObj2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("\nGet-1 Demon : "+thObj1.isDaemon()+" "+thObj1.isAlive());
		System.out.println("\nGet-2 Demon : "+thObj2.isDaemon()+" "+thObj2.isAlive());
		System.out.println("\nGet-3 Demon : "+thObj3.isDaemon()+" "+thObj3.isAlive());
		System.out.println("\nGet-4 Demon : "+thObj4.isDaemon()+" "+thObj4.isAlive());
		//starting all threads
		thObj1.start();
		thObj2.start();
		thObj3.start();
		thObj4.start();
		
		//calling Join Demon Thread and User defined Custom Thread
		thObj4.join(1000);
		thObj2.join();
		System.out.println("\nGet-1 Demon : "+thObj1.isDaemon()+" "+thObj1.isAlive());
		System.out.println("\nGet-2 Demon : "+thObj2.isDaemon()+" "+thObj2.isAlive());
		System.out.println("\nGet-3 Demon : "+thObj3.isDaemon()+" "+thObj3.isAlive());
		System.out.println("\nGet-4 Demon : "+thObj4.isDaemon()+" "+thObj4.isAlive());
		//Calling Thread Priority
		System.out.println("\nFirst Thread Priority is set to Default Priority : "+thObj1.getPriority());
		System.out.println("\n2nd Thread Priority : "+thObj2.getPriority());
		System.out.println("\n3rd Thread Priority : "+thObj3.getPriority());
		System.out.println("\n4th Thread Priority set to Default Priority : "+thObj4.getPriority());
		
		System.out.println("\n"+Thread.currentThread()+" Task Exit!! done");
		System.out.println("\nis Demon : "+thObj1.isDaemon()+" "+thObj1.isAlive());
		System.out.println("\nis Demon : "+thObj2.isDaemon()+" "+thObj2.isAlive());
		System.out.println("\nis Demon : "+thObj3.isDaemon()+" "+thObj3.isAlive());
		System.out.println("\nis Demon : "+thObj4.isDaemon()+" "+thObj4.isAlive());
	}

}