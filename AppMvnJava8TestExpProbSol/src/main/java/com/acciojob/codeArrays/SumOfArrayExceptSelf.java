package com.acciojob.codeArrays;
import java.util.Scanner;

public class SumOfArrayExceptSelf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        int output[]=new int[n];
        for(int i=0;i<n;i++)
        {
                nums[i]=sc.nextInt();      
        }
        int i=0;
        int sum=0;
        while(i < nums.length){
                int temp=nums[i];
                output[i++]=sum;
                sum=sum+temp;
        }
        i--;
        sum=0;
        while(i>=0){
                int temp=nums[i];
                output[i--]+=sum;
                sum=sum+temp;
        }
        
        for(int k=0;k<n;k++)
        {
               System.out.print(output[k]+" ");
        }
        
	}
}
