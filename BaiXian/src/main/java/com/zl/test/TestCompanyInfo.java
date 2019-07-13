package com.zl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zl.pojo.user.CompanyInfo;
import com.zl.user.service.CompanyInfoService;

public class TestCompanyInfo {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:springIOC.xml");
		CompanyInfoService cs = ac.getBean(CompanyInfoService.class);
		CompanyInfo c = new CompanyInfo();
		
		/*c.setCompanyNo(1234);
		c.setCompanyName("知领互联");
		c.setProvince(10);
		c.setCity(12);
		c.setDistrict(13);
		c.setAddress("XXXXXXXX");
		c.setBusinessLicense("1024858AD2S435");
		c.setOtherPic1("1235467");
		c.setRegistrationPic("fsfsafsa");
		c.setOfficePic("fsafsa");
		c.setPermitPic("qewqe");
		c.setOtherPic1("1234");
		c.setOtherPic2("4567");
		c.setOtherPic3("6789");
		c.setOtherPic4("9876");
		c.setCompanyOwner("张三");
		c.setCompanyAudit(1);
		System.out.println(cs.addCompanyInfo(c));*/
		System.out.println(cs.findCompanyInfoById(1));
	}

}
