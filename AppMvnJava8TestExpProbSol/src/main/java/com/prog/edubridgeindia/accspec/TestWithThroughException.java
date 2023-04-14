package com.prog.edubridgeindia.accspec;

public class TestWithThroughException {

	public static void main(String[] args) {
		try {
			TestWithThroughException.ValiateVoter(19);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void ValiateVoter(int age) {
		if (age < 18) {// age<18
			throw new ArithmeticException("You are not valid Voter");
		} else {
			System.out.println("You are valid Voter!!!!!");
		}

	}

}