package com.udemy.autocodinground.prep26.hashing;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5MapReversalBySwappingKeyValues {

	public static void main(String[] args) {
		Scanner scpIn = new Scanner(System.in);
		System.out.println("\nHow manay Entrys you want to added into your map : ");
		int mapSize = scpIn.nextInt();
		performMapReversalBySwappingKeyValues(mapSize);
		scpIn.close();
	}

	private static void performMapReversalBySwappingKeyValues(int mapSize) {
		Scanner scpIn = new Scanner(System.in);
		// Initialization of Map
		Map<Integer, String> lnkMap = new LinkedHashMap<>();
		Map<String,Integer> reversedMap = new LinkedHashMap<>();
		for (int i = 0; i < mapSize; i++) {
			System.out.print("Enter " + (i + 1) + " Value : ");
			String lnkValue = scpIn.nextLine();
			lnkMap.put(i,lnkValue);
		}
	System.out.println("\nInput Map : "+lnkMap);
	
	for (Map.Entry<Integer,String> entry : lnkMap.entrySet()) {
	reversedMap.put(entry.getValue(), entry.getKey());
	}
	
	System.out.println("\nTransformed Revered Map : "+reversedMap);
	scpIn.close();
	}

}