package com.zl.city.service;

import java.util.List;

import com.zl.pojo.city.City;
import com.zl.pojo.city.District;
import com.zl.pojo.city.Province;

public interface CityService {
	/**
	 * 查询省
	 */
	public List<Province> findProvince();
	
	/**
	 * 查询市
	 */
	public List<City> findCityByProId(Integer proId);
	
	/**
	 * 查询区
	 */
	public List<District> findDistrictByCityId(Integer cityId);
}
