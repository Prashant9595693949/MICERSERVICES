package com.BankAppDemo.customer.Dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CustomerRequestDto {
	@NotNull(message="firstName is mandator")
	@Size(min=5, message="firstName should be greator than  5 character")
	private String firstName;
	private String lastName;
	@NotEmpty(message="gender is mandatory")
	private String gender;
	@NotNull(message="age is mandatory")
	@Min(18)
	private int age;
	@NotNull(message="phone number is mandatory")
	@Size(min=10, max=11)
	private String phneNo;
	@NotNull
	@Email
	private String email;
	@NotNull
	@Size(min=6,message="password should have greator than 6 character")
	private String password;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhneNo() {
		return phneNo;
	}
	public void setPhneNo(String phneNo) {
		this.phneNo = phneNo;
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
	public CustomerRequestDto(
			@NotNull(message = "firstName is mandator") @Size(min = 5, message = "firstName should be greator than  5 character") String firstName,
			String lastName, @NotEmpty(message = "gender is mandatory") String gender,
			@NotNull(message = "age is mandatory") @Min(18) int age,
			@NotNull(message = "phone number is mandatory") @Size(min = 10, max = 11) String phneNo,
			@NotNull @Email String email,
			@NotNull @Size(min = 6, message = "password should have greator than 6 character") String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.phneNo = phneNo;
		this.email = email;
		this.password = password;
	}
	
	
	

}
