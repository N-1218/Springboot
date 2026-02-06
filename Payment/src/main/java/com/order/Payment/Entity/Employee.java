package com.order.Payment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int ID;
	String name;
	Double Salary;
	String emp_Email;
	
	//Company Object
	@JoinColumn(name="Company_id")
	@ManyToOne
	Company company;
	
	//Constructor
	public Employee(Company company) {
		this.company=company;
	}
	
	//Setter and Getter

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public String getEmail() {
		return emp_Email;
	}

	public void setEmail(String email) {
		emp_Email = email;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
