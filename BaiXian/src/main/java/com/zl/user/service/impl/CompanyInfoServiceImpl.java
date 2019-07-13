package com.zl.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.user.CompanyInfoDao;
import com.zl.pojo.user.CompanyInfo;
import com.zl.user.service.CompanyInfoService;


@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {
	@Autowired
	private CompanyInfoDao cd;
	
	//添加企业认证信息
	public int addCompanyInfo(CompanyInfo companyInfo) {
		return cd.addCompanyInfo(companyInfo);
	}

	//根据用户会员id查询
	public CompanyInfo findCompanyInfoByUserID(int userID) {
		return cd.findCompanyInfoByUserID(userID);
	}

	//根据id获取企业信息
		public CompanyInfo findCompanyInfoById(int id) {
			return cd.findCompanyInfoById(id);
		}
	
	//更新企业信息
	public int updateCompanyInfo(CompanyInfo companyInfo) {
		return cd.updateCompanyInfo(companyInfo);
	}
	
}
