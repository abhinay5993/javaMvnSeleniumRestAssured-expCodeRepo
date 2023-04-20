package com.prog.edubridgeindia.collecFmwrks;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExampleForHashCodes {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Varchas");
		hs.add("Satyam");
		hs.add("Vishal");
		hs.add("Arvaind");

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		HashSet<String> cloneh = new HashSet<String>();
		cloneh = (HashSet) hs.clone();
		System.out.println(cloneh);
		System.out.println(hs.hashCode());
		System.out.println(cloneh.hashCode());
		hs.add("Abhijeet");
		System.out.println(hs);
		System.out.println(cloneh);
		cloneh.add("XYZ");
		System.out.println(hs);
		System.out.println(cloneh);
	}

}
