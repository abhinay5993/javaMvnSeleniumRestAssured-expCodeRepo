package com.guvi.Java8BeginnMod;
import java.util.Scanner;

@FunctionalInterface
interface CircleCompute
{
	double getAreaOfCircle(double r);
}

public class PlayWithLambdaApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		CircleCompute interRef=(r)-> {return Math.PI*r*r;};
		System.out.print("\nEnter Redious of Circle : ");
		double rd=scanner.nextDouble();
		System.out.println("\nArea Of Circle : "+interRef.getAreaOfCircle(rd));
	}

}