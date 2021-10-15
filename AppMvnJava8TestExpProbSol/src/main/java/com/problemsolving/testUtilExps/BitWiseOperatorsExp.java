package com.problemsolving.testUtilExps;

public class BitWiseOperatorsExp {

	public static void main(String[] args) {
		int a = 2;
		System.out.println("\nBinary Equivalant a : "+Integer.toBinaryString(a));
		int rightSiftedVal=(a >> 1);
        System.out.println("\na >> 1 = " + rightSiftedVal);
        int leftSiftedVal=(a << 2);
        System.out.println("\na << 2 = " + leftSiftedVal);
        int zeroFillRightShift=(a >>> 2);
        System.out.println("\na >>> 2 = " + zeroFillRightShift);
        System.out.println("\nAfter Right shift by 2 : "+Integer.toBinaryString(rightSiftedVal));
        System.out.println("\nAfter Left shift by 2 : "+Integer.toBinaryString(leftSiftedVal));
        System.out.println("\nZero Fill Right shift by 2 : "+Integer.toBinaryString(zeroFillRightShift));
        
       

	}
}
