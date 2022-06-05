package com.prog.odinsexps.collect;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListCollectionsExp {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(10);
		al.add(40);
		al.add(30);
		//al.add("Rahul");
		al.add(60);
		al.add(50);

		System.out.println(al);
		System.out.println(al.size());

		al.remove(2);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		al.set(2,40);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.contains(40));

		LinkedList<Integer> al1 = new LinkedList<Integer>();
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

		Collections.sort(al1);
		System.out.println("after sorting");
		System.out.println(al1);
	}
}
