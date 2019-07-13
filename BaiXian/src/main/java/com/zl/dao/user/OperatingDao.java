package com.zl.dao.user;

import com.zl.pojo.user.Operating;

/**
 * 授权运营者信息表
 * 	-->增删查改
 */

public interface OperatingDao {
	/**
	 * 添加授权运营者信息
	 */
	public int addOperating(Operating operating);
	
	/**
	 * 根据id查询
	 */
	public Operating findOperatingById(int id);
}
