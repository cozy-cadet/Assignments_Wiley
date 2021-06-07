package com.ask.account;

import java.util.Scanner;

import com.ask.BankImpl.SelectAccount;

public class MyAccount {

	public static void main(String[] args) {
		System.out.println("Enter 1 fro Savings Acc, 2 for FD Acc, 3 for Housing Loan Acc, 4 for PersonalLoanAcc.");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		sc.close();
		SelectAccount account = new SelectAccount();
		account.selectMyAccount(ch);
	}
}
