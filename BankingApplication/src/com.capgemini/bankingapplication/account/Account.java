package com.capgemini.bankingapplication.account;

import com.capgemini.bankingapplication.customer.Customer;

public class Account{
	private int account_number;
	private int amount;
	
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getAccount_number() {
		return account_number;
	}

	public int getAmount() {
		return amount;
	}

	public void setAccount_number(int account_number){
		this.account_number = account_number;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
