package com.zl.pojo.procurement;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zl.pojo.user.User;
@Component
@Scope("prototype")
public class Purchaseorder {
  private  Integer id;              // 主键id
  private  String  purchaseNo ;     //采购单NO
  private  String  purchaseName;    // 采购单名称
  private  String  PurchasingItems; //采购物品
  private  String  origin;          //产地要求
  private  Integer specifications;  //规格型号
  private  String  level;           //级别要求
  private  String  warehouse;       //仓库要求
  private  String  cargo;           //期现货
  private  String  price;           //价格要求
  private  String  purchastate;     //采购说明
  private  String  payment;         //付款方式
  private  String  invoice;         //发票类型
  private  Integer province;        //省
  private  Integer city;            //市
  private  Integer district;        //区
  private  String  address;         //详细地址（收货地址）
  @DateTimeFormat(pattern="yyyy-MM-dd")
  @JsonFormat(pattern="yyyy-MM-dd")
  private  Date    abortDate;       //采购截止日期
  private  String  contacter;       //联系人
  private  String  companyName;     //公司名
  private  String  phone;           //手机号
  private  Integer trading;         //交易状态0/1/2
  @DateTimeFormat(pattern="yyyy-MM-dd")
  @JsonFormat(pattern="yyyy-MM-dd")
  private  Date    uploadDate;      //上传日期
  private  User    user ;           //user的实体类
  
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getPurchaseNo() {
	return purchaseNo;
}
public void setPurchaseNo(String purchaseNo) {
	this.purchaseNo = purchaseNo;
}
public String getPurchaseName() {
	return purchaseName;
}
public void setPurchaseName(String purchaseName) {
	this.purchaseName = purchaseName;
}
public String getPurchasingItems() {
	return PurchasingItems;
}
public void setPurchasingItems(String purchasingItems) {
	PurchasingItems = purchasingItems;
}
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
public Integer getSpecifications() {
	return specifications;
}
public void setSpecifications(Integer specifications) {
	this.specifications = specifications;
}
public String getLevel() {
	return level;
}
public void setLevel(String level) {
	this.level = level;
}
public String getWarehouse() {
	return warehouse;
}
public void setWarehouse(String warehouse) {
	this.warehouse = warehouse;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getPurchastate() {
	return purchastate;
}
public void setPurchastate(String purchastate) {
	this.purchastate = purchastate;
}
public String getPayment() {
	return payment;
}
public void setPayment(String payment) {
	this.payment = payment;
}
public String getInvoice() {
	return invoice;
}
public void setInvoice(String invoice) {
	this.invoice = invoice;
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
public Date getAbortDate() {
	return abortDate;
}
public void setAbortDate(Date abortDate) {
	this.abortDate = abortDate;
}
public String getContacter() {
	return contacter;
}
public void setContacter(String contacter) {
	this.contacter = contacter;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Integer getTrading() {
	return trading;
}
public void setTrading(Integer trading) {
	this.trading = trading;
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
