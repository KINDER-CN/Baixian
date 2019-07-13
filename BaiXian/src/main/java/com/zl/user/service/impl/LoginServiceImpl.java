package com.zl.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.user.UserDao;
import com.zl.pojo.user.User;
import com.zl.user.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private UserDao ud;//自动注入dao层
	@Override
	public User login(User user) {
		return ud.login(user);//传入参数，验证用户密码登录
	}

}
