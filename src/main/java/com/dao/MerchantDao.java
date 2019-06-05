package com.dao;

import java.util.List;

import com.model.Merchant;

public interface MerchantDao {
	public int addMerchant(Merchant merchant);

	public int delMerchant(int mid);

	public int updateMerchant(Merchant merchant);

	public Merchant getMerchantByMid(int mid);
	
	public List<Merchant> getMerchantsByCid(int cid);
}
