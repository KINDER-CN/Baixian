package com.zl.dao.user;

import com.zl.pojo.user.BankAccountInfo;

public interface BankInfoDao {
	/**
	 * 增加银行账号
	 */
	public int addBankInfo(BankAccountInfo bankInfo);
	/**
	 * 修改银行信息
	 */
	public int updateBankInfo(BankAccountInfo bankInfo);
	/**
	 * 查看银行会员信息
	 */
	public BankAccountInfo findBankInfoByUserId(Integer userid);
}
