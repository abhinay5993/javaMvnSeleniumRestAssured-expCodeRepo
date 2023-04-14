package com.prog.edubridgeindia;

/*

compile and generate class file inside package directory-
- javac -d ./<path package> <java-class-source-file>.java
- class inside package should have first statement into class as - package <folder/dir name>
- caller class should use first statement into class as - import <folder/dir name>.<java-source-class-name>
- The imported class should be diclared as public into created package.

*/

class ExampleOfPrivateInterfaceMeths implements I3, I4 {

	public static void main(String[] args) {
		ExampleOfPrivateInterfaceMeths a = new ExampleOfPrivateInterfaceMeths();
		a.x();
		a.y();
		a.p();
	}

	public void y() {
		System.out.println("I am from interface I2");
	}

	@Override
	public void p() {
		System.out.println("Hello");
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub

	}

}

interface I3 {
	public void x();

	default public void p() {
		System.out.println("I am default from I3");
	}
}

interface I4 {
	public void y();

	default public void p() {
		System.out.println("I am default from I4");
	}
}