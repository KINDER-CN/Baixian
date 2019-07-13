package com.zl.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.user.OperatingDao;
import com.zl.pojo.user.Operating;
import com.zl.user.service.OperatingService;

@Service
public class OperatingServiceImpl implements OperatingService{
	@Autowired
	private OperatingDao od;
	@Override
	public int addOperating(Operating operating) {
		return od.addOperating(operating);
	}

	@Override
	public Operating findOperatingById(int id) {
		return od.findOperatingById(id);
	}
	
}
