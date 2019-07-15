package com.zl.resouce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.resource.ResourcesItemsDao;
import com.zl.pojo.Paging;
import com.zl.pojo.resource.ResourcesItems;
import com.zl.pojo.resource.ResourcesSingle;
import com.zl.resouce.service.ResourcesItemsService;
@Service
public class ResourcesItemsServiceImpl implements ResourcesItemsService {
	@Autowired
	private ResourcesItemsDao rid;
	@Override
	public int addResourcesItems(ResourcesItems resourcesItems) {
			System.out.println(resourcesItems);
			int result=rid.addResourcesItems(resourcesItems);
			return result;
		}
	@Override
	public int addResourcesSingle(ResourcesSingle resourcesSingle) {
		int result=rid.addResourcesSingle(resourcesSingle);
		return result;
	}

	@Override
	public List<ResourcesItems> queryResourcesItemsByFy(Paging pg) {
		pg.setRowsCount(rid.findResourcesItemsRowCount());
		if(pg.getPage()==null) {
			pg.setPage(1);
		}
		if(pg.getPage()<1) {
			pg.setPage(1);
		}
		if(pg.getPage()>pg.getPageCount() && pg.getPageCount()>0) {
			pg.setPage(pg.getPageCount());
		}
		List<ResourcesItems> list=rid.findResourcesItemsByFy(pg);
		return list;
	}


	

}
