package com.order.Payment.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.order.Payment.Entity.Employee;
import com.order.Payment.Repository.EmployeeRepo;

public class EmployeeService {
@Autowired
private EmployeeRepo emprepo;
public Employee saveemp(Employee emp)
{
	System.out.println();
	return emprepo.save(emp);
}


public List<Employee> getall()
{
	
	return emprepo.findAll();
}

}
