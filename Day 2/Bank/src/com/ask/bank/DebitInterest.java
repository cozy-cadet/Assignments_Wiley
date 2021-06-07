package com.ask.bank;

public interface DebitInterest extends Interest {
	void deductMonthlyInt();
	void deductHalfYrlyInt();
	void deductAnnualInt();
}
