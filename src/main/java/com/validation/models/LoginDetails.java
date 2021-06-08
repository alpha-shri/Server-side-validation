package com.validation.models;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginDetails {
	
	@NotBlank(message = "Username cannot be empty!")
	@Size(min = 3, max = 20, message = "Username should have 3 - 20 characters!!")
	private String username;

	@NotBlank(message = "Email field cannot be empty!")
	@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email address !")
	private String email;
	
	@NotBlank(message = "Password cannot be empty!")
	@Size(min = 3, max = 12, message = "Password should have 3 - 12 characters!!")
	private String password;
	
	@AssertTrue(message = "Agree to proceed")
	private boolean agreement;
	
	
	public boolean isAgreement() {
		return agreement;
	}
	public void setAgreement(boolean agreement) {
		this.agreement = agreement;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "LoginDetails [username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
	
}
