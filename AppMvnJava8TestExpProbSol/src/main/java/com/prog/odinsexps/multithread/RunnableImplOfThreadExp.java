package com.prog.odinsexps.multithread;

//By Implementing Runnable Interface
public class RunnableImplOfThreadExp implements Runnable {

	public static void main(String[] args) 
	{
		
		RunnableImplOfThreadExp objExp=new RunnableImplOfThreadExp();
		Thread threadObj = new Thread(objExp);
		threadObj.start();
	}

	@Override
	public void run() {
		try {
		System.out.println("\nSub-process/Task of Thread started..");
		for (int i = 1; i <=10; i++) {
			System.out.println("JMV will call - run() - " + i + " internally to make Runnable to Running State");
				if (i % 2 != 0) {
					Thread.sleep(i);
				}
			} 
		System.out.println("\nMy Task is Done!!...");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
