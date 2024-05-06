package com.udemy.dsapart1.stacks;
import java.util.Scanner;
import java.util.Stack;

public class StackBalancedStringChecker {
	
	public static void main(String[] args) {
	Scanner scInpObj = new Scanner(System.in);
	System.out.print("\nEnter the input string : ");
	String inputStr = scInpObj.nextLine();
	System.out.println("\nCheck is the input string is balanced : "+isStringBalanced(inputStr));
	}

	private static boolean isStringBalanced(String inputStr) {
	Stack<Character> stackDat = new Stack();
	for (char chItems : inputStr.toCharArray()) 
	{
	     if (chItems == '(' || chItems == '{' || chItems == '[') {
			 stackDat.push(chItems);
	     }
	     else if (chItems == ')' || chItems == '}' || chItems == ']') 
	     {
		 char topCharDat = stackDat.pop();
		 if ((topCharDat == '(' && chItems != ')') || (topCharDat == '{' && chItems != '}') || (topCharDat == '[' && chItems != ']')) {
			 return false;
		  }
		 }
	}
	return stackDat.isEmpty();
	}

}