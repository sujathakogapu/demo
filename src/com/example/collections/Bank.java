package com.example.collections;
/*
 *Create a class Bank with attributes accountNumber(String) and balance(double).
 * Two bank account objects are same, if they have same account number.
 */
public class Bank {
	private String acNumber;
	private double balance;
	public Bank(String acNumber,double balance) {
		this.acNumber=acNumber;
		this.balance=balance;
	}
	
public boolean equals(Object obj) {
	if(this==obj) {
		return true;
	}

    Bank bank = (Bank) obj;
    if(this.acNumber.equals(bank.acNumber)) {
    	return true;
    }
    else {
    	return false;
    }
}
@Override
public int hashCode() {
	int result=this.acNumber.hashCode();
	return result;
}
public static void main(String[] args) {
	Bank bank1=new Bank("sbi123",10000.00);
	Bank bank2=new Bank("hdfc123",10000.00);
	Bank bank3=new Bank("sbi123",10000.00);
	Bank bank4=bank3;
	System.out.println(bank1.equals(bank2));
	System.out.println(".equals():"+bank1.equals(bank3)+" =="+(bank1==bank3));
	System.out.println(bank4.equals(bank3));
	System.out.println(bank1.hashCode());
	System.out.println(bank3.hashCode());
}
}