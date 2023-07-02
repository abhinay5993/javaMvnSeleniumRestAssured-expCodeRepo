package com.guvi.Java8BeginnMod;

/*
 * Annonimous Inner class can be achived using - Abstarct class and Interface
 * 
 */

abstract class AbsTestCar {
	abstract void increasedSpeed();
}

public class AnnonimusInnerClsExp {

	public static void main(String[] args) {

		AbsTestCar t = new AbsTestCar() {

			{
				System.out.println("\nInside Inner classes Instance block");
			}

			public void increasedSpeed() {
				System.out.println("Car's Speed is being increased");
			}
		};

		t.increasedSpeed();
	}

}