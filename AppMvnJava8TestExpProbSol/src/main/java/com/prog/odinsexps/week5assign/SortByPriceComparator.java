package com.prog.odinsexps.week5assign;
import java.util.Comparator;

public class SortByPriceComparator implements Comparator<Vehicles>{

	@Override
	public int compare(Vehicles o1, Vehicles o2) {
		if (o1.getPrice() > o2.getPrice()) {
			return 1;
		} else if (o1.getPrice() < o2.getPrice()) {
			return -1;
		} else {
			return 0;
		}
	}

}