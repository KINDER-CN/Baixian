package com.zl.user.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.zl.pojo.user.User;
import com.zl.user.service.LoginService;
import com.zl.user.service.RegisteredService;
import com.zl.user.service.UserService;
import com.zl.util.MD5Util;

@Controller//用户模块控制器
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private LoginService ls;//自动装载登录Service
	@RequestMapping("/login")
	@ResponseBody
	public  Map<String,Object> loginUser(@RequestBody User user,HttpSession session){
		Map<String,Object> resut=new HashMap<String,Object>();
		//MD5编码，对密码进行加密
		System.out.println(user);
		if(user.getPassWord().length()<32) {
			user.setPassWord(MD5Util.MD5(user.getPassWord()));
		}
		//验证登录
		user=ls.login(user);
		System.out.println(user);
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
	public Map<String,Object> registered(@RequestBody User user){
		Map<String,Object> resut=new HashMap<String,Object>();
		user.setRole(0);
		user.setCompanyOrPerson(2);
		int line = rs.registered(user);
		if(line>=1) {
			resut.put("flag", true);
			resut.put("user", user);
		}else {
			resut.put("flag", false);
			resut.put("mess", "注册失败");
		}
		return resut;
	}
	/**
	 * 查找用户信息控制器
	 */
	@Autowired
	private UserService us;
	@RequestMapping("/findUser")
	@ResponseBody
	public Map<String,Object> findUser(HttpSession session){
		Map<String,Object> resut=new HashMap<String,Object>();
		User user=(User) session.getAttribute("user");
		System.out.println(user);
		user = us.queryUserByUserId(user.getId());
		resut.put("user", user);
		return resut;
		
	}
	/**
	 * 修改用户信息控制器
	 */
	@RequestMapping("/updateUser")
	@ResponseBody
	public Map<String,Object> updateUser(@RequestBody User user){
		Map<String,Object> resut=new HashMap<String,Object>();
		int line = us.updateUser(user);
		if(line>=1) {
			resut.put("flag", true);
			resut.put("user", user);
		}else {
			resut.put("flag", false);
			resut.put("mess", "修改失败");
		}
		return resut;
	}
	/**
	 * 上传图片
	 */
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
	
}
