package com.prog.odinsexps.collect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExampleImpl {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(34.55);
		al.add("Rahul");
		al.add(988858585);
		al.add(45.98f);
		al.add(true);
		al.add(67);
		al.add(2,50);
		al.add(50);
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		al.remove("Rahul");
		al.remove(2);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		al.set(2,40);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.contains(true));
		//al.clear();
		//System.out.println(al.clear());
		//System.out.println(al);

		ArrayList al1 = new ArrayList();
		al1.add(35);
		al1.add(45);
		al1.addAll(al);
		System.out.println(al1);
		System.out.println(al1.size());

		//get the array values one by one
		//cursors
		Iterator it = al1.iterator();
		while(it.hasNext())
		{
		Object o = it.next();
		System.out.println(o);
		}

		ListIterator litr = al1.listIterator();
		System.out.println("forward direction");
		while(litr.hasNext())
		{
		Object o = litr.next();
		System.out.println(o);
		}
		System.out.println("backward direction");
		while(litr.hasPrevious())
		{
		Object o = litr.previous();
		System.out.println(o);
		}

		//for-each
		for(Object o:al1)
		{
		System.out.println(o);
		}
	}
}
