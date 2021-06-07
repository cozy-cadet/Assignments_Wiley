package com.ask.bank;

public interface LoanAcc extends Account {
	void repayPrincipal ();
	void payInterest();
	void payPartialPrincipal ();
}
