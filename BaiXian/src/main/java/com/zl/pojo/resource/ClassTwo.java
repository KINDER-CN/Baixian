package com.zl.pojo.resource; 

import org.springframework.context.annotation.Scope; 
import org.springframework.stereotype.Component; 

//二级分类表 
@Component 
@Scope("prototype")  
public class ClassTwo { 
    private Integer id;            //主键 
    private Integer twoClassNo;    //二级分类编号 
    private String twoClassName;//二级分类名称 
    private ClassOne classOne;    //一级分类id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTwoClassNo() {
		return twoClassNo;
	}
	public void setTwoClassNo(Integer twoClassNo) {
		this.twoClassNo = twoClassNo;
	}
	public String getTwoClassName() {
		return twoClassName;
	}
	public void setTwoClassName(String twoClassName) {
		this.twoClassName = twoClassName;
	}
	public ClassOne getClassOne() {
		return classOne;
	}
	public void setClassOne(ClassOne classOne) {
		this.classOne = classOne;
	}
    
}
