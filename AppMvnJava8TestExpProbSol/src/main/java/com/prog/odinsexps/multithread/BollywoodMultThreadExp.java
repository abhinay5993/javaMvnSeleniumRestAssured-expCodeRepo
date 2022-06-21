package com.prog.odinsexps.multithread;
import java.util.Scanner;

public class BollywoodMultThreadExp implements Runnable {
	
	public void printMsgBySalMan() throws InterruptedException
	{
		for (int i = 1; i <= 10; i++) {
			System.out.println("\nsalman Movies-" + i);
			Thread.sleep(1000);
		}
	}
	
	@Override
	public synchronized void run() {
		try {
			String getThreadVal = Thread.currentThread().getName();
			if (getThreadVal.equalsIgnoreCase("salman") || getThreadVal.equalsIgnoreCase("all")) {
				printMsgBySalMan();
			} else {
				System.out.println("loading....Wrong!! Choice...");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	

	public static void main(String[] args) {
		Thread search2Thread;
		Thread searchThread;
		String searItem;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("\nPlease enter your input to search: ");
			searItem = sc.next();
			searchThread = new Thread(new BollywoodMultThreadExp(), searItem);
			searchThread.start();
			search2Thread = new Thread(new AllBollyWoodFilterAppExp(), searItem);
			search2Thread.start();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
}

