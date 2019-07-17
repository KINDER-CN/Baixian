package com.zl.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.user.UserDao;
import com.zl.pojo.user.User;
import com.zl.user.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao ud;
	@Override
	public User queryUserByUserId(Integer userid) {
		User user = ud.queryUserByUserId(userid);
		return user;
	}

	@Override
	public int updateUser(User user) {
		int line = ud.updateUser(user);
		return line;
	}

}
