package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Query {
	private  String  purchaseName;    // 采购单名称（关键字搜索）
	private String purchasingItems; // 采购物品
	private String origin; // 产地要求
	private Integer specifications; // 规格型号
	private String level; // 级别要求
	private  String  price;           //价格要求
	private  Date    abortDate;       //采购截止日期
	public String getPurchaseName() {
		return purchaseName;
	}
	public String getPurchasingItems() {
		return purchasingItems;
	}
	public String getOrigin() {
		return origin;
	}
	public Integer getSpecifications() {
		return specifications;
	}
	public String getLevel() {
		return level;
	}
	public String getPrice() {
		return price;
	}
	public Date getAbortDate() {
		return abortDate;
	}
	public void setPurchaseName(String purchaseName) {
		this.purchaseName = purchaseName;
	}
	public void setPurchasingItems(String purchasingItems) {
		this.purchasingItems = purchasingItems;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public void setSpecifications(Integer specifications) {
		this.specifications = specifications;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setAbortDate(Date abortDate) {
		this.abortDate = abortDate;
	}
	@Override
	public String toString() {
		return "Query [purchaseName=" + purchaseName + ", purchasingItems=" + purchasingItems + ", origin=" + origin
				+ ", specifications=" + specifications + ", level=" + level + ", price=" + price + ", abortDate="
				+ abortDate + "]";
	}
	
	
}
