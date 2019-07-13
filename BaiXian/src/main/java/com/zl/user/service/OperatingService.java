package com.zl.user.service;

import com.zl.pojo.user.Operating;

/**
 * 授权运营者 
 *  -->Service层
 */
public interface OperatingService {
	/**
	 * 添加授权运营者信息
	 */
	public int addOperating(Operating operating);
	
	/**
	 * 根据id查询
	 */
	public Operating findOperatingById(int id);
}
