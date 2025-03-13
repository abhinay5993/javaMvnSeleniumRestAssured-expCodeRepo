package com.amodleetcodesol.arrays;

public class FindMaxProductAndTheirPair {

	public static void main(String[] args) {
	int[] inputArray={1, 4, 3, 6, 7, 0};
	evaluateMaxProductAndThePaireOfElements(inputArray,inputArray.length);
	
	int[] input2Array={3,4,5,2};
	evaluateMaxProductAndThePaireOfElements(input2Array,input2Array.length);
	
	}

	
	private static void evaluateMaxProductAndThePaireOfElements(int[] inputArray, int length) {
		if (length < 2) {
			System.out.println("Required Operations Can't be performed..");
			return;
		}
		int num1=inputArray[0];
		int num2=inputArray[1];
		int maxProd=0;
		
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				int initProduct = (num1 * num2);
				int currProd = (inputArray[i] * inputArray[j]);
				if (currProd > initProduct) {
					num1 = inputArray[i];
					num2 = inputArray[j];
					maxProd=currProd;
				}
			}
		}
		System.out.println("\nPaire of Two numbers : {"+num1+" , "+num2+"} & their product : "+maxProd+" ");
	}

}