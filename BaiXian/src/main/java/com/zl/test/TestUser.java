package com.zl.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zl.pojo.Paging;
import com.zl.pojo.resource.ResourcesItems;
import com.zl.pojo.user.User;
import com.zl.resouce.service.ResourcesItemsService;
import com.zl.user.service.LoginService;
import com.zl.user.service.RegisteredService;
import com.zl.user.service.impl.RegisteredServiceImpl;

public class TestUser {

	public static void main(String[] args) {
		ApplicationContext app =new ClassPathXmlApplicationContext("classpath:springIOC.xml");
		//RegisteredService rs = (RegisteredService) app.getBean("registeredServiceImpl");
		LoginService ls = (LoginService) app.getBean("loginServiceImpl");
		User user = new User();
		user.setUserName("张三");
		user.setPassWord("E10ADC3949BA59ABBE56E057F20F883E");
		
		//user.setPhone("133333333333");
		
		
		//System.out.println(rs.registered(user));
		//System.out.println(ls.login(user));
		
	}

}
