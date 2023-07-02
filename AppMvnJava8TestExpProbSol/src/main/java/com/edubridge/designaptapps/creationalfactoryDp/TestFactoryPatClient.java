package com.edubridge.designaptapps.creationalfactoryDp;

public class TestFactoryPatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerAbsCls pcComObj=ComputerAppFactoryCls.getComputerInstance("pc","4 GB","512 GB","Intel Core i3");
		ComputerAbsCls servNodeObj=ComputerAppFactoryCls.getComputerInstance("ser","32 GB","2 TB","Intel Core i9");
		ComputerAbsCls servNodeObj1=ComputerAppFactoryCls.getComputerInstance(" ","32 GB","2 TB","Intel Core i9");
		
		System.out.println("\nThis is Implimentation of Factory --> Creational Design pattern.");
		System.out.println("********************************************************************");
		System.out.println("\nPC data : "+pcComObj);
		System.out.println("\nServer data : "+servNodeObj);
		System.out.println("\nError data : "+servNodeObj1);
		
	}

}
