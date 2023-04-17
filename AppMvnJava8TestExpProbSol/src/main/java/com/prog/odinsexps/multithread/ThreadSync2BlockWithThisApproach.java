package com.prog.odinsexps.multithread;

public class ThreadSync2BlockWithThisApproach {

	public static void main(String[] args) {
		TableDat t=new TableDat();
		ThreadTh1 t1=new ThreadTh1(t);
		ThreadTh2 t2=new ThreadTh2(t);
		t1.start();
		t2.start();

	}

}

class TableDat {
	public void printTable(int n) {
		synchronized (this) {
			System.out.println("\n synchronized (this) block called");
			for (int i = 1; i <= 10; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
}

class ThreadTh1 extends Thread{
	TableDat t;
	ThreadTh1(TableDat t){
		this.t=t;
		}
	public void run() {
		t.printTable(2);
	}
	
}

class ThreadTh2 extends Thread{
	TableDat t;
	ThreadTh2(TableDat t){
		this.t=t;
		}
	public void run() {
		t.printTable(3);
	}
	
}