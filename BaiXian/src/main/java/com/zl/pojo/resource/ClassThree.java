package com.zl.pojo.resource; 

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 

//三级分类表 
@Component 
@Scope("prototype")  
public class ClassThree { 

    private Integer id;                //主键 
    private Integer threeClassNo;    //三级分类编号 
    private String threeClassName;    //三级分类名称 
    private ClassTwo classTwo;        //二级分类id  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getThreeClassNo() {
		return threeClassNo;
	}
	public void setThreeClassNo(Integer threeClassNo) {
		this.threeClassNo = threeClassNo;
	}
	public String getThreeClassName() {
		return threeClassName;
	}
	public void setThreeClassName(String threeClassName) {
		this.threeClassName = threeClassName;
	}
	public ClassTwo getClassTwo() {
		return classTwo;
	}
	public void setClassTwo(ClassTwo classTwo) {
		this.classTwo = classTwo;
	}
    
}