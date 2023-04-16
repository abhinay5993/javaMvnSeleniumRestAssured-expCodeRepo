package com.prog.odinsexps.multithread;

public class ThreadByRunnableImplExp {

	public static void main(String[] args) 
	{
		System.out.println("\nMain Thread Started !!.. " + Thread.currentThread());

		// Create Object of Thread and pass Runnable Object.
		Thread runObj = new Thread(() -> {
			System.out.println("\nBody of : " + Thread.currentThread().getName());
			for (int i = 1; i <= 10; i++) {
				System.err.println("\nLambda passed with run() implementation '" + Thread.currentThread() + "' : " + i);
				try {
					Thread.sleep(i * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.err.println("\nTask done for : 'RunnableU1-Task1-AL001'");
		}, "RunnableU1-Task1-AL001");
		
		
		Thread runObj1 = new Thread(() -> {
			System.out.println("\nBody of : " + Thread.currentThread().getName());
			for (int i = 1; i <= 7; i++) {
				System.err.println("\nLambda passed with run() implementation '" + Thread.currentThread() + "' :" + i);
				try {
					Thread.sleep(i % 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.err.println("\nTask done for : 'RunnableU2-SDET-002'");
		}, "RunnableU2-SDET-002");

		
		Thread willMarkItDemonObj = new Thread(() -> {
			System.out.println("\nBody of : " + Thread.currentThread().getName());
			for (int i = 1; i <=5; i++) {
				System.err.println("\nLambda passed with run() implementation '" + Thread.currentThread() + "' :" + i);
				try {
					Thread.sleep(i % 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.err.println("\nTask done for : Runnable1=DEMON1-Thread3");
		}, "RunnableD1_DEMON1");
		
		//Setting as DEMON
		willMarkItDemonObj.setDaemon(true);
		
		//Will be starting all the Threads now
		willMarkItDemonObj.start();
		runObj.start();
		runObj1.start();
		
		System.out.println("\nMain() Thread task is Done!!..");
		
	}

	
}