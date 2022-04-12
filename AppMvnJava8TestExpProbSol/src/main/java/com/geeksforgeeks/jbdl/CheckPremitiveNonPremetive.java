package com.geeksforgeeks.jbdl;

public class CheckPremitiveNonPremetive {

	public static void main(String[] args) {
		int intData=499943;
		Object objCommon=intData;
		System.out.println("data type : "+objCommon.getClass().isPrimitive());
		System.out.println("data type : "+objCommon.getClass().isSynthetic());
		boolean bol=objCommon.getClass().getName().contains("Int")==Integer.class.isInstance(objCommon);
		System.out.println("data tAppp Team type : "+bol);
		
		System.out.println("\nSize of Long type : "+Long.BYTES);
		System.out.println("\nSize of Double type : "+Double.BYTES);
		
		System.out.println("\nSize of Int type : "+Integer.BYTES);
		System.out.println("\nSize of float type : "+Float.BYTES);
		
		System.out.println("\nSize of Char type : "+Character.BYTES);
		System.out.println("\nSize of Short type : "+Short.BYTES);
		
		System.out.println("\nSize of Byte type : "+Byte.BYTES);
		
		System.out.println("\n **************** Address computation ********************* ");
		int testInt[]= {1,3,5,7,9,11,13,19};
		for (int i=0;i<testInt.length;i++)
		{
		System.out.println("\nposition --> "+i+" Address of "+testInt[i]+" : ==> "+String.valueOf(testInt[i]).hashCode());
		}
		
	}
	

}