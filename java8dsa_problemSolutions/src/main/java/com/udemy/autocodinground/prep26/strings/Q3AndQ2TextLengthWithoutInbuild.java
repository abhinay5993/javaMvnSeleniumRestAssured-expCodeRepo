package com.udemy.autocodinground.prep26.strings;
import java.util.Scanner;

public class Q3AndQ2TextLengthWithoutInbuild {

	public static void main(String[] args) {
		Scanner scpIn = new Scanner(System.in);
		System.out.println("\nEnter the input text : ");
		String strInputText=scpIn.nextLine();
		evaluateLenOfInputText(strInputText);
		scpIn.close();
	}

	private static void evaluateLenOfInputText(String strInputText) {
		int lenCount = 0;
		while (true) {
			try {
				char chItem=strInputText.charAt(lenCount);
				//Move forward the 'lenCount'
				lenCount++;
				System.out.println("\nInput charecter : "+chItem);
			} catch (StringIndexOutOfBoundsException e) {
				//when charAt() encountered with exception this block will executed.
				System.out.println("\nLength of input text : '" + strInputText + "' is : " + lenCount);
				// Vital step to terminate the loop after exception.
				break;
			}
		}
	}

}