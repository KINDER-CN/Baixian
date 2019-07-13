package com.zl.resouce.service;

import java.util.List;

import com.zl.pojo.Paging;
import com.zl.pojo.Query;
import com.zl.pojo.resource.ResourcesItems;


public interface ResourcesItemsService {
	public int addResourcesItems(ResourcesItems resourcesItems);
	public List<ResourcesItems> findResourcesItemsByQuery();
	/**
	 * 多条件分页查询s
	 */
	public List<ResourcesItems> queryResourcesItemsByFy(Paging pg);
	/**
	 * 查询符合要求的记录总数count(*)
	 */
	public int queryRowCount(Query query);
}
