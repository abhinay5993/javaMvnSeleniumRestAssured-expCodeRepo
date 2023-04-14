package com.prog.odinsexps.multithread;

//By Exteding the Thread class
public class CreateThreadUsingThreadCls extends Thread {
	
	public void run() {
		System.out.println("\nSub-process/Task of Thread started..");
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
		System.out.println("\nTask Completed!!.. Done..");
	}
	
	public static void main(String[] args) {
		//New Runnable Object of Thread.
		CreateThreadUsingThreadCls threadObj=new CreateThreadUsingThreadCls();
		threadObj.start(); //JMV will call internally run() to make Runnable to Running State.
	}

}
