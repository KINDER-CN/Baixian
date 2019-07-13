package com.zl.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zl.pojo.user.CompanyInfo;
import com.zl.pojo.user.Confirm;
import com.zl.user.service.ConfirmService;

@Controller
@RequestMapping("/confirm")
public class ConfirmController {
	@Autowired
	private ConfirmService cs;
	
	/**
	 * 添加个人认证信息
	 *   -->返回结果
	 */
	//转到添加页面
	@RequestMapping("/toAddConfirm")
	public ModelAndView toAddConfirm() {
		System.out.println("进入跳转添加页面控制器.................");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("addConfirm");
		return mv;
	}
		
	//添加
	@RequestMapping("/addConfirm")
	public String addConfirm(Confirm confirm) {
		int flag;
		System.out.println("进入添加控制器.................");
		flag = cs.addConfirm(confirm);
		System.out.println(flag);
		return "redirect:/new"; 
	} 
}
