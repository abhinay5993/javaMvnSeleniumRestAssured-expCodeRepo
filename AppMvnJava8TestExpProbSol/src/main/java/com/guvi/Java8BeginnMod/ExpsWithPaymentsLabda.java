package com.guvi.Java8BeginnMod;

import java.util.ArrayList;
import java.util.List;

public class ExpsWithPaymentsLabda {

	public static void main(String[] args) {
		
		List<String> listDs=new ArrayList<>();
		listDs.add("pushData!!.");
		listDs.add("Atif");
//		listDs.add(384);
//		listDs.add(-3.444);
		listDs.add("bolpur");
		listDs.add("IND");
		listDs.add("KOLKATA");
		listDs.add("abhinay");
		listDs.add("Apple");
		listDs.add("CaratLnae");
		listDs.add("Arka");
		
		IPaymentServices payServRef = (cardNo, cvvNo, expDt) -> {
			String paymentStatus="";
			String strCardVal = String.valueOf(cardNo);
			String strCvvVal = String.valueOf(cvvNo);
			if (strCardVal.length() == 16 && strCvvVal.length() == 3 && strCardVal != null && strCvvVal != null
					&& expDt.length() == 5 && expDt != null) {
				System.out.println("\nEntered CardNo - " + strCardVal);
				System.out.println("\nEntered CVV - " + strCvvVal);
				System.out.println("\nEntered Expiry Date - " + expDt);
				System.out.println("\nPayment Success!!..");
				paymentStatus="Payment Success!!..";
			} else {
				System.err.println("\nTransaction Failed!!..");
				paymentStatus="Payment Failed!!,,";
			}
			return paymentStatus;
		};
		System.out.println(payServRef.acceptPayments(2204039403433994L,343,"04/23"));
		
		listDs.forEach(
				(lstItems) -> {
					if(lstItems.startsWith("A") || lstItems.startsWith("a"))
					{
						System.out.println("\nFiltered Items : "+lstItems.toUpperCase());
					}
				}
		);
		
	}

}