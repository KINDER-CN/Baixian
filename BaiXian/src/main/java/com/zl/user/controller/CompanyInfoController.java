package com.zl.user.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.zl.pojo.user.CompanyInfo;
import com.zl.pojo.user.Operating;
import com.zl.user.service.CompanyInfoService;
import com.zl.user.service.OperatingService;

/**
 * 添加企业认证信息
 *   -->控制层
 */

@Controller 
@RequestMapping("/companyInfo")
public class CompanyInfoController {
	@Autowired
	private CompanyInfoService cs;
	@Autowired
	private OperatingService op;
	
	//转到添加页面
	@RequestMapping("/toAddCompanyInfo")
	@ResponseBody
	public ModelAndView toAddCompanyInfo() {
		System.out.println("进入跳转企业添加页面控制器.................");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("");
		return mv;
	}
	
	@RequestMapping("/upload")
	@ResponseBody
	public Map<String,Object> upload(String name,@RequestParam("imgFile") CommonsMultipartFile imgFile){
		Map<String,Object> map=new HashMap<>();
		if(imgFile.getSize()>0) {
			//获取原始文件名称
			String oldFileName=imgFile.getOriginalFilename();//aaa.jpg
			//创建新文件名称
			String newFileName=UUID.randomUUID().toString()+oldFileName.substring(oldFileName.lastIndexOf("."));
			//创建新文件
			File newFile=new File("D:/apache-tomcat-8.0.50/webapps/img/"+newFileName);
			//如果文件不存在我们手动创建出来
			if(!newFile.exists()) {
				newFile.mkdir();
			}
			//把旧文件中的数据写新文件中
			try {
				imgFile.transferTo(newFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
			map.put("flag", true);
			map.put("url", "../img/"+newFileName);
			System.out.println(newFileName+";;;;;;;;;;;;;;;;;;");
		}
		return map;
	}
	
	//添加
	@RequestMapping("/addCompanyInfo")
	@ResponseBody
	public Map<String,Object> addCompanyInfo(CompanyInfo companyInfo,String isno,Operating operating) {
		System.out.println("进入企业添加控制器.................");
		Map<String,Object> map = new HashMap<>();
		if("yes".equals(isno) && companyInfo.getCompanyName()!=null && !"".equals(companyInfo.getCompanyName()) && companyInfo.getAddress()!=null && !"".equals(companyInfo.getAddress()) && companyInfo.getCompanyOwner()!=null && !"".equals(companyInfo.getCompanyOwner()) && operating.getOpeName()!=null && !"".equals(operating.getOpeName()) && operating.getOpeJob()!=null && !"".equals(operating.getOpeJob()) && operating.getOpePhone()!=null && !"".equals(operating.getOpePhone())) {
			System.out.println("444444444444");
			cs.addCompanyInfo(companyInfo);
			op.addOperating(operating);
			map.put("true", 1); //状态码
			map.put("cg", "成功"); //结果
		}else {
			System.out.println("33333333333333");
			map.put("e", 0); //状态码
		}
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
