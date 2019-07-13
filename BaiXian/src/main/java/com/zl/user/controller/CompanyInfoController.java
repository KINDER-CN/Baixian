package com.zl.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zl.pojo.user.CompanyInfo;
import com.zl.user.service.CompanyInfoService;

/**
 * 添加企业认证信息
 *   -->控制层
 */

@Controller
@RequestMapping("/companyInfo")
public class CompanyInfoController {
	@Autowired
	private CompanyInfoService cs;
	
	//转到添加页面
	@RequestMapping("/toAddCompanyInfo")
	@ResponseBody
	public ModelAndView toAddCompanyInfo() {
		System.out.println("进入跳转企业添加页面控制器.................");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("");
		return mv;
	}
	
	//添加
	@RequestMapping("/addCompanyInfo")
	@ResponseBody
	public Map<String,Object> addCompanyInfo(CompanyInfo companyInfo) {
		System.out.println("进入企业添加控制器.................");
		Map<String,Object> map = new HashMap<>();
		cs.addCompanyInfo(companyInfo);
		map.put("true", 1); //状态码
		map.put("cg", "成功"); //结果
		return map; 
	}
	
	//根据id查询
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> findCompanyInfoById(int id){
		System.out.println("进入企业id查询控制器..................");
		Map<String,Object> map = new HashMap<>();
		CompanyInfo companyInfo = cs.findCompanyInfoById(id);
		map.put("true", 1);//状态码
		map.put("cg", "成功"); //结果
		map.put("data",companyInfo);
		return map;
	}
	
	//跳转更新页面
	@RequestMapping("/toUpdateCompanyInfo")
	@ResponseBody
	public ModelAndView toUpdateCompanyInfo() {
		System.out.println("进入跳转企业更新页面控制器.................");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("");
		return mv;
	}
	
	//更新
	@RequestMapping("/updateCompanyInfo")
	@ResponseBody
	public Map<String,Object> updateCompanyInfo(CompanyInfo companyInfo) {
		System.out.println("进入企业更新页面控制器.................");
		Map<String,Object> map = new HashMap<>();
		cs.updateCompanyInfo(companyInfo);
		map.put("true", 1);//状态码
		map.put("cg", "成功");  //结果
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
