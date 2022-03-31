package com.demo.service;

import java.util.ArrayList;

import com.demo.dao.CustomerDao;
import com.demo.model.Customer;

public class CustomerService {
	public int customerRegistration(Customer cus) {
		CustomerDao cdao=new CustomerDao();
		int result=cdao.customerRegistration(cus);
		return result;
		
	}
	public ArrayList<Customer> getCustomers(){
		CustomerDao cdao=new CustomerDao();
		return cdao.getCustomers();
	}
}
