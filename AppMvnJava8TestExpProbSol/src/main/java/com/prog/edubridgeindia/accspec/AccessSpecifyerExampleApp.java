package com.prog.edubridgeindia.accspec;
import com.prog.edubridgeindia.SimpleVariableConcepts;

public class AccessSpecifyerExampleApp extends SimpleVariableConcepts {

	public static void main(String[] args) {
		//accessing protected data members
		AccessSpecifyerExampleApp appObj=new AccessSpecifyerExampleApp();
		System.out.println("\nAccess public data : "+appObj.toString());
		
		System.out.println("I am statement no : "+1);
		System.out.println("I am statement no : "+2);
		try {
		System.out.println("I am statement no : "+(3/0));//is not divide 
		}		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(RuntimeException e) {
			System.out.println(e);
		}
		
		System.out.println("I am statement no : "+4);
		System.out.println("I am statement no : "+5);
		System.out.println("I am statement no : "+6);
		System.out.println("I am statement no : "+7);
	
	}

}
