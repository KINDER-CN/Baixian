package com.zl.resouce.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zl.pojo.resource.ResourcesItems;
import com.zl.pojo.resource.ResourcesSingle;
import com.zl.resouce.service.ResourcesItemsService;
@Controller
@RequestMapping("/res")
public class ResourcesItemsConverter {
	@Autowired
	private ResourcesItemsService ris;
	@RequestMapping("/add")
	public String toAddLib(Map<String,Object> map) {
		//List<ResourcesItems> res=ris.queryLibt();
		//map.put("res", res);
		return "addLib";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String addLib(ResourcesItems resourcesItems,ResourcesSingle resourcesSingle) throws Exception {
		ris.addResourcesItems(resourcesItems);
		ris.addResourcesSingle(resourcesSingle);
		return "redirect:/lib";
	}
}
