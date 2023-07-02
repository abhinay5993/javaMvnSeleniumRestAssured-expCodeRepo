package com.guvi.Java8BeginnMod;

public class StaticNestedClsExpTest {

	int a = 100;
	static int b = 200;

	static class Inner1 {
		void getData() {
			System.out.println("\nStatic member of outer class : " + b);
		}
	}

	public static void main(String[] args) {
		StaticNestedClsExpTest.Inner1 in = new StaticNestedClsExpTest.Inner1();
		in.getData();
	}

}