package com.prog.edubridgeindia.collecFmwrks;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTestingExp {

	public static void main(String[] args) {

		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(6, "varchas");
		hm.put(5, "Arvind");
		hm.put(2, "Vishal");
		hm.put(4, "Selva");
		hm.put(3, "Selva");
		hm.put(10, "XYZ");
		hm.put(11, null);
		hm.put(12, null);

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

	}

}