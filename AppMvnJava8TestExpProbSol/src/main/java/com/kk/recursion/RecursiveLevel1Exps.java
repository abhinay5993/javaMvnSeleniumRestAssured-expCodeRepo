package com.kk.recursion;

public class RecursiveLevel1Exps {
	
	public static void main(String[] args) {
		int num = 121;
		System.out.println("\nStep Count to Reduce to Zero for " + num + " : " + getNumberOfSteps(num, 0));
		int num2 = 1494309300;
		System.out.println("\nOccrance Counter : " +itemOccuranceCounter(num2,3));
		
		long revCalc=323;
		System.out.println("\nReversed value of "+revCalc+" is : "+recReverseNum(revCalc));
		System.out.println("\nPalindrom Check : "+isPalindromChecker(revCalc));
		System.out.println("\nSum of Digits of "+revCalc+" : "+recSumOfDigits(revCalc));
		System.out.println("\nProduct of Digits of "+revCalc+" : "+recProductOfDigits(revCalc));
	}

	// recursive Method to reduce the Number num to zero
	public static int getNumberOfSteps(int num, int stepCount) {
		if (num == 0) {
			return stepCount;
		}

		if (num % 2 == 0) {
			return getNumberOfSteps(num / 2, stepCount + 1);
		}
		return getNumberOfSteps(num - 1, stepCount + 1);
	}

	// recursive Method to compute the occurance count of input digits
	public static int itemOccuranceCounter(int num, int inpDigit) {
		if (num == 0) {
			return inpDigit;
		}
		int rem=num % 10;
		if (rem==0) {
			return itemOccuranceCounter(num / 10, inpDigit + 1);
		}
		return itemOccuranceCounter(num / 10, inpDigit);
	}
	
	
	// recursive Method to compute the reverse of a number --> Approach --> 1
	public static long recReverseNum(long num) {
		if (num % 10 == num) {
			return num;
		}
		long digitCount = (long) (Math.log10(num) + 1);
		long rem = (num % 10);
		return (long) (rem * Math.pow(10, digitCount - 1) + recReverseNum(num / 10));
	}
	
	public static String isPalindromChecker(long num) {
		return ((num == recReverseNum(num))? "is Palindrom" : "not Palindrom");
	}
	
	// recursive Method to compute sum of digits
	public static long recSumOfDigits(long num) {
		if (num == 0) {
			return num;
		}
		return num % 10 + recSumOfDigits(num / 10);
	}

	// recursive Method to compute product of digits
	public static long recProductOfDigits(long num) {
		if (num % 10 == num) {
			return num;
		}
		return num % 10 * recProductOfDigits(num / 10);
	}
	
}