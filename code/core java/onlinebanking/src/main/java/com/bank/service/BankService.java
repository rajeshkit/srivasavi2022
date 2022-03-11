package com.bank.service;

import com.bank.dao.BankDao;
import com.bank.model.Bank;

public class BankService {
	public int createDepartment(Bank bank) {
		BankDao bDao=new BankDao();
		int result=bDao.insertDepartment(bank);
		return result;
	}
}
