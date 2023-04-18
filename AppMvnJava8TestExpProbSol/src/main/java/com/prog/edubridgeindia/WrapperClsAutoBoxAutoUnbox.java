package com.prog.edubridgeindia;

public class WrapperClsAutoBoxAutoUnbox {

	public static void main(String[] args) {
		int a=10;///primitive a is varible
		//explicite boxing:
		Integer i=Integer.valueOf(a);//explicitly
		Integer j=a;//AutoBoxing bt they are objects
		System.out.println(a+" "+i+" "+j);
		int b=i.intValue();
		int c=i;
		System.out.println(b+" "+c);

	}

}