package com.order.Payment.Services;

import javax.management.loading.ClassLoaderRepository;

import org.springframework.beans.factory.annotation.Autowired;

import com.order.Payment.Entity.Company;
import com.order.Payment.Exception.InvalidemailException;
import com.order.Payment.Exception.NotEmptyException;
import com.order.Payment.Repository.CompanyRepo;

public class CompanyService {
@Autowired
private CompanyRepo comrepo;
public CompanyService() {
	
}
public Company saveCompany(Company comp) throws InvalidemailException,NotEmptyException,Exception
{

if(!comp.getEmail().endsWith("@gmail.com")) {
	throw new  InvalidemailException(" @gmail.com is compulsory...!");
}
	
  else if(comp.getName().isBlank())
		
	{
		throw new NotEmptyException("Name is not Empty...!");
	}
	return comrepo.save(comp);
}
}
