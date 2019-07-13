package com.zl.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.user.ConfirmDao;
import com.zl.pojo.user.Confirm;
import com.zl.user.service.ConfirmService;


@Service
public class ConfirmServiceImpl implements ConfirmService {
	@Autowired
	private ConfirmDao cd;
	
	//添加个人认证信息
	public int addConfirm(Confirm confirm) {
		return cd.addConfirm(confirm);
	}

	//根据用户会员id查询
	public Confirm findConfirmByUserID(int userID) {
		return cd.findConfirmByUserID(userID);
	}

	//根据个人id查询
	public Confirm findConfirmById(int id) {
		return cd.findConfirmById(id);
	}
	
	//更新个人信息
	public int updateConfirm(Confirm confirm) {
		return cd.updateConfirm(confirm);
	}
	
}
