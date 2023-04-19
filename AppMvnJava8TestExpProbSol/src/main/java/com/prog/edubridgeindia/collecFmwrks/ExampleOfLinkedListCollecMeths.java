package com.prog.edubridgeindia.collecFmwrks;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * 
 * boolean add(E e);
 * void add(Index no, E e)
 * boolean addAll( Collection c)
 * void addFirst()
 * void addLast()
 * boolean offer(E e )
 * boolean offerFirst(E e)
 * boolean offerLast(E e );
 * E peek()
 * E peekFirst()
 * E peekLast()
 * E Poll(): remove that element from the List
 * E pollFirst()
 * E pollLast()
 * Void push(E e): 
 * E pop();
 * E remove()
 * 
 */

public class ExampleOfLinkedListCollecMeths {

	public static void main(String[] args) {
		
		LinkedList<String> ename = new LinkedList<String>();
		ename.add("Satyam");
		ename.add("Arvind");
		ename.add("Varchas");
		ename.add("Mohnisha");
		ename.offer("Abhinay");
		ename.offerFirst("Welcome");
		ename.offerLast("Bye BYe");
		ename.push("EduBridge!!!");
		ename.pop();
		ename.set(0, "Java fullstack");
		System.out.println("\nLinked List Items : "+ename);
		System.out.println("\n using peek() : "+ename.peek());
		System.out.println("\n using peekFirst() : "+ename.peekFirst());
		System.out.println("\n using peekLast() : "+ename.peekLast());
		System.out.println("\n using remove() : "+ename.remove());
		System.out.println("\n using remove(5) : "+ename.remove(5));
		System.out.println("\nLinked List Items : "+ename);
		System.out.println(ename.get(0));
		System.out.println("---------------------");
		Iterator itr = ename.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
