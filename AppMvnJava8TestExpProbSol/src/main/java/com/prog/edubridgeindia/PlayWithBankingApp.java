package com.prog.edubridgeindia;

/*
Case study: 
Bank class : MM: : getIRateOfIntersest(){3.5}
SBI: getIRateOfIntersest(){3.5}
AXIX: {4.0}
HDFC: {4.5}
*/

public class PlayWithBankingApp {

	public static void main(String[] args) {
		RBIBase objRefOfRbi=new RBIBase(10.5);
		RBIBase objRefOfSbi=new SBIBank(8.5);
		RBIBase objRefOfAxis=new AxisBank(6.5);
		RBIBase objRefOfhdfc=new HDFCBank(7.1);
		System.out.println("\nRBI intrest rate : "+objRefOfRbi.getIRateOfIntersest());
		System.out.println("\nSBI intrest rate : "+objRefOfSbi.getIRateOfIntersest());
		System.out.println("\nAxis intrest rate : "+objRefOfAxis.getIRateOfIntersest());
		System.out.println("\nHDFC intrest rate : "+objRefOfhdfc.getIRateOfIntersest());
		
		SBIBank objRefOfSbi1=new SBIBank(8.5);
		RBIBase obj = new RBIBase(0);
//		RBIBase objRefOfAxis=new AxisBank(6.5);
//		RBIBase objRefOfhdfc=new HDFCBank(7.1);
		System.out.println("\nRBI intrest rate : "+obj.getIRateOfIntersest());
		System.out.println("\nSBI intrest rate : "+objRefOfSbi1.getIRateOfIntersest());
		
	}
	
	public RBIBase getRBIApp(double interRate) {
		return new RBIBase(interRate);
	}

}

class RBIBase
{
	double interRate;
	RBIBase(double interReate)
	{
		this.interRate=interReate;
	}
	
	public double getIRateOfIntersest()
	{
		return interRate;
	}
}

class SBIBank extends RBIBase
{

	double sbiInterRate;
	SBIBank(double interReate) {
		super(interReate);
		this.sbiInterRate=interReate;
	}
	
	public double getIRateOfIntersest()
	{
		return sbiInterRate;
	}
	
}

class AxisBank extends RBIBase
{

	double axisInterRate;
	AxisBank(double interReate) {
		super(interReate);
		this.axisInterRate=interReate;
	}

	public double getIRateOfIntersest()
	{
		return axisInterRate;
	}
	
}

class HDFCBank extends RBIBase
{

	double hdfcInterRate;
	HDFCBank(double interReate) {
		super(interReate);
		this.hdfcInterRate=interReate;
	}

	public double getIRateOfIntersest()
	{
		return hdfcInterRate;
	}
	
}