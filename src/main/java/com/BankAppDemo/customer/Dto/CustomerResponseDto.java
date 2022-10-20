package com.BankAppDemo.customer.Dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CustomerResponseDto {
	private int customerId;
	@NotNull()
	@Size(min =5 , message="FirtName should have greator than 5 character")
	private String fistName;
	private String lastName;
	@NotEmpty(message="gender is mandatory")
	private String gender;
	@NotNull(message="age is mandatory")
	@Min(18)
	private int age;
	@NotNull(message="phoneNo is mandatory")
	@Size(max=11,min=10)
	private String phoneNo;
	@NotNull
	@Email
	private String email;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
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
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CustomerResponseDto(int customerId,
			@NotNull @Size(min = 5, message = "FirtName should have greator than 5 character") String fistName,
			String lastName, @NotEmpty(message = "gender is mandatory") String gender,
			@NotNull(message = "age is mandatory") @Min(18) int age,
			@NotNull(message = "phoneNo is mandatory") @Size(max = 11, min = 10) String phoneNo,
			@NotNull @Email String email) {
		super();
		this.customerId = customerId;
		this.fistName = fistName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	
	

}
