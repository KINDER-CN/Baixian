package com.zl.dao.user;

import com.zl.pojo.user.User;

public interface UserDao {
	/**
	 * 登录
	 */
	public User login(User user);
	
	/**
	 * 注册
	 */
	public int registered(User user);
	/**
	 * 修改会员信息
	 */
	public int updateUser(User user);
	/**
	 * 查找用户信息
	 */
	public User queryUserByUserId(Integer id);
}
