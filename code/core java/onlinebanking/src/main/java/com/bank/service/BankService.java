package com.bank.service;

import java.util.ArrayList;

import com.bank.dao.BankDao;
import com.bank.model.Bank;

public class BankService {
	public int createDepartment(Bank bank) {
		BankDao bDao=new BankDao();
		int result=bDao.insertDepartment(bank);
		return result;
	}
	public ArrayList<Bank> getAllDepartments() {
		BankDao bDao=new BankDao();
		ArrayList<Bank> alist=bDao.findAllBanks();
		return alist;
		
	}
}
