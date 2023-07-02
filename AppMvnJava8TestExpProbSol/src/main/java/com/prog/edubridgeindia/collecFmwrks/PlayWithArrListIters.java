package com.prog.edubridgeindia.collecFmwrks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PlayWithArrListIters {

	public static void main(String[] args) {
		List<String> lstItem=new ArrayList<>();
		lstItem.add("Hello GFG");
		lstItem.add("J2SE");
		lstItem.add("JDBC");
		lstItem.add("My-SQL");
		lstItem.add("Android");
		lstItem.add("Push Data");
	
		//Using Iterator
		Iterator<String> itr=lstItem.iterator();
		while (itr.hasNext()) {
			System.out.println("\nIterable Items : "+itr.next());
		}
		//Sorting Objects
		Collections.sort(lstItem);
		//Using Java-8 forEach()
		lstItem.forEach(item -> System.err.println("\nSorted Data Items : "+item));
		
	}

}
