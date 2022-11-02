package com.acciojob.preDSA;
import java.util.Scanner;

public class FrequencyOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long d= sc.nextLong();
		System.out.println(getFrequencyOfDigit(n,d));
	}
	
    public static long getFrequencyOfDigit(long n,long digit)
    {
            long countFeq=0;
            long rem = 0;
            while(n>0)
            {
              rem=(n%10);
              if(rem==digit)
              {
                      countFeq++;
              }
              n=n/10;
            }
            return countFeq;
    }
	
}