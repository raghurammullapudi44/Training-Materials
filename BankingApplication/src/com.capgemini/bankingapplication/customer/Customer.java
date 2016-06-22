package com.capgemini.bankingapplication.customer;

import com.capgemini.bankingapplication.address.Address;

public class Customer 
{
	private String name;
	private Address address;
	
	public Customer(String name,Address address)
	{
		this.name = name;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
}
