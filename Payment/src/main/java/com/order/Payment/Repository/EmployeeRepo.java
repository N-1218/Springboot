package com.order.Payment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.Payment.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
