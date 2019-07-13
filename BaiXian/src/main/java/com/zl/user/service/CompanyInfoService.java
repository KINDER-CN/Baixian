package com.zl.user.service;

import com.zl.pojo.user.CompanyInfo;

/**
 * 企业表
 *  --Service层
 */
public interface CompanyInfoService {
	/**
	 * 添加企业认证信息
	 *   -->返回结果
	 */
	public int addCompanyInfo(CompanyInfo companyInfo);
	
	/**
	 * 根据用户会员id查询
	 *   -->返回公司信息
	 */
	public CompanyInfo findCompanyInfoByUserID(int userID); 
	
	/**
	 * 更新企业信息
	 *   -->返回结果
	 */
	public int updateCompanyInfo(CompanyInfo companyInfo);
	
	/**
	 * 根据id查询 企业信息
	 */
	public CompanyInfo findCompanyInfoById(int id);
	
}
