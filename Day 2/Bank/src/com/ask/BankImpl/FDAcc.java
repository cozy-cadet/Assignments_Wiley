package com.ask.BankImpl;

import com.ask.bank.CreditInterest;
import com.ask.bank.DepositAcc;

public class FDAcc implements DepositAcc, CreditInterest {
	

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Creating FD Account now.");
	}

	@Override
	public void addMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Add monthly interest to FD Account.");
	}

	@Override
	public void addHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Adding Half-Yearly interest to FD Account.");
	}

	@Override
	public void addAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Adding annual interest to FD Account.");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawing from FD Account.");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Depositing into FD Account.");
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Getting Balance of FD Account.");
	}

	@Override
	public void calcInt() {
		// TODO Auto-generated method stub
		System.out.println("Calculating Interest of FD Account.");
	}


}
