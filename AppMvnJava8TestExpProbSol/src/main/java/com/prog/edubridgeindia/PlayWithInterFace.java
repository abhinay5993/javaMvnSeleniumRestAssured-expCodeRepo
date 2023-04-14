package com.prog.edubridgeindia;

public class PlayWithInterFace implements I1, I2 {

	public static void main(String[] args) {
		PlayWithInterFace e = new PlayWithInterFace();
		e.running();
		e.changeGear();
		e.accelerate();
		I2.print();

	}

	@Override
	public void running() {
		System.out.println("Inteface method running is implemented in Class");

	}

	@Override
	public void changeGear() {
		System.out.println("Bikes gear need to change!!");

	}

}

interface I1 {
	public void running();

	default public void accelerate() {
		System.out.println("Please accelerate bike!!!");
		showPrivate();
	}

	private void showPrivate() {
		System.out.println("I am private method andd I can be called only through Default and static");
	}

}

interface I2 {
	public void changeGear();

	public static void print() {
		System.out.println("I am Static method!!!!");
	}
}

