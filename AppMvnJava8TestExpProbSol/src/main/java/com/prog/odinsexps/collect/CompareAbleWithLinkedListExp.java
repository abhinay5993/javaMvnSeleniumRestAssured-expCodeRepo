package com.prog.odinsexps.collect;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class Signup implements Comparable<Signup> {
	String firstName, lastName, gender;
	long mobilenumber;

	public Signup(String firstName, String lastName, String gender, long mobilenumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobilenumber = mobilenumber;
	}

	@Override
	public int compareTo(Signup o) {
// TODO Auto-generated method stub
		if (mobilenumber == o.mobilenumber)

			return 0;

		else if (mobilenumber < o.mobilenumber)
			return 1;
		else
			return -1;
	}

}

public class CompareAbleWithLinkedListExp {

	public static void main(String[] args) {

		LinkedList<Signup> al = new LinkedList();
		al.add(new Signup("rahul", "sharma", "male", 9585858589l));
		al.add(new Signup("divya", "sri", "female", 9858557558l));
		al.add(new Signup("anu", "sree", "female", 7565664646l));
		al.add(new Signup("rahul", "sharma", "male", 9585858589l));
		Collections.sort(al);
		Iterator<Signup> it = al.iterator();
		while (it.hasNext()) {
			Signup s = it.next();
			System.out.println(s.firstName + " " + s.lastName + " " + s.gender + " " + s.mobilenumber);
		}
		System.out.println(al.size());

	}

}