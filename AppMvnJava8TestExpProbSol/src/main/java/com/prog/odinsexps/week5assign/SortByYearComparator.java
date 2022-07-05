package com.prog.odinsexps.week5assign;
import java.util.Comparator;

public class SortByYearComparator implements Comparator<Vehicles>{

	@Override
	public int compare(Vehicles o1, Vehicles o2) {
		if (o1.getYearOfRegistration() > o2.getYearOfRegistration()) {
			return 1;
		} else if (o1.getYearOfRegistration() < o2.getYearOfRegistration()) {
			return -1;
		} else {
			return 0;
		}
	}

}