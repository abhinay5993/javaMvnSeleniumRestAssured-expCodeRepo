package com.acciojob.preDSA;
import java.util.Scanner;

public class CheckArrayIsIncreasedOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        int n=sc.nextInt();
        int num[]=new int[n];
        int diff=0;
        for(int t=0;t<tc;t++)
        {
                for(int i=0;i<n;i++)
                {
                        num[i]=sc.nextInt();
                        if(num[i]<0)
                        {
                                break;
                        }
                }

                for(int i=0;i<n-1;i++)
                {
                        diff=(num[i+1]-num[i]);
                        System.out.println("Next Intem - "+num[i+1]);
                        System.out.println("Prev Intem - "+num[i]);
                        System.out.println("Diff Item : "+diff);
                        if(diff==1)
                        {
                                System.out.println("YES");
                        }
                        else
                        {
                                System.out.println("NO");
                        }
                }
                
        }
	}
}
