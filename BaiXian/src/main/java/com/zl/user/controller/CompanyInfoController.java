package com.zl.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zl.pojo.user.CompanyInfo;
import com.zl.user.service.CompanyInfoService;



@Controller
@RequestMapping("/companyInfo")
public class CompanyInfoController {
	@Autowired
	private CompanyInfoService cs;
	
	/**
	 * 添加企业认证信息
	 *   -->返回结果
	 */
	//转到添加页面
	@RequestMapping("/toAddCompanyInfo")
	public ModelAndView toAddCompanyInfo() {
		System.out.println("进入跳转添加页面控制器.................");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("addCompanyInfo");
		return mv;
	}
	
	//添加
	@RequestMapping("/addCompanyInfo")
	public String addCompanyInfo(CompanyInfo companyInfo) {
		int flag;
		System.out.println("进入添加控制器.................");
		flag = cs.addCompanyInfo(companyInfo);
		System.out.println(flag);
		return "redirect:/new"; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
