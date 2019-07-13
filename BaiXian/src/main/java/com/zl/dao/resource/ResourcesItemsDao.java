package com.zl.dao.resource;

import java.util.List;

import com.zl.pojo.Paging;
import com.zl.pojo.Query;
import com.zl.pojo.resource.ResourcesItems;


public interface ResourcesItemsDao {
	public int addResourcesItems(ResourcesItems rid);
	/**
	 * 多条件分页查询s
	 */
	public List<ResourcesItems> findResourcesItemsByFy(Paging pg);
	/**
	 * 查询符合要求的记录总数count(*)
	 */
	public int findResourcesItemsRowCount();
	

}
