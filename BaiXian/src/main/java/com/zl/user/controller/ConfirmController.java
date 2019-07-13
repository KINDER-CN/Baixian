package com.zl.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zl.pojo.user.Confirm;
import com.zl.user.service.ConfirmService;

/**
 * 个人认证信息
 * 	-->控制层
 */

@Controller
@RequestMapping("/confirm")
public class ConfirmController {
	@Autowired
	private ConfirmService cs;
	
	//转到添加页面
	@RequestMapping("/toAddConfirm")
	@ResponseBody
	public ModelAndView toAddConfirm() {
		System.out.println("进入跳转个人添加页面控制器.................");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("addConfirm");
		return mv;
	}
		
	//添加
	@RequestMapping("/addConfirm")
	@ResponseBody
	public Map<String,Object> addConfirm(Confirm confirm) {
		System.out.println("进入个人添加控制器.................");
		Map<String,Object> map = new HashMap<>();
		cs.addConfirm(confirm);
		map.put("true", 1); //状态码
		map.put("cg", "成功"); //结果
		return map; 
	} 
	
	//根据id查询
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> findConfirmById(int id){
		System.out.println("进入个人id查询控制器.................");
		Map<String,Object> map = new HashMap<>();
		Confirm confirm = cs.findConfirmById(id);
		map.put("true", 1);//状态码
		map.put("cg", "成功"); //结果
		map.put("data",confirm);
		return map;
	}
	
	//跳转更新页面
	@RequestMapping("/toUpdateConfirm")
	@ResponseBody
	public ModelAndView toUpdateConfirm() {
		System.out.println("进入跳转个人更新页面控制器.................");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("");
		return mv;
	}
		
	//更新
	@RequestMapping("/updateConfirm")
	@ResponseBody
	public Map<String,Object> updateConfirm(Confirm confirm) {
		System.out.println("进入个人更新页面控制器.................");
		Map<String,Object> map = new HashMap<>();
		cs.updateConfirm(confirm);
		map.put("true", 1);//状态码
		map.put("cg", "成功");  //结果
		return map;
	}
}
