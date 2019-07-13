package com.zl.pojo.resource;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.zl.pojo.user.User;
//资源单
@Component
@Scope("prototype")
public class ResourcesSingle {
	private Integer id; 		//主键id
	private String singleNo; 	//资源单no
	private User user;			//用户id   外键关联userid
	private String rphone;		//联系电话
	private String resourceState;//资源单说明
	private Date uploadDate;	//上传日期
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSingleNo() {
		return singleNo;
	}
	public void setSingleNo(String singleNo) {
		this.singleNo = singleNo;
	}
	public String getRphone() {
		return rphone;
	}
	public void setRphone(String rphone) {
		this.rphone = rphone;
	}
	public String getResourceState() {
		return resourceState;
	}
	public void setResourceState(String resourceState) {
		this.resourceState = resourceState;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
