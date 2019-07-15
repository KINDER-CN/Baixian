package com.zl.resouce.service;

import java.util.List;

import com.zl.pojo.Paging;
import com.zl.pojo.Query;
import com.zl.pojo.resource.ResourcesItems;
import com.zl.pojo.resource.ResourcesSingle;


public interface ResourcesItemsService {
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
	public List<ResourcesItems> queryResourcesItemsByFy(Paging pg);
}
