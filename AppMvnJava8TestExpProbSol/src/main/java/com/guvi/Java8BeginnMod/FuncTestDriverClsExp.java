package com.guvi.Java8BeginnMod;

public class FuncTestDriverClsExp implements FuncSAMTestInter,FuncTestInter{

	@Override
	public String myOS() {
		System.out.println("\nIts overidden from FuncSAMTestInter --> ");
		return "My ubantu-Linux";
	}
	
	public FuncTestDriverClsExp() {
		System.out.println("\nMy Constrcutor");
	}
	
	public static void main(String[] args) {
		FuncTestDriverClsExp testObj=new FuncTestDriverClsExp();
		System.out.println(testObj.myOS());
		System.out.println(testObj.piVal);
		System.out.println(testObj.cirPeri(5.0025));
		System.out.println(FuncTestInter.areaOfCircByRedious(9.34));
		
	}

}
