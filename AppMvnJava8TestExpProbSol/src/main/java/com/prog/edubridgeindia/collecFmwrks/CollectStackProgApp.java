package com.prog.edubridgeindia.collecFmwrks;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class CollectStackProgApp {

	public static void main(String[] args) {
		Stack<String> s1=new Stack<String>();
		System.out.println(s1.empty());
		s1.push("orange");
		s1.push("Apple");
		s1.push("Banana");
		Random xRandom=new Random();
		for(int i=0;i<=20;i++)
		{
			s1.push("ALRaand"+xRandom.nextInt());
		}
		
		System.out.println(s1.peek());
		System.out.println(s1.search("Banana"));
		System.out.println(s1);
		Collections.sort(s1);
		System.out.println(s1);
		
	}

}