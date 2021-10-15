package com.problemsolving.testUtilExps;

public class swapTestApp {
	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		
		StringBuffer sb1 = new StringBuffer(s1); 
		System.out.println(s1.equals(sb1));
		
		String s3 = "abc".intern(); 
		System.out.println(s1==s3);
		
		int x=0;
        int y=90;
        
		x=x+y-(y=x);
		
		System.out.println(""+x+"<--swap -->"+y+"");
		
	}
	
}