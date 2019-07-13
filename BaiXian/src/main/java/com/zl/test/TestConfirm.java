package com.zl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zl.pojo.user.Confirm;
import com.zl.user.service.ConfirmService;

public class TestConfirm {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:springIOC.xml");
		ConfirmService cs = ac.getBean(ConfirmService.class);
		
		/*Confirm c= new Confirm();
		c.setAddress("sfsafsafa");
		c.setFirmName("fafsafsafsa");
		c.setEmail("sfsafsafsa");
		
		System.out.println(cs.addConfirm(c));*/
		
		System.out.println(cs.findConfirmById(1));
	}

}
