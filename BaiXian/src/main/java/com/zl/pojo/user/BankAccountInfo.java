package com.zl.pojo.user;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BankAccountInfo {
	private Integer id;//主键id
	private Integer userId;//用户id，关联用户表
	private String account;//银行账户名
	private String bank;//开户行
	private String accountNo;//账号
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return "BankAccountInfo [id=" + id + ", userId=" + userId + ", account=" + account + ", bank=" + bank
				+ ", accountNo=" + accountNo + "]";
	}
	
}
