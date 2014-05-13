package com.pluralsight.model;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String surname;

	private String password;
	
	private Date dob;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Address> address = new ArrayList<Address>();

	public List<Address> getAddress() {
		return address;
	}

	public Date getDob() {
		return dob;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getSurname() {
		return surname;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
