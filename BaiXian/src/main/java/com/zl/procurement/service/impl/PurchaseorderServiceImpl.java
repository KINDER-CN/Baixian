package com.zl.procurement.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.procurement.PurchaseorderDao;
import com.zl.pojo.Paging;
import com.zl.pojo.Query;
import com.zl.pojo.procurement.Purchaseorder;
import com.zl.procurement.service.PurchaseorderService;
@Service
public class PurchaseorderServiceImpl implements PurchaseorderService {
	@Autowired
	private PurchaseorderDao pd;
	@Override
	public int addPurchaseorder(Purchaseorder purchaseorder) {
		System.out.println(purchaseorder);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddmmss");
		Date d=new Date();
		purchaseorder.setPurchaseNo(sdf.format(d));
		purchaseorder.setUploadDate(d);
		purchaseorder.setTrading(1);
		int result=pd.addPurchaseorder(purchaseorder);
		return result;
	}
	
	/**
	 * 根据id查看采购商信息
	 */
	@Override
	public Purchaseorder queryPurchaseorderById(int id) {
		Purchaseorder purchaseorder = pd.queryPurchaseorderById(id);

		return purchaseorder;
	}

	/**
	 * 查询符合要求的记录总数count(*)
	 */
	public int rowsCount(Query query) {
		int result = pd.rowsCount(query);
		return result;
	}

	/**
	 * 根据用户输出的内容分页查询采购商信息
	 */
	@Override
	public List<Purchaseorder> queryPurchaseorderByPaging(Paging paging) {
		paging.setRowsCount(pd.rowsCount(paging.getQuery()));
		if (paging.getPage() == null || paging.getPage() == 0 || paging.getPage() < 0) {
			paging.setPage(1);
		}
		System.out.println(paging.getPage());
		// int pageInt = new Integer(pag.getPage());
		// if (pageInt < 1) {
		// pageInt = 1;
		// }
		if (paging.getPage() > paging.getPageCount() && paging.getPage() > 0 && paging.getPageCount()>0) {
			paging.setPage(paging.getPageCount());
		}

		System.out.println("===================当前页号：" + paging.getPage() + "=======");
		List<Purchaseorder> purchaseorder = pd.queryPurchaseorderByPaging(paging);
		return purchaseorder;
	}

}
