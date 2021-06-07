package com.ask.BankImpl;

import com.ask.bank.DebitInterest;
import com.ask.bank.LoanAcc;

public class HousingLoanAcc implements LoanAcc, DebitInterest {

	@Override
	public void deductMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Deducting monthly Interest from Housing Loan Account.");
	}

	@Override
	public void deductHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Deducting half-yearly Interest from Housing Loan Account.");
	}

	@Override
	public void deductAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Deducting annual Interest from Housing Loan Account.");
	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Repayment of Principal in Housing Loan Account.");
	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("Payment of Interest in Housing Loan Account.");
	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Payment of Partial Principal in Housing Loan Account.");
	}

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Creating Housing Loan Account.");
	}

	@Override
	public void calcInt() {
		// TODO Auto-generated method stub
		System.out.println("Calculating Interest for Housing Loan Account");
	}

}
