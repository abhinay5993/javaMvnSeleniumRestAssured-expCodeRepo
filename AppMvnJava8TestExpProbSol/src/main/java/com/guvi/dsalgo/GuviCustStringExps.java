package com.guvi.dsalgo;

public class GuviCustStringExps {
	char testChars[];

	public GuviCustStringExps(char testObjs[]) {
		this.testChars = testObjs;
	}
	
	public boolean isVowelsPresent() {
		boolean flag = false;
		for (int i = 0; i < testChars.length; i++) {
			if (testChars[i] == 'a' || testChars[i] == 'A' 
				|| testChars[i] == 'i' || testChars[i] == 'I'
				|| testChars[i] == 'o' || testChars[i] == 'O' || testChars[i] == 'e' || testChars[i] == 'E'
				|| testChars[i] == 'u' || testChars[i] == 'U') {
				flag = true;
			}
		}
		return flag;
	}
	
	public void getASCIIIntValsForChars() {
		for (char ts : testChars) {
			System.out.println("\n" + ts + " chars respective ASCII Value : " + (int) ts);
		}
	}
	
	public static void main(GuviCustStringExps[] args) {
		char testObjs[]= {'g','p','x','U','G','Y'};
		
		GuviCustStringExps obj=new GuviCustStringExps(testObjs);
		System.out.println("\nCheck any Vowel present status : "+obj.isVowelsPresent());
		obj.getASCIIIntValsForChars();
	}
	
}