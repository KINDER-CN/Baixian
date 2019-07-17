package com.zl.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.user.BankInfoDao;
import com.zl.pojo.user.BankAccountInfo;
import com.zl.user.service.BankInfoService;
@Service
public class BankInfoServiceImpl implements BankInfoService {
	@Autowired
	private BankInfoDao bank;
	@Override
	public int addBankInfo(BankAccountInfo bankInfo) {
		return bank.addBankInfo(bankInfo);
	}

	@Override
	public int updateBankInfo(BankAccountInfo bankInfo) {
		return bank.updateBankInfo(bankInfo);
	}

	@Override
	public BankAccountInfo findBankInfoByUserId(Integer userid) {
		return bank.findBankInfoByUserId(userid);
	}

}
