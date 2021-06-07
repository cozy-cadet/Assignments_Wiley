package com.ask.BankImpl;

import com.ask.bank.CreditInterest;
import com.ask.bank.DepositAcc;

public class SavingsAcc implements DepositAcc, CreditInterest {

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Creating Savings Account now.");
	}
	
	@Override
	public void addMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Inside Add Monthly Interest of Savings Account.");
	}

	@Override
	public void addHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Inside Add Half Yearly Interest of Savings Account.");
	}

	@Override
	public void addAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Inside Add Annual Interest of Savings Account.");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawing Savings Account.");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit into Savings Account.");
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Get Balance of Savings Account.");
	}

	@Override
	public void calcInt() {
		// TODO Auto-generated method stub
		System.out.println("Calculating interest for Savings Account.");
	}
}
