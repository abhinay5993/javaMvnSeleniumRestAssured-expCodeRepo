package com.problemsolving.testUtilExps;

public class PatternCapture {
	
public static void main(String[] args) {
	String dat="&*$&HDgdg((00238HDH*@&*&#";
	
	String chs="";
	String digi="";
	String spc="";
	
	String regx1="[^a-zA-z]";
	String regx2="[^0-9]";
	String regx3="[a-z0-9A-z ]";
//	
//	Pattern pt1=Pattern.compile(regx1);
//	Pattern pt2=Pattern.compile(regx2);
//	Pattern pt3=Pattern.compile(regx3);
//	
//	Matcher mt1=pt1.matcher(dat);
//	Matcher mt2=pt2.matcher(dat);
//	Matcher mt3=pt3.matcher(dat);
//	
//	for (int i = 0; i < dat.length(); i++) {
//		if (mt1.find()) {
//			chs = chs + dat.charAt(i);
//		} else if (mt2.find()) {
//			digi = digi + dat.charAt(i);
//		} else if(mt2.find()){
//			spc = spc + dat.charAt(i);
//		}
//		else
//		{
//			System.out.println("NA");
//		}
//	}
	
//	for (int i = 0; i < dat.length(); i++) {
//		if (Character.isAlphabetic(i)) {
//			chs = chs + dat.charAt(i);
//		} 
//		if (Character.isDigit(i)) {
//			digi = digi + dat.charAt(i);
//		} 
//		else {
//			spc = spc + dat.charAt(i);
//		}
//	}

	System.out.println("\nCharecters : "+dat.replaceAll(regx3, ""));
	
	System.out.println("\nDigits : "+digi);
	System.out.println("\nSpecials : "+spc);
}

}