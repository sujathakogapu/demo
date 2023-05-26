package com.example.oops;

public class BankEncapsulation{
	String bankName="HDFC";
	//Step1:-create private variable
	private int bankBalance=999999999;
	
	//step2:- create getter for visibility
	public int getBankBalance() {
		return this.bankBalance;
	}
	
	//step3:-create setter(modifications) with validations
	public void setBankBalance(int balance) {
		if(this.bankBalance > balance) {
			System.out.println("set operation failed");
			return;
		}
		this.bankBalance=balance;
	}
}
