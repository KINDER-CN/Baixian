package com.zl.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.user.BankAccountInfo;
import com.zl.pojo.user.User;
import com.zl.user.service.BankInfoService;

@Controller//用户模块控制器
@RequestMapping("bank")
public class BankController {
	@Autowired
	private BankInfoService bfs;
	@RequestMapping("/updateAdd")
	@ResponseBody
	public Map<String,Object> updateBank(@RequestBody BankAccountInfo bank){
		Map<String,Object> resut=new HashMap<String,Object>();
		if(bank.getId()!=null) {
			int line = bfs.updateBankInfo(bank);
			if(line>=1) {
				resut.put("bank", bank);
			}else {
				resut.put("mess", "保存失败");
			}
			
		}else {
			int line = bfs.addBankInfo(bank);
			if(line>=1) {
				resut.put("bank", bank);
			}else {
				resut.put("mess", "保存失败");
			}
		}
		return resut;
	}
	
	@RequestMapping("/find")
	@ResponseBody
	public Map<String,Object> findBankInfo(HttpSession session){
		Map<String,Object> resut=new HashMap<String,Object>();
		User user=(User) session.getAttribute("user");
		BankAccountInfo bank=bfs.findBankInfoByUserId(user.getId());
		resut.put("bank", bank);
		return resut;
	}
	
}
