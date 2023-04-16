package com.prog.odinsexps.multithread;

public class ExecThreadClientApp {

	public static void main(String[] args) {
		System.out.println("\nMain users Thread with main() started : "+Thread.currentThread());
		
		//Create Obj of User defined Thread1
		Thread userDef1=new CustUserDefThreadByExtdning("Prime-Cust-Thread-1");
		Thread userDef2=new CustUserDefThreadByExtdning("Play-VIIP-CustThread-2");
		
		//Create Obj of User defined for Marking them for Demons
		Thread userDef3=new CustUserDefThreadByExtdning("SDET-Demon-1");
		Thread userDef4=new CustUserDefThreadByExtdning("AL-Demon-2");
		//Marking userDef3,userDef4 as Demon
		userDef3.setDaemon(true);
		userDef4.setDaemon(true);
		//Demon thread stared
		userDef3.start();
		userDef4.start();
//		userDef3.stop();
//		userDef4.stop();
		//user thread stared
		userDef1.start();
		userDef2.start();
		
		System.out.println("\nMain users Thread Exit!!");
	}

}