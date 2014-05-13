package com.pluralsight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column	
	private String address;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Country country;

	public String getAddress() {
		return address;
	}

	public Country getCountry() {
		return country;
	}

	public Long getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
