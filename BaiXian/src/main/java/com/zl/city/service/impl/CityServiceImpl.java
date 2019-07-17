package com.zl.city.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.city.service.CityService;
import com.zl.dao.city.CityDao;
import com.zl.pojo.city.City;
import com.zl.pojo.city.District;
import com.zl.pojo.city.Province;
@Service
public class CityServiceImpl implements CityService {
	@Autowired
	private CityDao cd;
	@Override
	public List<Province> findProvince() {
		List<Province> list = cd.findProvince();
		return list;
	}

	@Override
	public List<City> findCityByProId(Integer proId) {
		List<City> list=cd.findCityByProID(proId);
		return list;
	}

	@Override
	public List<District> findDistrictByCityId(Integer cityId) {
		List<District> list = cd.findDistrictByCityId(cityId);
		return list;
	}

}
