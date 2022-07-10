package com.prog.odinsexps.week5assign;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VehicleInventorySystem {

	static UserImpl userImpObj;
	static VehicleImpl vehicleimpl;
	static List<Vehicles> linkedListVehiObj;
	
	public static void main(String[] args) {
		userImpObj=new UserImpl();
		System.out.println("\nWelcome to AUTOSHOP WORLD!!!");
		performRegistration();
		userImpObj.getAllUserDetails();
		doLogIn() ;
	}
	
	
	public static void performRegistration() {
		try {
			Scanner sc = new Scanner(System.in);
			List<User> linkedListObj=new LinkedList<User>();
			System.out.print("\nEnter How many users you want to register : ");
			int noOfRegUser = sc.nextInt();
			for (int i = 0; i < noOfRegUser; i++) {
				String[] fNameArray = new String[noOfRegUser];
				String[] secNameArray = new String[noOfRegUser];
				String[] userNameArray = new String[noOfRegUser];
				String[] passArray = new String[noOfRegUser];

				System.out.println("\nPlease signup with your details : ");
				System.out.print("\nPlease enter your first name : ");
				fNameArray[i] = sc.next();
				System.out.print("\nPlease enter your second name : ");
				secNameArray[i] = sc.next();
				System.out.print("\nPlease enter your userName : ");
				userNameArray[i] = sc.next();
				System.out.print("\nPlease enter your password : ");
				passArray[i] = sc.next();

				User userX = new User(fNameArray[i], secNameArray[i], userNameArray[i], passArray[i]);
				linkedListObj.add(userX);
				
				if (!fNameArray[i].isEmpty() && !secNameArray[i].isEmpty() && !userNameArray[i].isEmpty()
						&& !passArray[i].isEmpty()) {
					
					if (userImpObj.addUserDetails(linkedListObj)) {
						System.out.println("\nThank you… your registration success!!!");
					} else {
						System.out.println("\nregistration failed!!!");
					}
				} else {
					System.out.println("\nAll details are mandatory hence should not be empty..");
				}
			}
		} catch (Exception e) {
			System.out.println("\nException - " + e.toString());
		}
	}
	
	
	public static void doLogIn() {
			try {
				Scanner sc1 = new Scanner(System.in);
				System.out.println("\nPlease sign with your details : ");
				System.out.print("\nPlease enter your userNname : ");
				String user = sc1.next();
				System.out.print("\nPlease enter your password : ");
				String pass = sc1.next();
				if (!user.isEmpty() && !pass.isEmpty()) {
					if (userImpObj.performLogIn(user, pass)) {
						System.out.println("\nHello!! " + user + " Welcome to Autoshop world");
						vehiclesManagementOptions();
					} else {
						System.out.println("\nInvalid!! user..");
					}
				} else {
					System.out.println("\nboth userName and password Mandatory for login and it should not be empty!!..");
				}
			}
		catch (Exception e) {
			System.out.println(e.toString());
		}

	}
	
	
	public static void vehiclesManagementOptions() {
		
		while (true) {
			int choice = 0;
			Scanner sc2 = new Scanner(System.in);
			System.out.println("\nVehicles Management Options : ");
			System.out.println("=================================");
			System.out.println("PRESS 1.New Vehicle Registration.");
			System.out.println("PRESS 2.List of Available Vehicles.");
			System.out.println("PRESS 3.Sort Result by input.");
			System.out.println("PRESS 0.Exit.");

			System.out.println("Please Enter your choice : ");
			choice = sc2.nextInt();

			switch (choice) {
			case 1:
				registerNewVehicle();
				break;
			case 2:
				if(vehicleimpl.getAllVechiclesDetails().size()>0)
				{
				vehicleimpl.getAllVechiclesDetails();
				}
				else
				{
			    System.out.println("\nNo data available!!..");
				continue;
				}
				break;
			case 3:
				System.out.println("Please enter your input as 'mfgyear' or 'price' to apply sort-filter results : ");
				String sortOption = sc2.next();
				linkedListVehiObj=vehicleimpl.getAllVechiclesDetails();
				if (sortOption.equalsIgnoreCase("mfgyear")) {
					Collections.sort(linkedListVehiObj,Comparator.comparingInt(Vehicles::getYearOfRegistration));
					System.out.println("\nList of Sorted Vechicles Items by Manufacturing Year : ");
					System.out.println("==========================================================");
					for(int i=0;i<linkedListVehiObj.size();i++)
					{
					System.out.println(" " + linkedListVehiObj.get(i).getBrandName() + "  " + linkedListVehiObj.get(i).getYearOfRegistration() + "  "
								+ linkedListVehiObj.get(i).getPrice() + " ");
					}
				} else if (sortOption.equalsIgnoreCase("price")) {
					Collections.sort(linkedListVehiObj,Comparator.comparingDouble(Vehicles::getPrice));
					System.out.println("\nList of Sorted Vechicles Items by Price : ");
					System.out.println("=============================================");
					for(int i=0;i<linkedListVehiObj.size();i++)
					{
					System.out.println(" " + linkedListVehiObj.get(i).getBrandName() + "  " + linkedListVehiObj.get(i).getYearOfRegistration() + "  "
								+ linkedListVehiObj.get(i).getPrice() + " ");
					}
				} else {
					System.out.println("\nWrong!! input..");
				}
				break;
			case 0:
				System.out.println("\nGood Bye!!..");
				System.exit(choice);
				break;
			default:
				continue;
			}

		}

	}
	
	
	public static void registerNewVehicle()
	{
		try {
			vehicleimpl=new VehicleImpl();
			Scanner sc3 = new Scanner(System.in);
			linkedListVehiObj=new LinkedList<>();
			System.out.print("\nEnter How many Vehicles you want to register : ");
			int noOfRegVehicles = sc3.nextInt();
			for (int i = 0; i < noOfRegVehicles; i++) {
				String[] vBrandNameArray = new String[noOfRegVehicles];
				int[] vYearOfRegArray = new int[noOfRegVehicles];
				double[] vehiPriceArray = new double[noOfRegVehicles];
				
				System.out.println("\nPlease enter Vehicles details : ");
				System.out.print("\nPlease enter Vehicle Brand name : ");
				vBrandNameArray[i] = sc3.next();
				System.out.print("\nPlease enter Vehicle Registration Year : ");
				vYearOfRegArray[i] = sc3.nextInt();
				System.out.print("\nPlease enter Vehicle Price : ");
				vehiPriceArray[i] = sc3.nextDouble();
				
				Vehicles vehiclesObjX = new Vehicles(vBrandNameArray[i],vYearOfRegArray[i],vehiPriceArray[i]);
				linkedListVehiObj.add(vehiclesObjX);
				
				if (!vBrandNameArray[i].isEmpty()) {
					if (vehicleimpl.addVechiclesDetails(linkedListVehiObj)) {
						System.out.println("\nThank you… your Vehicle registered successfully!!!");
					} else {
						System.out.println("\nregistration failed!!!");
					}
				} else {
					System.out.println("\nInvalid details entered!!..");
				}
			}
		} catch (Exception e) {
			System.out.println("\nException - " + e.toString());
		}
	}
	
	
}