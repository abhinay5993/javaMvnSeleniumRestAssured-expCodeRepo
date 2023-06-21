package com.edubridge.designaptapps.abstractfactorypat;

import com.github.javafaker.Faker;

public class TestAbsFactoryClientDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAbsFactoryClientDP();
	}

	public static void testAbsFactoryClientDP()
	{
		Faker fac=new Faker();
		ComputerAbsCls pcFactObjRef=ComputerAbsFactoryCls.getComputersIns(new PCFactoryClsImpl("8 GB RAM","250 GB","Intel Core i5"));
		ComputerAbsCls serverFactObjRef=ComputerAbsFactoryCls.getComputersIns(new ServerFactoryClsImpl("32 GB RAM","1 TB SSD","Intel Core i9"));
		
		System.out.println("Example of Abstract Factory Design Pattern");
		System.out.println("*******************************************");
		System.out.println("\nObject data for PC : "+pcFactObjRef);
		System.out.println("\nObject data for Server : "+serverFactObjRef);
	}
}
