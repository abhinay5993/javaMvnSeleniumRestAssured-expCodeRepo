package com.prog.edubridgeindia;

public class StrImmutableClassExps {

	public static void main(String[] args) {
		String xStr="";
		//length() and capacity() both have different context
		//capacity = (2*old Capacity)+2
		StringBuffer sBuffer=new StringBuffer();
		System.out.println("\nCapacity of Empty StringBuffer : "+sBuffer.capacity());
		System.out.println("\nLength of Empty StringBuffer : "+sBuffer.length());
		System.out.println("\nAfter Append data : "+sBuffer.append("Lets!! play with StringBuffer").capacity());
		System.out.println("\nAfter Append data Length : "+sBuffer.length());
		
		StringBuilder sBuild=new StringBuilder();
		System.out.println("\nCapacity of Empty StringBuilder : "+sBuild.capacity());
		System.out.println("\nLength of Empty StringBuilder : "+sBuild.length());
		System.out.println("\nAfter Append data : "+sBuild.append("Lets!! play Builder.").capacity());
		System.out.println("\nAfter Append data Length : "+sBuild.length());
		
	}

}
