package com.dao;

import java.util.List;

import com.model.Merchant;
import com.model.MerchantCondition;

public interface MerchantDao {
	public int addMerchant(Merchant merchant);

	public int delMerchant(int mid);

	public int updateMerchant(Merchant merchant);

	public List<Merchant> getAllMerchant();

	public Merchant getMerchantByMid(int mid);

	public List<Merchant> getMerchantByCid(int cid);

	// 条件分页查询
	public List<Merchant> getMerchantByCondition(MerchantCondition condition);
}
