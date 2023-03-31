package com.guvi.Java8BeginnMod;

@FunctionalInterface
public interface IPaymentServices {
	
	public String acceptPayments(long cardNo,int cvv,String expireDate);
	
//	public boolean paymentStatus(String paymentType);
	
}