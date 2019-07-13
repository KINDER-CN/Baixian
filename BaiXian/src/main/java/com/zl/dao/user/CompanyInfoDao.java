package com.zl.dao.user;

import com.zl.pojo.user.CompanyInfo;

/**
 * 企业
 */

public interface CompanyInfoDao {
	/**
	 * 添加企业认证信息
	 *   -->返回结果
	 */
	public int addCompanyInfo(CompanyInfo companyInfo);
	
	/**
	 * 根据用户会员id查询
	 *   -->返回公司信息
	 */
	public CompanyInfo findCompanyInfoById(int userID); 
	
	/**
	 * 更新企业信息
	 *   -->返回结果
	 */
	public int updateCompanyInfo(CompanyInfo companyInfo);
	
	
}
