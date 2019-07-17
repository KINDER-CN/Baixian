package com.zl.city.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.city.service.CityService;
import com.zl.pojo.city.City;
import com.zl.pojo.city.District;
import com.zl.pojo.city.Province;

@Controller
@RequestMapping("city")
public class CityController {
	@Autowired
	private CityService cs;
	/**
	 * 查找省
	 * @return
	 */
	@RequestMapping("/pro")
	@ResponseBody
	public Map<String,Object> findPro(){
		Map<String,Object> resut=new HashMap<String,Object>();
		List<Province> pro = cs.findProvince();
		resut.put("pro", pro);
		return resut;
	}
	/**
	 * 查找市
	 */
	@RequestMapping("/city")
	@ResponseBody
	public Map<String,Object> findCityByProId(Integer proId){
		Map<String,Object> resut=new HashMap<String,Object>();
		List<City> city = cs.findCityByProId(proId);
		resut.put("city", city);
		return resut;
		
	}
	/**
	 * 查找区
	 */
	@RequestMapping("/dis")
	@ResponseBody
	public Map<String,Object> finDistrictByCityId(Integer dis){
		Map<String,Object> resut=new HashMap<String,Object>();
		List<District> district = cs.findDistrictByCityId(dis);
		resut.put("district", district);
		return resut;
	}
	
}
