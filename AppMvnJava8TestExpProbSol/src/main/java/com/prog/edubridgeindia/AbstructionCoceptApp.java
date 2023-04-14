package com.prog.edubridgeindia;

public class AbstructionCoceptApp {

	public static void main(String[] args) {
		Bajaj8937 b1= new Bajaj8937(4);
		Honda h=new Honda(5);
		b1.changeGear();
		h.changeGear();
		b1.increaseSpeed();
		h.increaseSpeed();
		Bike b=new Honda(3);
		Bike.run();
		System.out.println("Bajaj bike run smoothly on gear no"+b1.gear);
		System.out.println("Honda bike run smoothly on gear no"+h.gear);

	}

}

abstract class Bike{
	int gear;
	Bike(int gear){
		this.gear=gear;
	}
	
	abstract void changeGear();//no body: 
	
	void increaseSpeed() {
	System.out.println("Bikes Speed is increased: ");	
	}
	
	public static void run() {
		System.out.println("Bike is Running smooth");
	}
	
	public static final void accelerate() {
		System.out.println("Please use Accelerate to increase ythe bikes speed!!!");
	}
	
} 

class Bajaj8937 extends Bike {
	int eid;
	Bajaj8937(int gear) {
		super(gear);
	}

	void increaseSpeed() {
		System.out.println("Bajaj Bikes Speed is increased!!!!");
	}

	@Override
	void changeGear() {
		System.out.println("Bajaj Bikes Gear is changed");
	}

}

class Honda extends Bike{

	Honda(int gear) {
		super(gear);
		// TODO Auto-generated constructor stub
	}

	@Override
	void changeGear() {
		System.out.println("Honda's bike gear is changed!!!");
		
	}
	
}