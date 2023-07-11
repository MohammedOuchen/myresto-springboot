package com.myresto.domaine;

public class Customer {

	private String firstName;
	private String secondName;
	private String email;
	private String phone;
	private String address;
	private String city;
	private String country;
	private int postal_code;
	
	
	public Customer(String firstName, String secondName, String email, String phone, String address, String city,
			String country, int postal_code) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.country = country;
		this.postal_code = postal_code;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSecondName() {
		return secondName;
	}


	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getPostal_code() {
		return postal_code;
	}


	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}
	
	
}
