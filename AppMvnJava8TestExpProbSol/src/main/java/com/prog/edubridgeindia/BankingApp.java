package com.prog.edubridgeindia;

public class BankingApp {
	
	long accNo;
	String accHolderName; 
	double initDeposit;
	double balAmount;
	
	BankingApp(long accNo, String accHolderName, double initDeposit, double balAmount) {
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		if (initDeposit >= 500 && balAmount >= 0) {
			this.initDeposit = initDeposit;
			this.balAmount = balAmount + initDeposit;
			System.out.println("\nBank Account Opened Succeesfully");
		} else {
			System.out.println("\nUnable to OpenBank account!! minimum deposit with amount : 500");
		}
	}

	void getMiniStatement()
	{
		System.out.println("\nUser Account No     : "+this.accNo);
		System.out.println("\nAccount Holder Name : "+this.accHolderName);
		System.out.println("\nBalance Amount      : "+this.balAmount);
	}
	
	void getBalanceAfterDeposit(double newDepositAmount) {
		if (this.initDeposit >= 500) {
			this.balAmount = this.balAmount + newDepositAmount;
			System.out.println("\nAmount : "+newDepositAmount+" deposited successfully!!..");
		} else {
			System.out.println("\nNot Eligible to Deposit, Contact to branch!!..");
		}
	}
	
	void getBalanceAfterWithdrawal(double withDrownAmount) {
		if (this.balAmount >= withDrownAmount) {
			this.balAmount = this.balAmount - withDrownAmount;
			System.out.println("\nAmount : " + withDrownAmount + " withdrown successfully!!..");
		} else {
			System.out.println("\nTransaction failed!!.. due to insufficient balance.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("\nWelcome to XYZ bank : ");
		//Non Opend Bank A/C
		BankingApp openBankObj=new BankingApp(39949,"Rajesh",100, 0);
		openBankObj.getMiniStatement();
		openBankObj.getBalanceAfterDeposit(5000);
		openBankObj.getBalanceAfterWithdrawal(900);
		openBankObj.getMiniStatement();
		
		//Open Bank A/C
		BankingApp openBankObj1=new BankingApp(8384,"KK",600, 0);
		openBankObj1.getMiniStatement();
		openBankObj1.getBalanceAfterDeposit(1000);
		openBankObj1.getMiniStatement();
		openBankObj1.getBalanceAfterWithdrawal(900);
		openBankObj1.getMiniStatement();		
		
	}

}