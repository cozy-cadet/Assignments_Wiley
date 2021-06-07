package com.ask.bank;

public interface CreditInterest extends Interest {
	void addMonthlyInt();
	void addHalfYrlyInt();
	void addAnnualInt();
}
