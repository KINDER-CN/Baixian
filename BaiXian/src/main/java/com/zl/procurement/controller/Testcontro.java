package com.zl.procurement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.Paging;
import com.zl.pojo.procurement.Purchaseorder;
import com.zl.procurement.service.PurchaseorderService;
@Controller
@RequestMapping("/caigou")
public class Testcontro {
@Autowired
private PurchaseorderService ps;
@RequestMapping("/caigou123")

public String pu(@RequestBody Purchaseorder purchaseorder) {
	String name="no";
	System.out.println(purchaseorder+"..!1111!!1...............");
	 ps.addPurchaseorder(purchaseorder);
	return name;
   }

//mkl
@RequestMapping(value = "/purchaseorderWeb", method = RequestMethod.GET)
@ResponseBody
public Map<String, Object> ListPurchaseorderWeb(Paging paging) {
	Map<String, Object> resut = new HashMap<String, Object>();
	// pag.setPage();
	// SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
	List<Purchaseorder> purchaseorder = ps.queryPurchaseorderByPaging(paging);
	resut.put("purchaseorder", purchaseorder);
	System.out.println(paging.getPage());
	resut.put("paging", paging);
	// System.out.println(paging.getQuery());
	return resut;
}

@RequestMapping(value="/queryPurchaseorderById",method=RequestMethod.GET)
@ResponseBody
public Map<String, Object> queryPurchaseorderById(String id) {
	
	Map<String, Object> resut = new HashMap<String, Object>();
	Purchaseorder purchaseorder = ps.queryPurchaseorderById(new Integer(id));
	System.out.println(id);
	resut.put("p", purchaseorder);
	return resut;
}

}
