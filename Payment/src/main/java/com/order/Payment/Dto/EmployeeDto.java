package com.order.Payment.Dto;

import java.util.List;
import java.util.stream.Collectors;

import com.order.Payment.Entity.Company;

public class EmployeeDto {
	String name;
	String emp_Email;
	
class Converter{
	public static CompanyDto convert(Company company) {
		CompanyDto dto=new CompanyDto();
		dto.setName(company.getName());
		dto.setEmail(company.getEmail());
		List<EmployeeDto>empd=company.getEmp().stream().map((e)->{
			EmployeeDto Dt=new EmployeeDto();
			Dt.emp_Email=e.getEmail();
			Dt.name=e.getName();
			return Dt;
		}).collect(Collectors.toList());
		return dto;
	}
	;
}
}
