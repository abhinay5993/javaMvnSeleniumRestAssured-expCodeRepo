package com.geeksforgeeks.jbdl;
import java.io.CharArrayReader;

public class CustomArrayListExp {
	
	public static void main(String[] args) {
		String data="abcdefgh";
		char charData[]=new char[data.length()];
		data.getChars(0, data.length(), charData, 0);
		
		CharArrayReader inp1=new CharArrayReader(charData);
		CharArrayReader inp2=new CharArrayReader(charData,1,4);
		int i;
		int j;
		try
		{
			while((i=inp1.read())==(j=inp2.read()))
			{
				System.out.print((char)i);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
