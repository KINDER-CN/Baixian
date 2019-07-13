package com.zl.pojo.user;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 用户表
 */

@Component
@Scope("prototype")
public class User {
	private Integer id; //主键id
	private String userno; //用户编号
	private String userName; //用户名
	private String passWord; //用户密码
	private String phone; //联系电话
	private String nickName; //用户昵称
	private String avatar; //图片（路径地址）
	private String email; //电子邮箱
	private Integer province; //省
	private Integer city; //市
	private Integer district; //区
	private String address; //详细地址
	private Integer role; //0普通用户，1供应商，2采购商，3采购供应商
	private Integer companyOrPerson; //0个人，1公司
	private Date registerDate; //注册日期（获取当前时间）
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserno() {
		return userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public Integer getCompanyOrPerson() {
		return companyOrPerson;
	}
	public void setCompanyOrPerson(Integer companyOrPerson) {
		this.companyOrPerson = companyOrPerson;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userno=" + userno + ", userName=" + userName + ", passWord=" + passWord
				+ ", phone=" + phone + ", nickName=" + nickName + ", avatar=" + avatar + ", email=" + email
				+ ", province=" + province + ", city=" + city + ", district=" + district + ", address=" + address
				+ ", role=" + role + ", companyOrPerson=" + companyOrPerson + ", registerDate=" + registerDate + "]";
	}
}
