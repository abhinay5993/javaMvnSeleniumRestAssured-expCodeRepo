package com.problemsolving.testUtilExps;

public class GuviStringManipulationApp {
	
	public static void main(String[] args) {
		
		String address1 = " Mr.Jack,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
		String address2 = " Ms Jill,Door No 53,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
		String address3 = " Mr Holmes,Door No 13,Valmiki Street,32d Main Road,Saidapet,Chennai,Pin-600115";
		String address4 = " Mr.Davinci,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
		
		extractNamesFromAddress(address1, address2, address3, address4);
		isPincodePresent(address1, address2, address3, address4);
		isStreetNameExitsInAddress(address1, address2, address3, address4,"600115");
	}
	
	public static void extractNamesFromAddress(String add1,String add2,String add3,String add4)
	{
		String address1Data[]=add1.split(",");
		String address2Data[]=add2.split(",");
		String address3Data[]=add3.split(",");
		String address4Data[]=add4.split(",");
		System.out.println("\nNames : ");
		System.out.println("\n "+address1Data[0]+" ");
		System.out.println("\n "+address2Data[0]+" ");
		System.out.println("\n "+address3Data[0]+" ");
		System.out.println("\n "+address4Data[0]+" ");
	}
	
	public static void isPincodePresent(String add1, String add2, String add3, String add4) {
		String address1Data[] = add1.split(",");
		String address2Data[] = add2.split(",");
		String address3Data[] = add3.split(",");
		String address4Data[] = add4.split(",");
		int lenOfAdd1 = address1Data.length;
		int lenOfAdd2 = address2Data.length;
		int lenOfAdd3 = address3Data.length;
		int lenOfAdd4 = address4Data.length;

		if (address1Data[lenOfAdd1 - 1].contains("Pin-") && address2Data[lenOfAdd2 - 1].contains("Pin-")
				&& address3Data[lenOfAdd3 - 1].contains("Pin-") && address4Data[lenOfAdd4 - 1].contains("Pin-")) {
			System.out.println("\nPINCODE available into address");
		} else {
			System.out.println("\nPINCODE not-available into address");
		}
	}
	
	public static void isStreetNameExitsInAddress(String add1, String add2, String add3, String add4,String searchAddress) {
		String address1Data[] = add1.split(",");
		String address2Data[] = add2.split(",");
		String address3Data[] = add3.split(",");
		String address4Data[] = add4.split(",");
		
		for(int i=0;i<address1Data.length;i++)
		{
			if(address1Data[i].equalsIgnoreCase(searchAddress))
			{
				System.out.println("\n Address : "+add1);
			}
		}
		
		for(int i=0;i<address2Data.length;i++)
		{
			if(address2Data[i].equalsIgnoreCase(searchAddress))
			{
				System.out.println("\n Address : "+add2);
			}
		}
		
		for(int i=0;i<address3Data.length;i++)
		{
			if(address3Data[i].equalsIgnoreCase(searchAddress))
			{
				System.out.println("\n Address : "+add3);
			}
		}
		
		for(int i=0;i<address4Data.length;i++)
		{
			if(address4Data[i].equalsIgnoreCase(searchAddress))
			{
				System.out.println("\n Address : "+add4);
			}
		}
				
	}
	
}