package com.udemy.sdetintcod.section4;
import java.util.LinkedHashMap;
import java.util.Map;

public class GetFirstNonRepeatedElements {

	public static void main(String[] args) {
	int[] numArray={7,4,30,5,7,7,3,4,0,1,2};
	findFirstNonRepatedItems(numArray);
	}

	private static void findFirstNonRepatedItems(int[] numArray) {
		// Store frequency of each elements
		Map<Integer, Integer> freqLnkMp = new LinkedHashMap<>();

		// push data into linkedHashMap
		for (int i : numArray) {
			freqLnkMp.put(i, freqLnkMp.getOrDefault(i, 0) + 1);
		}
		System.out.println("\nPopulated values : " + freqLnkMp);
		System.out.println("\nFirst Non-repeating element : ");

		for (Map.Entry<Integer, Integer> entry : freqLnkMp.entrySet()) {
			int key = entry.getKey();
			int val = entry.getValue();
			if (val == 1) {
				System.out.print(key+"");
				return;
			}
		}

	}

}