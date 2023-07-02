package com.prog.odinsexps.multithread;

public class StaticSync3MethdsApproach {

	public static void main(String[] args) {
		TableStaticSync t=new TableStaticSync();
		TableStaticSync tn=new TableStaticSync();
		
		ThreadSycT1 t1=new ThreadSycT1(t);
		ThreadSynchStaT2 t2=new ThreadSynchStaT2(tn);
		ThreadSycT1 t3=new ThreadSycT1(t);
		ThreadSynchStaT2 t4=new ThreadSynchStaT2(tn);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
}
}

class TableStaticSync {

	static void getPrintData(int n) {
		
		synchronized(TableStaticSync.class)
		{
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

class ThreadSycT1 extends Thread{
	TableStaticSync  t;
	ThreadSycT1(TableStaticSync t){
		this.t=t;
		}
	public void run() {
		TableStaticSync.getPrintData(2);
	}
	
}

class ThreadSynchStaT2 extends Thread{
	TableStaticSync t;
	ThreadSynchStaT2(TableStaticSync t){
		this.t=t;
		}
	public void run() {
		TableStaticSync.getPrintData(3);
	}
	
}