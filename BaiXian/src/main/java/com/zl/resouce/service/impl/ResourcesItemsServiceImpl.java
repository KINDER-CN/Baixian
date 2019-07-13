package com.zl.resouce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.resource.ResourcesItemsDao;
import com.zl.pojo.Paging;
import com.zl.pojo.Query;
import com.zl.pojo.resource.ResourcesItems;
import com.zl.resouce.service.ResourcesItemsService;
@Service
public class ResourcesItemsServiceImpl implements ResourcesItemsService {
	@Autowired
	private ResourcesItemsDao rid;
	@Override
	public int addResourcesItems(ResourcesItems resourcesItems) {
			int result=rid.addResourcesItems(resourcesItems);
			return result;
		}

	@Override
	public List<ResourcesItems> findResourcesItemsByQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourcesItems> queryResourcesItemsByFy(Paging pg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int queryRowCount(Query query) {
		// TODO Auto-generated method stub
		return 0;
	}

}
