package com.zl.user.service.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.user.UserDao;
import com.zl.pojo.user.User;
import com.zl.user.service.RegisteredService;
import com.zl.util.MD5Util;
@Service
public class RegisteredServiceImpl implements RegisteredService {
	@Autowired
	private UserDao ud;
	@Override
	public int registered(User user) {
		//生成随机数
		Random ran=new Random();
		//定义用户编号
		String userNo="BX"+ran.nextInt(10000);
		user.setUserno(userNo);
		//给用户密码加密
		user.setPassWord(MD5Util.MD5(user.getPassWord()));
		System.out.println(user);
		int line=ud.registered(user);
		return line;
	}

}
