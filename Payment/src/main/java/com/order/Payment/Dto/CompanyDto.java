package com.order.Payment.Dto;

import java.util.List;

public class CompanyDto {
	String name;
	String email;
	List<EmployeeDto>list;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<EmployeeDto> getList() {
		return list;
	}
	public void setList(List<EmployeeDto> list) {
		this.list = list;
	}
	
	
}

