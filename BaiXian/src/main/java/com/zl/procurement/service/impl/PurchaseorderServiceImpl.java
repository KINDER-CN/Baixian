package com.zl.procurement.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.procurement.PurchaseorderDao;
import com.zl.pojo.procurement.Purchaseorder;
import com.zl.procurement.service.PurchaseorderService;
@Service
public class PurchaseorderServiceImpl implements PurchaseorderService {
	@Autowired
	private PurchaseorderDao pd;
	@Override
	public int addPurchaseorder(Purchaseorder purchaseorder) {
		System.out.println(purchaseorder);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		Date d=new Date();
		purchaseorder.setPurchaseNo(sdf.format(d)+"");
		int result=pd.addPurchaseorder(purchaseorder);
		return result;
	}

}
