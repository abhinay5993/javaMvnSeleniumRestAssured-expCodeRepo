package com.udemy.sdetintcod.section1;
import java.util.Scanner;

public class GenerateFinbonaciSeries {

	public static void main(String[] args) {
	Scanner scInput = new Scanner(System.in);
	System.out.print("\nEnter the N-th digit of Fibonaci series : ");
	long nThTerm = scInput.nextLong();
	getListOfFibonaciSeries(nThTerm);
	scInput.close();
	}

	//0 1 1 2 3 5 8
	private static void getListOfFibonaciSeries(long nThTerm) {
		long firstNum=0,secNum=1,nextNum;
		System.out.println("\nPopulated Fibonaci Series : ");
		for (long i = 1; i <= nThTerm; i++) {
		System.out.print(" "+firstNum+", ");
		nextNum=firstNum+secNum;
		firstNum=secNum;
		secNum=nextNum;
		}

	}

}