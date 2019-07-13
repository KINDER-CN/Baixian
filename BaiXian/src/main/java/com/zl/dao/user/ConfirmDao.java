package com.zl.dao.user;

import com.zl.pojo.user.Confirm;

/**
 * 个人表
 * -->增删查改
 */

public interface ConfirmDao {
	/**
	 * 添加个人认证信息
	 *   -->返回结果
	 */
	public int addConfirm(Confirm confirm);
	
	/**
	 * 根据用户会员id查询
	 *   -->返回个人信息
	 */
	public Confirm findConfirmByUserID(int userID); 
	
	/**
	 * 更新个人信息
	 *   -->返回结果
	 */
	public int updateConfirm(Confirm confirm);
	
	/**
	 * 根据个人id查询
	 *   -->返回个人信息
	 */
	public Confirm findConfirmById(int id);
	
}
