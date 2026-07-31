package com.udemy.autocodinground.prep26.arrays;
import java.util.Arrays;

public class Q25Q26FindMaxProductTriplatesOfNums {

	public static void main(String[] args) {
		// Set-1
		int[] nums1Arr = { -10, -10, 5, 2, 6 };
		System.out.println("\nMaximum Triplet Product: " + getOptimalMaxProductTriplet(nums1Arr));

		// Set-2
		int[] nums2Arr = { 10, 3, 5, 6, 20 };
		System.out.println("\nMaximum Triplet Product: " + getOptimalMaxProductTriplet(nums2Arr));

		// Set-3
		int[] nums3Arr = { -10, -3, -5, -6, -20 };
		System.out.println("\nMaximum Triplet Product: " + getOptimalMaxProductTriplet(nums3Arr));

		// Set-4
		int[] nums4Arr = { 1, -4, 3, -6, 7, 0 };
		System.out.println("\nMaximum Triplet Product: " + getOptimalMaxProductTriplet(nums4Arr));

		System.out.println("\n ****************** NON-Optimzed Naive Approach ******************** ");
		
		System.out.println("\nMaximum Triplet Product: "+nonOptMaxProductTriplet(nums1Arr));
		// Set-5
		int[] nums5Arr = { 1, -4 };
		System.out.println("\nMaximum Triplet Product: " + nonOptMaxProductTriplet(nums5Arr));

	}

	private static int nonOptMaxProductTriplet(int[] nums1Arr) {
		System.out.println("\nInput Data Array : "+Arrays.toString(nums1Arr));
		int arrLen = nums1Arr.length;
		if (nums1Arr == null || arrLen < 3) {
			System.err.println("\nOperation not!! possible..");
			return -1;
		}
		//Applying sort operation
		Arrays.sort(nums1Arr);
		//Picking-up last 3 maximum items from most right end of sorted array
		int firstMaxProduct = (nums1Arr[arrLen-1] * nums1Arr[arrLen-2] * nums1Arr[arrLen-3]);
		//Picking-up first 2 minimum items from most left end of sorted array
		int secMaxProduct = (nums1Arr[0]*nums1Arr[1]*nums1Arr[arrLen-1]);
		
		System.out.println("\nmax & min product results : ( "+firstMaxProduct+" , "+secMaxProduct+" )");
		int resultMaxTripProdct = (firstMaxProduct > secMaxProduct) ? firstMaxProduct : secMaxProduct;
		return resultMaxTripProdct;
	}

	private static int getOptimalMaxProductTriplet(int[] nums1Arr) {
		System.out.println("\nInput Data Array : "+Arrays.toString(nums1Arr));
		int arrLen = nums1Arr.length;
		if (nums1Arr == null || arrLen < 3) {
			System.err.println("\nOperation not!! possible..");
			return -1;
		}
		int max1Num = Integer.MIN_VALUE;
		int secMax2Num = Integer.MIN_VALUE;
		int thirdMax3Num = Integer.MIN_VALUE;
		int min1Num = Integer.MAX_VALUE;
		int secMin2Num = Integer.MAX_VALUE;

		for (int numItems : nums1Arr) {
			if (numItems > max1Num) {
				thirdMax3Num = secMax2Num;
				secMax2Num = max1Num;
				max1Num = numItems;
			} else if (numItems > secMax2Num) {
				thirdMax3Num = secMax2Num;
				secMax2Num = numItems;
			} else if (numItems > thirdMax3Num) {
				thirdMax3Num = numItems;
			}

			if (numItems < min1Num) {
				secMin2Num = min1Num;
				min1Num = numItems;
			} else if (numItems < secMin2Num) {
				secMin2Num = numItems;
			}
		}
		int firstMaxProduct = (max1Num * secMax2Num * thirdMax3Num);
		int secMaxProduct = (min1Num * secMin2Num * max1Num);
		System.out.println("\nmax & min product results : ( "+firstMaxProduct+" , "+secMaxProduct+" )");
		int resultMaxTripProdct = (firstMaxProduct > secMaxProduct) ? firstMaxProduct : secMaxProduct;
		return resultMaxTripProdct;
	}

}