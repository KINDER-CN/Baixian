package com.zl.pojo.user;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 授权运营者信息表
 */

@Component
@Scope("prototype")
public class Operating {
	private Integer id;  //主键id
	private Integer opeID; //信息表id
	private String opeName; //运营者姓名
	private String opeJob; //运营者职务
	private String opePhone; //运营者联系方式
	private String opePic; //授权运营书
	private CompanyInfo companyID; //企业ID--->外键关联企业信息表
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOpeID() {
		return opeID;
	}
	public void setOpeID(Integer opeID) {
		this.opeID = opeID;
	}
	public String getOpeName() {
		return opeName;
	}
	public void setOpeName(String opeName) {
		this.opeName = opeName;
	}
	public String getOpeJob() {
		return opeJob;
	}
	public void setOpeJob(String opeJob) {
		this.opeJob = opeJob;
	}
	public String getOpePhone() {
		return opePhone;
	}
	public void setOpePhone(String opePhone) {
		this.opePhone = opePhone;
	}
	public String getOpePic() {
		return opePic;
	}
	public void setOpePic(String opePic) {
		this.opePic = opePic;
	}
	public CompanyInfo getCompanyID() {
		return companyID;
	}
	public void setCompanyID(CompanyInfo companyID) {
		this.companyID = companyID;
	}
}
