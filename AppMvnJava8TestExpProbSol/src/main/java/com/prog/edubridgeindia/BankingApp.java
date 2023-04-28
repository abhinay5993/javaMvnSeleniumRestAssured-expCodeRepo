package com.prog.edubridgeindia;
import java.util.Scanner;

/*
 * 
 * Try using switch case for the withdrown(), deposit() 
 * also throw and User defined Execption for limit exeed for withdrown.
 * Need to Handle synchronization concept.
 * 
 */

public class BankingApp {
	
	long accNo;
	String accHolderName; 
	double initDeposit;
	double balAmount;
	
	public static void main(String[] args) {
		System.out.println("\nWelcome to XYZ bank : ");
		Scanner sctScanner=new Scanner(System.in);
		BankingApp openBankObj = null;
		try {
		do {
			System.out.println("\nATM Menu : ");
			System.out.println("\n===========");
			System.out.println("\nPRESS 1) Open Bank Account.");
			System.out.println("\nPRESS 2) Deposit Amount.");
			System.out.println("\nPRESS 3) Withdrown Amount.");
			System.out.println("\nPRESS 4) Show Balance.");
			System.out.println("\nPRESS 5) Exit.");
			System.out.println("\nEnter your Choice : ");
			int ch=sctScanner.nextInt();
			
			switch (ch) {

			case 1:
				System.out.println("\nEnter Account No : ");
				long acno=sctScanner.nextLong();
				System.out.println("\nEnter Account Holder Name :");
				String actHoldName=sctScanner.nextLine();
				actHoldName=sctScanner.nextLine();
				System.out.println("\nEnter Initial Deposit Amount : ");
				double initDepositAmt=sctScanner.nextDouble();
				System.out.println("\nEnter Initial Balance Amount : ");
				double initBalAmt=sctScanner.nextDouble();
				openBankObj=new BankingApp(acno,actHoldName,initDepositAmt,initBalAmt);
				break;
				
			case 2:
				System.out.println("\nEnter Amount To Deposit  : ");
				double newDepositAmt=sctScanner.nextDouble();
				openBankObj.getBalanceAfterDeposit(newDepositAmt);
				break;
				
			case 3:
				System.out.println("\nEnter Amount To Withdraw  : ");
				double newWithDrowAmt=sctScanner.nextDouble();
				openBankObj.getBalanceAfterWithdrawal(newWithDrowAmt);
				break;
				
			case 4:
				openBankObj.getMiniStatement();
				break;
				
			case 5:
				System.err.println("\nMenu Existed!!..");
				System.exit(0);
				break;
				
			default:
				System.err.println("\nWrong!!.. choice Try Again!!..");
				continue;
			}
			
		} while (true);
		}
		catch (Exception e) {
			System.out.println("Execption : "+e);
		}
	}
	
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

}