package com.spk.rest.demo;

import java.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;

public class User {

	// Swagger docs for model attributes
	// These details will show under Service Model > Example Values descriptions
	@ApiModelProperty(notes = "The database generated user ID")
	private int id;

	private String name;

	private LocalDate birthDate;

	private String email;

	private String mobile;

	public User() {
		super();
	}

	public User(int id, String name, LocalDate birthDate, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.email = email;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
