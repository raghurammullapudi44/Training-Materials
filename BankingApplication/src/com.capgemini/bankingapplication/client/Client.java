package com.capgemini.bankingapplication.client;

import com.capgemini.bankingapplication.icici.ICICIBank;
import com.capgemini.bankingapplication.InvalidAccountNumber.InvalidAccountNumberException;
import com.capgemini.bankingapplication.MinimumBalanceAlert.MinimumBalanceAlertException;
import com.capgemini.bankingapplication.address.Address;
import com.capgemini.bankingapplication.customer.Customer;

import java.util.ArrayList;

import com.capgemini.bankingapplication.InsufficientBalance.InsufficientBalanceException;

public class Client 
{
	public static void main(String[] args)
	{
		ICICIBank bank=new ICICIBank();
		
		try
		{
			System.out.println(bank.createAccount(101,3000, new Customer("raghu",new Address("vizag","ramalayam street","Andhra Pradesh",534313))));
			System.out.println(bank.createAccount(102, 50000, new Customer("ram",new Address("Hyderabad","gachhibowli","telangana",500032))));
			
			System.out.println("Balance = "+bank.withdrawAmount(101, 500));
			System.out.println("Balance = "+bank.depositAmount(101, 4000));
			ArrayList<Integer> balance=bank.fundTransfer(101, 102, 6001);
			System.out.println("source account Balance = "+balance.get(0)+" and destination account balance is "+balance.get(1));
		}
		catch(InvalidAccountNumberException ian)
		{
			System.out.println("invalid account number");
		}
		catch(InsufficientBalanceException ibe)
		{
			System.out.println("insufficient balance");
		}
		catch(MinimumBalanceAlertException ibe)
		{
			System.out.println("Minimum balance should be maintained");
		}
	}
}
