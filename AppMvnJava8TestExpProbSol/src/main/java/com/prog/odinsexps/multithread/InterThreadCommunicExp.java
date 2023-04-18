package com.prog.odinsexps.multithread;

public class InterThreadCommunicExp {

	public static void main(String[] args) {

		Customer1 c = new Customer1();
		ThreadWith t1 = new ThreadWith(c);
		ThreadDep t2 = new ThreadDep(c);
		t1.start();
		t2.start();

	}

}

class Customer1 {
	int amount = 5000;

	synchronized void withdraw(int amount) { // lock
		System.out.println("Lets Withdrow some amount");
		if (this.amount < amount) {
			System.out.println("Your balnace is Low; waiting for deposit...");
			try {
				wait();// released that
			} catch (InterruptedException e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("Lets deposit some amount");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notifyAll();
	}
}

class ThreadWith extends Thread {
	Customer1 c;

	ThreadWith(Customer1 c) {
		this.c = c;
	}

	public void run() {
		c.withdraw(7000);
	}
}

class ThreadDep extends Thread {
	Customer1 c;

	ThreadDep(Customer1 c) {
		this.c = c;
	}

	public void run() {
		c.deposit(3000);
	}
}