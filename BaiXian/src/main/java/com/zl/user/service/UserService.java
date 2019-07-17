package com.zl.user.service;

import com.zl.pojo.user.User;

public interface UserService {
	/**
	 * 根据id查找用户信息
	 */
	public User queryUserByUserId(Integer userid);
	
	/**
	 * 修改用户信息
	 */
	public int updateUser(User user);
}
