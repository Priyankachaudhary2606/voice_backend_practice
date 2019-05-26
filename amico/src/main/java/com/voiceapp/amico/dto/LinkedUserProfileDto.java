package com.voiceapp.amico.dto;

import com.voiceapp.amico.common.BaseDto;

public class LinkedUserProfileDto extends BaseDto{

	private String email;
	private String firstName;
	private String lastName;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LinkedUserProfileDto(String email, String firstName, String lastName) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public LinkedUserProfileDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
