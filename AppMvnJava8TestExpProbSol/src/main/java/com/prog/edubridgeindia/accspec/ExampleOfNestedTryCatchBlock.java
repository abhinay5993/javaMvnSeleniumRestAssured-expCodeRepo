package com.prog.edubridgeindia.accspec;
import java.util.Date;

public class ExampleOfNestedTryCatchBlock {

	public static void main(String[] args) {
		
		try {// outer try
			try {// inner: 1
				int a = 20 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			System.out.println("I am out side 1st inner try and catch");
			try {// inner:2
				int[] a = new int[5];
				a[6] = 100;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("I am out side 2nd inner try and catch");

			String str = new String();
			str = null;
			System.out.println(str.length());

		} catch (NullPointerException e) {
			System.out.println(e);

		}
		finally {
			System.out.println("\nLets!!... release my resources "+new Date()+"");
		}
		System.out.println("I am outside Outer try and catch");
	}

}