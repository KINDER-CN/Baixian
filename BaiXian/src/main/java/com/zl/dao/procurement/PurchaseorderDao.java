package com.zl.dao.procurement;

import java.util.List;

import com.zl.pojo.Paging;
import com.zl.pojo.Query;
import com.zl.pojo.procurement.Purchaseorder;

public interface PurchaseorderDao {
	/**
	 * 采购单添加方法
	 */
  public int addPurchaseorder(Purchaseorder purchaseorder);
  /**
	 * 根据id查看采购商信息
	 */
	public Purchaseorder queryPurchaseorderById(int id);

	/**
	 * 查询符合要求的记录总数count(*)
	 */
	public int rowsCount(Query query);

	/**
	 * 根据用户输出的内容分页查询采购商信息
	 */
	public List<Purchaseorder> queryPurchaseorderByPaging(Paging pag);

}
