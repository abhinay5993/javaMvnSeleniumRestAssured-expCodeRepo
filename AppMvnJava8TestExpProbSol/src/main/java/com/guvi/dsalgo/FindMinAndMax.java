package com.guvi.dsalgo;
import java.util.Arrays;
import mathameticsPack.GuviUtilsClass_Persons;

public class FindMinAndMax {
	
	public static void main(GuviCustStringExps[] args) {
		double testData[]={5,8,5,3,8,0,6.66,-1.25,0.99,45,33,-54,-0.255};
		System.out.println("\nUsed input Data : "+Arrays.toString(testData));
		findMinAndMaxFromAarray(testData);
		computeSumAndAvg(testData);
		
		GuviUtilsClass_Persons personObj=new GuviUtilsClass_Persons();
		personObj.setPanNo("3jjdkk3k");
		personObj.setName("Atif Aslam");
		personObj.setMobileNo("+91-dkskkfkfj");
		personObj.getPersonDetails();
	}

	public static void findMinAndMaxFromAarray(double inpData[])
	{
		double max=inpData[0];
		double min=inpData[0];
		for(int i=1;i<inpData.length;i++)
		{
			max=(inpData[i]>max)?inpData[i]:max;
			min=(inpData[i]<min)?inpData[i]:min;
		}
        System.out.println("\nMax value into Array : "+max);
        System.out.println("\nMinimum value into Array : "+min);
	}
	
	public static void computeSumAndAvg(double inpData[])
	{
		double sum=0,avg = 0;
		for(int i=0;i<inpData.length;i++)
		{
		sum=sum+inpData[i];
		avg=(sum/inpData.length);
		}
        System.out.println("\nSum of the Elements     : "+sum);
        System.out.println("\nAverage of the Elements : "+avg);
	}
		
}