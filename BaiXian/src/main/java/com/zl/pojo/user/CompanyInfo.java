package com.zl.pojo.user;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * 企业商户认证信息
 *
 */

@Component
@Scope("prototype")
public class CompanyInfo {
	private Integer id; //主键id
	private Integer companyNo; //企业编号
	private String companyName;//企业名称
	private Integer province; //省
	private Integer city; //市
	private Integer district; //区
	private String address; //详细地址
	private String businessLicense; //营业执照
	private String orgNo; //组织机构代码orgNo
	private String registrationPic; //税务登记证
	private String officePic; //办公场所图片
	private String permitPic; //食品流通许可证
	private String otherPic1; //其他证件1
	private String otherPic2; //其他证件2
	private String otherPic3; //其他证件3
	private String otherPic4; //其他证件4
	private String companyOwner;  //企业法人姓名
	private Integer companyAudit; //审核状态1,2,0
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date companyUploadDate; //上传日期
	private User userID; //用户id-->外键关联user表id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(Integer companyNo) {
		this.companyNo = companyNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public String getBusinessLicense() {
		return businessLicense;
	}
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	public String getRegistrationPic() {
		return registrationPic;
	}
	public void setRegistrationPic(String registrationPic) {
		this.registrationPic = registrationPic;
	}
	public String getOfficePic() {
		return officePic;
	}
	public void setOfficePic(String officePic) {
		this.officePic = officePic;
	}
	public String getPermitPic() {
		return permitPic;
	}
	public void setPermitPic(String permitPic) {
		this.permitPic = permitPic;
	}
	public String getOtherPic1() {
		return otherPic1;
	}
	public void setOtherPic1(String otherPic1) {
		this.otherPic1 = otherPic1;
	}
	public String getOtherPic2() {
		return otherPic2;
	}
	public void setOtherPic2(String otherPic2) {
		this.otherPic2 = otherPic2;
	}
	public String getOtherPic3() {
		return otherPic3;
	}
	public void setOtherPic3(String otherPic3) {
		this.otherPic3 = otherPic3;
	}
	public String getOtherPic4() {
		return otherPic4;
	}
	public void setOtherPic4(String otherPic4) {
		this.otherPic4 = otherPic4;
	}
	public String getCompanyOwner() {
		return companyOwner;
	}
	public void setCompanyOwner(String companyOwner) {
		this.companyOwner = companyOwner;
	}
	public Integer getCompanyAudit() {
		return companyAudit;
	}
	public void setCompanyAudit(Integer companyAudit) {
		this.companyAudit = companyAudit;
	}
	public Date getCompanyUploadDate() {
		return companyUploadDate;
	}
	public void setCompanyUploadDate(Date companyUploadDate) {
		this.companyUploadDate = companyUploadDate;
	}
	public User getUserID() {
		return userID;
	}
	public void setUserID(User userID) {
		this.userID = userID;
	}
	@Override
	public String toString() {
		return "CompanyInfo [id=" + id + ", companyNo=" + companyNo + ", companyName=" + companyName + ", province="
				+ province + ", city=" + city + ", district=" + district + ", address=" + address + ", businessLicense="
				+ businessLicense + ", orgNo=" + orgNo + ", registrationPic=" + registrationPic + ", officePic="
				+ officePic + ", permitPic=" + permitPic + ", otherPic1=" + otherPic1 + ", otherPic2=" + otherPic2
				+ ", otherPic3=" + otherPic3 + ", otherPic4=" + otherPic4 + ", companyOwner=" + companyOwner
				+ ", companyAudit=" + companyAudit + ", companyUploadDate=" + companyUploadDate + ", userID=" + userID
				+ "]";
	}
	
	
}
