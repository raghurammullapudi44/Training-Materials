package com.capgemini.bankingapplication.icici;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import com.capgemini.bankingapplication.account.Account;
import com.capgemini.bankingapplication.customer.Customer;
import com.capgemini.bankingapplication.InvalidAccountNumber.InvalidAccountNumberException;
import com.capgemini.bankingapplication.MinimumBalanceAlert.MinimumBalanceAlertException;
import com.capgemini.bankingapplication.InsufficientBalance.InsufficientBalanceException;

public class ICICIBank
{
	LinkedList<Account> accounts=new LinkedList<Account>();

	public String createAccount(int accountNumber,int amount,Customer customer)throws MinimumBalanceAlertException
	{
		if(amount < 500)
		{
			throw new MinimumBalanceAlertException();
		}
		Account account=new Account();
		account.setAccount_number(accountNumber);
		account.setAmount(amount);
		account.setCustomer(customer);
		accounts.add(account);
		System.out.println(accounts.size());
		
		return "Account created successfully";
	}
	
	
	private Account searchAccount(int accountNumber)throws InvalidAccountNumberException
	{
		for(Account account:accounts)
		{
			if(account.getAccount_number() == accountNumber)
			{
				return account;
			}
		}
		throw new InvalidAccountNumberException();
	}
	
	public int withdrawAmount(int accountNumber,int withdrawl_amount)throws InsufficientBalanceException, InvalidAccountNumberException, MinimumBalanceAlertException
	{
		Account account=searchAccount(accountNumber);
		
		if((account.getAmount() > withdrawl_amount))
		{
			if((account.getAmount()-withdrawl_amount) < 500)
			{
				throw new MinimumBalanceAlertException();
			}
			else
			{
				account.setAmount(account.getAmount()-withdrawl_amount);
				return account.getAmount();
			}
		}
		throw new InsufficientBalanceException();
	}
	
	public int depositAmount(int accountNumber,int deposit_amount)throws InvalidAccountNumberException
	{
		Account account=searchAccount(accountNumber);
		
		account.setAmount(account.getAmount()+deposit_amount);
		return account.getAmount();
	}
	
	public ArrayList fundTransfer(int sourceAccountNumber,int destinationAccountNumber,int transfer_amount)throws InsufficientBalanceException, InvalidAccountNumberException, MinimumBalanceAlertException
	{
		Account source=searchAccount(sourceAccountNumber);
		Account destination=searchAccount(destinationAccountNumber);
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		if((source.getAmount() > transfer_amount))
		{
			if((source.getAmount()-transfer_amount) < 500)
			{
				throw new MinimumBalanceAlertException();
			}
			source.setAmount(source.getAmount() - transfer_amount);
			list.add(source.getAmount());
			destination.setAmount(destination.getAmount() + transfer_amount);
			list.add(destination.getAmount());
			return list;
			}
		throw new InsufficientBalanceException(); 
	}
}
