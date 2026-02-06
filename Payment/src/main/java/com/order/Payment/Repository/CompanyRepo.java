package com.order.Payment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.Payment.Entity.Company;

public interface CompanyRepo extends JpaRepository<Company,Integer> {

}
