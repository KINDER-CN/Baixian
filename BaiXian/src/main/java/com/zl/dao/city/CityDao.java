package com.zl.dao.city;

import java.util.List;

import com.zl.pojo.city.City;
import com.zl.pojo.city.District;
import com.zl.pojo.city.Province;

public interface CityDao {
	/**
	 * 查询所有省表findProvince
	 */
	public List<Province> findProvince();
	
	/**
	 * 根据省id查询城市名称findCityById
	 */
	public List<City> findCityByProID(Integer proID);
	
	/**
	 * 根据城市id查询城市的区findDistrictByCityId
	 */
	public List<District> findDistrictByCityId(Integer cityID);
}
