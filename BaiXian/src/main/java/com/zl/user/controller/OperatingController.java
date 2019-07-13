package com.zl.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zl.pojo.user.Operating;
import com.zl.user.service.OperatingService;

/**
 * 授权运营者 
 *  -->控制层
 */

@Controller
@RequestMapping("/operating")
public class OperatingController {
	@Autowired
	private OperatingService op;
	
	//转到添加页面
	@RequestMapping("/toAddOperating")
	@ResponseBody
	public ModelAndView toAddOperating() {
		System.out.println("进入跳转授权运营者添加页面控制器.................");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("");
		return mv;
	}
			
	//添加
	@RequestMapping("/addOperating")
	@ResponseBody
	public Map<String,Object> addOperating(Operating operating) {
		System.out.println("进入授权运营者添加控制器.................");
		Map<String,Object> map = new HashMap<>();
		op.addOperating(operating);
		map.put("true", 1); //状态码
		map.put("cg", "成功"); //结果
		return map; 
	} 
	
	
	//根据id查询
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> findOperatingById(int id){
		System.out.println("进入授权运营者id查询控制器................");
		Map<String,Object> map = new HashMap<>();
		Operating operating = op.findOperatingById(id);
		map.put("true", 1);//状态码
		map.put("cg", "成功"); //结果
		map.put("data",operating);
		return map;
	}
}
