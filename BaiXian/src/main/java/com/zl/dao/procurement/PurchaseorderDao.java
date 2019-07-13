package com.zl.dao.procurement;

import com.zl.pojo.procurement.Purchaseorder;

public interface PurchaseorderDao {
	/**
	 * 采购单添加方法
	 */
  public int addPurchaseorder(Purchaseorder purchaseorder);
}
