package com.zl.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zl.pojo.procurement.Purchaseorder;
import com.zl.procurement.service.PurchaseorderService;

public class TestPurchaseorder {
	public static void main(String[] args) throws ParseException {
		ApplicationContext app=new ClassPathXmlApplicationContext("classpath:spring*.xml");
		PurchaseorderService  ps=(PurchaseorderService) app.getBean("purchaseorderServiceImpl");
		Purchaseorder p=new  Purchaseorder();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse("2019-11-11");
		p.setAbortDate(d);
		p.setAddress("dhahdoisaad");
		p.setCargo("dsad");
		p.setCity(2);
		p.setCompanyName("dsadsad");
		p.setContacter("大萨达撒多 ");
		p.setDistrict(3);
		p.setInvoice("dwdq");
		p.setLevel("eee");
		p.setOrigin("dsafge");
		p.setPayment("dsadsaf");
		p.setPhone("dsaf");
		p.setPrice("123");;
		p.setProvince(55);
		p.setPurchaseName("dsaf");
		p.setPurchasingItems("fqqw");
		p.setUploadDate(d);
		System.out.println(p+"............");
		ps.addPurchaseorder(p);
     
	}
}
