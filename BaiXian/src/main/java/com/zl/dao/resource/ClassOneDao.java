package com.zl.dao.resource;

import com.zl.pojo.resource.ClassOne;

public interface ClassOneDao {
	
	/**
	 * 二级分类表class_two级联查询一级分类表class_one
	*/
	
	public ClassOne findClassOneById();
}
