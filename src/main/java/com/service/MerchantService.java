package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Merchant;
import com.model.MerchantCondition;
import com.model.Page;

public interface MerchantService {
	public int addMerchant(Merchant merchant);

	public int delMerchant(int mid);

	public int updateMerchant(Merchant merchant);

	public List<Merchant> getAllMerchant();

	public Merchant getMerchantByMid(int mid);

	public List<Merchant> getMerchantByCid(int cid);

	public int getMerchantCountByCondition(MerchantCondition condition);

	public List<Merchant> getMerchantByConditionAndPage(@Param("condition") MerchantCondition condition,
			@Param("page") Page page);
	
	public Merchant login(@Param("mname") String mname, @Param("password") String password);
}
