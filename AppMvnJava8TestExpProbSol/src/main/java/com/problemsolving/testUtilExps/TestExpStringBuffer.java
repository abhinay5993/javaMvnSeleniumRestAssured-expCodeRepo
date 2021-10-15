package com.problemsolving.testUtilExps;

public class TestExpStringBuffer {
	
	public static void main(String[] args) {
		System.out.println("\nDifferenec between String and StringBuffer : ");
		
		String x=new String("CL-SDET-Immuteable");
		String g=x.concat("_SivaVimal");
		System.out.println("\nWith String Class Obj Creation : "+g);
		
		StringBuffer sb=new StringBuffer("MuteableApp_Str");
		StringBuffer sb1=sb.append("SDET-Conact");
		System.out.println("\nWith StringBuffer Class : "+sb1);
		
		
		
		
	}

}