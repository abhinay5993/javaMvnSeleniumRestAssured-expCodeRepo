package com.prog.odinsexps.week5assign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class VehicleImpl implements IVechicle {

	List<Vehicles> vehiclesCollect;
	ArrayList<Vehicles> vehiclesArrayListObj;
	
	@Override
	public boolean addVechiclesDetails(List<Vehicles> lnkVehiObj) {
		vehiclesCollect = new LinkedList<Vehicles>();
		return vehiclesCollect.addAll(lnkVehiObj);
	}

	@Override
	public ArrayList<Vehicles> getAllVechiclesDetails() {
		try {
			vehiclesArrayListObj = new ArrayList<Vehicles>(vehiclesCollect);
			Iterator<Vehicles> itr = vehiclesArrayListObj.iterator();
			System.out.println("\nList of Registered Vechicles Count : " + vehiclesArrayListObj.size());
			System.out.println("\nList of Available Vehicles : ");
			System.out.println("\n==============================");
			while (itr.hasNext()) {
				Vehicles vehiObj = itr.next();
				System.out.println(" " + vehiObj.getBrandName() + "  " + vehiObj.getYearOfRegistration() + "  "
						+ vehiObj.getPrice() + " ");
			}
		} catch (Exception e) {
			System.out.println("\nException - " + e.toString());
		}
		return vehiclesArrayListObj;
	}
	
}