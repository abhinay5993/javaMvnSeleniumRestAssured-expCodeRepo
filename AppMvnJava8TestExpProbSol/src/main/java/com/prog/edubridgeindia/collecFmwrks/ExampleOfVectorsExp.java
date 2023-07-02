package com.prog.edubridgeindia.collecFmwrks;
import java.util.Collections;
import java.util.Vector;

/*
 * add()
 * addAll()
 * addElement()
 * capacity()
 * clear()
 * contains()
 * containsAll()
 * equals()
 * firstElemet();
 * lastElement()
 * get()
 * indexOf()
 * insertElement()
 * isEmpty()
 * iterator() 
 * remove()
 * removeAll();
 * sort()
 * 
 */

public class ExampleOfVectorsExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vecObjs=new Vector<String>();
		Vector<Double> vec1Objs=new Vector<Double>(10);
		Vector<String> vec2Objs=new Vector(5,20);
		System.out.println("Before Adding to vector capacity() : "+vecObjs.capacity());
		System.out.println("Before Adding to vector size() : "+vecObjs.size());
		
		//addming some items to vector :
		vecObjs.add("Day1");
		vecObjs.add("Thread-Safe");
		vecObjs.add("Multthread Env");
		vecObjs.add("Tsdjfkfjkf");
		vecObjs.add("Msfkdjfjkjfkj");
		vecObjs.add(5,"CaratLane");
		vecObjs.add("AL!!");
		System.out.println("After Adding to vector capacity() : "+vecObjs.capacity());
		System.out.println("After Adding to vector size() : "+vecObjs.size());
		System.out.println("\nVector Data : "+vecObjs);
		
		//for vec1Objs
		System.out.println("Before Adding to vector capacity() : "+vec1Objs.capacity());
		System.out.println("Before Adding to vector size() : "+vec1Objs.size());
		vec1Objs.add(757.595);
		vec1Objs.add(-45.455);
		vec1Objs.add(7.0);
		vec1Objs.add(0.4550);
		vec1Objs.add(-5.350);
		vec1Objs.add(3848.00034);
		System.out.println("\nVector Data : "+vec1Objs);
		//Sort Items 
		Collections.sort(vec1Objs);
		System.out.println("After Adding to vector capacity() : "+vec1Objs.capacity());
		System.out.println("After Adding to vector size() : "+vec1Objs.size());
		System.out.println("\nVector Data : "+vec1Objs);
		
	}

}