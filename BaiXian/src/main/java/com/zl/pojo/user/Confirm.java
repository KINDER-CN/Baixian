package com.zl.pojo.user;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 个人认证信息表
 */

@Component
@Scope("prototype")
public class Confirm {
	private Integer id; //主键id
	private String firmId; //认证表id
	private String firmName; //姓名
	private String firmno; //身份证号码Idno
	private String firmPic; //身份证照片Idphoto
	private Integer province; //省
	private Integer city;  //市
	private Integer district; //区
	private String address; //详细地址
	private String mobileNumber; //手机号
	private String email;  //电子邮箱E-mails
	private String personUploadDate; //上传日期
	private Integer personAudit; //审核状态0,1,2
	private User userID; //userID用户id --->外键关联user表
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirmId() {
		return firmId;
	}
	public void setFirmId(String firmId) {
		this.firmId = firmId;
	}
	public String getFirmName() {
		return firmName;
	}
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public String getFirmno() {
		return firmno;
	}
	public void setFirmno(String firmno) {
		this.firmno = firmno;
	}
	public String getFirmPic() {
		return firmPic;
	}
	public void setFirmPic(String firmPic) {
		this.firmPic = firmPic;
	}
	public Integer getProvince() {
		return province;
	}
	public void setProvince(Integer province) {
		this.province = province;
	}
	public Integer getCity() {
		return city;
	}
	public void setCity(Integer city) {
		this.city = city;
	}
	public Integer getDistrict() {
		return district;
	}
	public void setDistrict(Integer district) {
		this.district = district;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPersonUploadDate() {
		return personUploadDate;
	}
	public void setPersonUploadDate(String personUploadDate) {
		this.personUploadDate = personUploadDate;
	}
	public Integer getPersonAudit() {
		return personAudit;
	}
	public void setPersonAudit(Integer personAudit) {
		this.personAudit = personAudit;
	}
	public User getUserID() {
		return userID;
	}
	public void setUserID(User userID) {
		this.userID = userID;
	}
	
}
