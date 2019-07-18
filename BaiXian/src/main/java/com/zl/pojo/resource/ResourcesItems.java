package com.zl.pojo.resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//资源物品单
@Component
@Scope("prototype")
public class ResourcesItems {
	private Integer id;			//主键id
	private Integer rNo;		//资源物品单No
	private ClassThree classThree;		//(三级类)产品类别
	private String brand;		//品牌
	private String product;		//产品名称
	private String origin;		//产地
	private String uploadDate;	//规格型号
	private String specifications;//级别
	private String amount;		//数量
	private String rprice;		//单价
	private String rcurrency;	//货币
	private String rwarehouse;	//仓库
	private String rCargo;		//期/现货
	private String note;		//备注
	private ResourcesSingle resourcesSingle; 	//资源单id   外键关联资源单
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getrNo() {
		return rNo;
	}
	public void setrNo(Integer rNo) {
		this.rNo = rNo;
	}
	
	public ClassThree getClassThree() {
		return classThree;
	}
	public void setClassThree(ClassThree classThree) {
		this.classThree = classThree;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getRprice() {
		return rprice;
	}
	public void setRprice(String rprice) {
		this.rprice = rprice;
	}
	public String getRcurrency() {
		return rcurrency;
	}
	public void setRcurrency(String rcurrency) {
		this.rcurrency = rcurrency;
	}
	public String getRwarehouse() {
		return rwarehouse;
	}
	public void setRwarehouse(String rwarehouse) {
		this.rwarehouse = rwarehouse;
	}
	public String getrCargo() {
		return rCargo;
	}
	public void setrCargo(String rCargo) {
		this.rCargo = rCargo;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public ResourcesSingle getResourcesSingle() {
		return resourcesSingle;
	}
	public void setResourcesSingle(ResourcesSingle resourcesSingle) {
		this.resourcesSingle = resourcesSingle;
	}
	
}
