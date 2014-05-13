package com.pluralsight.model;

import java.sql.Date;

public class NormalReport {
	private String name;
	private String surname;
	private String address;
	private String country;
	private Date dob;

	public NormalReport(String name, String surname, Object dob, String address,
			String country) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.country = country;
		//System.out.println(dob.getClass());
		this.dob = (Date)dob;
	}

	public String getAddress() {
		return address;
	}

	public String getCountry() {
		return country;
	}

	public Date getDob() {
		return dob;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
