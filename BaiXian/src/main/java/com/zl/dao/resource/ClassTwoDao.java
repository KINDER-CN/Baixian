package com.zl.dao.resource;

import com.zl.pojo.resource.ClassTwo;

public interface ClassTwoDao {
	/**
	 * 三级分类表class_three级联查询二级分类表class_two
	*/
	public ClassTwo findClassTwoById();
}
