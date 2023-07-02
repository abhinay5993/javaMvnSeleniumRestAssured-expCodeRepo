package com.prog.odinsexps.multithread;

//By Exteding the Thread class
public class CreateThreadUsingThreadCls extends Thread {
	
	public void run() {
		System.out.println("\nSub-process/Task of User Thread started..");
		for (int i = 0; i < 10; i++) {
			System.out.println("JMV will call-" + i + " internally run() to make Runnable to Running State");
			try {
				if (i % 2 == 0) {
					sleep(i * 1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\nCompleted!!.. User Thread Task Completed.");
	}
	
	public static void main(String[] args) {
		//New Runnable Object of Thread.
		System.out.println("\nMain Thread started!!..");
		Thread threadObj=new CreateThreadUsingThreadCls();
		threadObj.start(); //JMV will call internally run() to make Runnable to Running State.
		System.out.println("\nMain Thread Completed!!!.. Done....");
	}

}
