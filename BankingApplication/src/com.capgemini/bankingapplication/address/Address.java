package com.capgemini.bankingapplication.address;

public class Address 
{
	private String city;
	private String streetName;
	private String state;
	private int pinCode;
	
	public Address(String city,String streetname,String state,int pinCode)
	{
		this.city=city;
		this.state=state;
		this.streetName=streetName;
		this.pinCode=pinCode;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
}
