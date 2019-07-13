package com.zl.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.user.User;
import com.zl.user.service.LoginService;
import com.zl.user.service.RegisteredService;
import com.zl.util.MD5Util;

@Controller//用户模块控制器
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private LoginService ls;//自动装载登录Service
	@RequestMapping("/login")
	@ResponseBody
	public Map<String,Object> loginUser(User user,HttpSession session){
		Map<String,Object> resut=new HashMap<String,Object>();
		//MD5编码，对密码进行加密
		if(user.getPassWord().length()<32) {
			user.setPassWord(MD5Util.MD5(user.getPassWord()));
		}
		//验证登录
		user=ls.login(user);
		if(user!=null) {
			session.setAttribute("user", user);
			resut.put("flag", true);
		}else {
			resut.put("flag", false);
			resut.put("mess", "用户名或者密码错误");
		}
		return resut;
	}
	/**
	 * 注册控制器
	 */
	@Autowired
	private RegisteredService rs;  //自动装载注册Service
	@RequestMapping("/registered")
	@ResponseBody
	public Map<String,Object> registered(User user){
		Map<String,Object> resut=new HashMap<String,Object>();
		int line = rs.registered(user);
		if(line>=1) {
			resut.put("flag", true);
		}else {
			resut.put("flag", false);
			resut.put("mess", "注册失败");
		}
		return resut;
	}
}
