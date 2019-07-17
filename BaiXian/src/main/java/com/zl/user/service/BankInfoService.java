package com.zl.user.service;

import com.zl.pojo.user.BankAccountInfo;

public interface BankInfoService {

	public int addBankInfo(BankAccountInfo bankInfo);

	public int updateBankInfo(BankAccountInfo bankInfo);

	public BankAccountInfo findBankInfoByUserId(Integer userid);

}
