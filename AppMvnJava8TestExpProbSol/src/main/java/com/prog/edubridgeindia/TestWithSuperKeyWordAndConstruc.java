package com.prog.edubridgeindia;

public class TestWithSuperKeyWordAndConstruc {

	public static void main(String[] args) {
		SuperChild sc = new SuperChild();
		sc.showValue();

	}

}

class Superparent {
	static int a = 100;

	public void showData() {
		System.out.println("Value of a=" + a);
	}
}

class SuperChild extends Superparent {
	static int a = 200;

	public void showValue() {
		int a = 300;
		System.out.println(Superparent.a);
		super.showData();
	}
}