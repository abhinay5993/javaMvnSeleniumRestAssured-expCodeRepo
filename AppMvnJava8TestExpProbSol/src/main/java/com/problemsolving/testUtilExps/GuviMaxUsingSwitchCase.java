package com.problemsolving.testUtilExps;
import java.util.Scanner;

public class GuviMaxUsingSwitchCase {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter First Number : ");
		int numOne=sc.nextInt();
		System.out.println("\nEnter 2nd Number : ");
		int numTwo=sc.nextInt();
		System.out.println("\nThe Max Between two numbers : "+getMaxBySwitchCase(numOne,numTwo));
	}
	
	public static int getMaxBySwitchCase(int num1, int num2) {
		int maxNum = (num1 > num2) ? 1 : 0;
		switch (maxNum) {
		case 0:
			maxNum = num2;
			break;
		case 1:
			maxNum = num1;
			break;
		}
		return maxNum;
	}

}
