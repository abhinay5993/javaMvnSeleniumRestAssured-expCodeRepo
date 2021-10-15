package com.problemsolving.testUtilExps;

public class RelationalOpeExp {

	public static void main(String[] args) {
		
		char cp=169;
		System.out.println("\nVal of Ch : "+cp);
		char charTest;
		if(cp>70)
		{
			System.out.println("\nIt Evaluates the Unicode Value of char Ch var ");
		}
		
		for(int i=1;i<=26;i++)
		{
		charTest=(char) i;
		System.out.println("\nRespective Char from integers : "+i+" ----> "+charTest+" ");	
		}
		
	}

}
