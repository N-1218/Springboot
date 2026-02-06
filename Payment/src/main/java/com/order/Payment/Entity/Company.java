package com.order.Payment.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int Company_id;
	String name;
	String email;
	
	//Employee Object
	@JoinColumn(name="ID")
	@OneToMany
	List<Employee> emp;
	

	//Constructor
	public Company(List<Employee> emp) {
		this.emp=emp;
	}

	
	


	//Setter and Getter
	public List<Employee> getEmp() {
		return emp;
	}





	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}


	public int getCompany_id() {
		return Company_id;
	}

	public void setCompany_id(int company_id) {
		Company_id = company_id;
	}

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

	
	

}
