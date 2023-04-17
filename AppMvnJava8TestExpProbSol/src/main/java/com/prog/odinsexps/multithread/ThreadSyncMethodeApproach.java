package com.prog.odinsexps.multithread;

public class ThreadSyncMethodeApproach {

	public static void main(String[] args) {
		Table t=new Table();
		ThreadT1 t1=new ThreadT1(t);
		ThreadT2 t2=new ThreadT2(t);
		t1.start();
		t2.start();

	}

}

class Table{
	synchronized public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
}

class ThreadT1 extends Thread{
	Table t;
	ThreadT1(Table t){
		this.t=t;
		}
	public void run() {
		t.printTable(2);
	}
	
}

class ThreadT2 extends Thread{
	Table t;
	ThreadT2(Table t){
		this.t=t;
		}
	public void run() {
		t.printTable(3);
	}
	
}