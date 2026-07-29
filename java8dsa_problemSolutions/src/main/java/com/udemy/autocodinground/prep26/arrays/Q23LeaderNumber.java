package com.udemy.autocodinground.prep26.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q23LeaderNumber {

	public static void main(String[] args) {
	int[] leadNumArry={16,17,4,3,5,2};
	System.out.println("\nInput Array : "+Arrays.toString(leadNumArry));
	System.out.println("\nResultant leader numbers array : "+Arrays.toString(getLeaderNumbersArray(leadNumArry)));
	}

	private static int[] getLeaderNumbersArray(int[] leadNumArry) {
	List<Integer> resultList=new ArrayList<>();
	int firstLeadElement=leadNumArry[leadNumArry.length-1];
	resultList.add(firstLeadElement);
	for (int i=leadNumArry.length-2;i>=0;i--) {
		int currentEle=leadNumArry[i];
		if (currentEle>firstLeadElement) {
		firstLeadElement=currentEle;
		resultList.add(firstLeadElement);
		}
	}
	System.out.println("\nLead Elements : "+resultList);
	return resultList.stream().mapToInt(Integer::valueOf).toArray();
	}

}