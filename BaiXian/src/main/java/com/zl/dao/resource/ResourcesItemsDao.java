package com.zl.dao.resource;

import java.util.List;

import com.zl.pojo.Paging;
import com.zl.pojo.Query;
import com.zl.pojo.resource.ResourcesItems;
import com.zl.pojo.resource.ResourcesSingle;


public interface ResourcesItemsDao {
	/**
	 * 增加资源物品
	 * */
	public int addResourcesItems(ResourcesItems resourcesItems);
	/**
	 * 增加资源单
	 * */
	public int addResourcesSingle(ResourcesSingle resourcesSingle);
	/**
	 * 多条件分页查询s
	 */
	public List<ResourcesItems> findResourcesItemsByFy(Paging pg);
	/**
	 * 查询符合要求的记录总数count(*)
	 */
	public int findResourcesItemsRowCount();
	

}
