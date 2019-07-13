package com.zl.pojo.resource; 

import org.springframework.context.annotation.Scope; 
import org.springframework.stereotype.Component; 

//一级分类表 

@Component  
@Scope("prototype")  
public class ClassOne {  
    private Integer id;            //主键 
    private Integer oneClassNo;    //一级分类编号 
    private String oneClassName;//一级分类名称 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOneClassNo() {
		return oneClassNo;
	}
	public void setOneClassNo(Integer oneClassNo) {
		this.oneClassNo = oneClassNo;
	}
	public String getOneClassName() {
		return oneClassName;
	}
	public void setOneClassName(String oneClassName) {
		this.oneClassName = oneClassName;
	}
} 