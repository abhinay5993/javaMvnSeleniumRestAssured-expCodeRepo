package com.prog.odinsexps.week5assign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class VehicleImpl implements IVechicle {

	LinkedList<Vehicles> linkedVehicles;
	
	@Override
	public boolean addVechiclesDetails(Vehicles vehicObj) {
		LinkedList<Vehicles> linkedUserObj = new LinkedList<>();
		return linkedUserObj.add(vehicObj);
	}

	@Override
	public void getAllVechiclesDetails() {
		ArrayList<Vehicles> arrayList = new ArrayList<Vehicles>(linkedVehicles);
		
		Iterator<Vehicles> itr = arrayList.iterator();
		System.out.println("\nList of Available Vehicles : ");
		System.out.println("\n==============================");
		while (itr.hasNext()) {
			Vehicles vehiObj = itr.next();
			System.out.println(" " + vehiObj.getBrandName() + "  " + vehiObj.getYearOfRegistration() + "  "+ vehiObj.getPrice()+ " ");
		}
	}
	
}