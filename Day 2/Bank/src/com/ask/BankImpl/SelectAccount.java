package com.ask.BankImpl;

public class SelectAccount {

	public void selectMyAccount(int ch){
		// TODO Auto-generated method stub
		
		if(ch==1)
		{
		System.out.println("===================================================================================================");
		SavingsAcc savings = new SavingsAcc();
		savings.createAcc();
		savings.calcInt();
		savings.addMonthlyInt();
		savings.addHalfYrlyInt();
		savings.addAnnualInt();
		savings.deposit();
		savings.withdraw();
		savings.getBalance();
		}
		else if(ch==2)
		{
		FDAcc fd = new FDAcc();
		fd.createAcc();
		fd.calcInt();
		fd.addMonthlyInt();
		fd.addHalfYrlyInt();
		fd.addAnnualInt();
		fd.deposit();
		fd.withdraw();
		fd.getBalance();
		}
		else if(ch==3)
		{
		PersonalLoanAcc personalloan = new PersonalLoanAcc();
		personalloan.calcInt();
		personalloan.createAcc();
		personalloan.deductAnnualInt();
		personalloan.deductHalfYrlyInt();
		personalloan.deductMonthlyInt();
		personalloan.payInterest();
		personalloan.payPartialPrincipal();
		personalloan.repayPrincipal();
		}
		else
		{
		HousingLoanAcc housingloan = new HousingLoanAcc();
		housingloan.calcInt();
		housingloan.createAcc();
		housingloan.deductAnnualInt();
		housingloan.deductHalfYrlyInt();
		housingloan.deductMonthlyInt();
		housingloan.payInterest();
		housingloan.payPartialPrincipal();
		housingloan.repayPrincipal();
		}
	}

}
