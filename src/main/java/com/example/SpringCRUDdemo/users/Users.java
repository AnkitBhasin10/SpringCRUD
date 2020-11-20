package com.example.SpringCRUDdemo.users;

import java.util.Date;

public class Users {

	private Integer id;
	private String name;
	private Date dateOfBirth;
	
	public Users(Integer id, String name, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
}
