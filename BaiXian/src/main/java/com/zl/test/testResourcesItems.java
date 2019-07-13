package com.zl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zl.pojo.resource.ResourcesItems;
import com.zl.pojo.resource.ResourcesSingle;
import com.zl.resouce.service.ResourcesItemsService;

public class testResourcesItems {
public static void main(String[] args) {
	ApplicationContext app =new ClassPathXmlApplicationContext("classpath:springIOC.xml");
	ResourcesItemsService ris = (ResourcesItemsService) app.getBean("resourcesItemsServiceImpl");
	ResourcesItems ri=new ResourcesItems();
	ResourcesSingle rs=new ResourcesSingle();
	rs.setRphone("1111111");
	ri.setAmount("99");
	ri.setProduct("大家");
	ris.addResourcesSingle(rs);
	ris.addResourcesItems(ri);
	System.out.println("wowowow");
}
}
