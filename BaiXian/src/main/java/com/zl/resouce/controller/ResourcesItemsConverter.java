package com.zl.resouce.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.zl.pojo.Paging;
import com.zl.pojo.resource.ResourcesItems;
import com.zl.pojo.resource.ResourcesSingle;
import com.zl.resouce.service.ResourcesItemsService;
@Controller
@RequestMapping("/res")
public class ResourcesItemsConverter {
	@Autowired
	private ResourcesItemsService ris;
	/*
	 * 资源物品添加
	 * */
	@ResponseBody
	@RequestMapping("/test")
		 public String testUser(@RequestParam(value = "resources") String data) {
	        JsonArray ja = new Gson().fromJson(data, JsonArray.class);
	        Iterator<JsonElement> ija = ja.iterator();
	        int i = 1;
	        while (ija.hasNext()) {
	        	ResourcesItems resource = new Gson().fromJson(ija.next(), ResourcesItems.class);
	            System.out.println("第" + i + "条资源的名称" + resource.toString());
	            i++;
	            int aa = (int)(Math.random() * 1000000);
	            resource.setrNo(aa);
	            resource.setBrand("福喜");
	            ris.addResourcesItems(resource);
	        }
	        return data;
	    }
	@RequestMapping(method=RequestMethod.POST)
	public String addLib(ResourcesItems resourcesItems,ResourcesSingle resourcesSingle) throws Exception {
		ris.addResourcesItems(resourcesItems);
		ris.addResourcesSingle(resourcesSingle);
		return "redirect:/lib";
	}
	/**
	 * 资源单信息查询
	*/
	@RequestMapping("/ziYuan")
	@ResponseBody
	public Map<String,Object> queryResourcesItemsByFy(Paging pg){
		Map<String,Object> map=new HashMap<String,Object>();
		List<ResourcesItems> list=ris.queryResourcesItemsByFy(pg);
		map.put("data", list);
		map.put("pg", pg);
		return map;
	}
}
