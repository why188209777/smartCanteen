package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Merchant;
import com.model.MerchantCondition;
import com.service.MerchantService;

@Controller
@RequestMapping(value = "merchant")
public class MerchantController {
	@Autowired
	private MerchantService merchantService;

	@RequestMapping(value = "addMerchant")
	@ResponseBody
	public boolean addMerchant(String mname, String description, int cid) {
		Merchant merchant = new Merchant(mname, description, cid);
		int addmerchant = merchantService.addMerchant(merchant);
		return addmerchant == 0 ? false : true;
	}

	@RequestMapping(value = "delMerchant")
	@ResponseBody
	public boolean delMerchant(int mid) {
		int delMerchant = merchantService.delMerchant(mid);
		return delMerchant == 0 ? false : true;
	}

	@RequestMapping(value = "updateMerchant")
	@ResponseBody
	public boolean updateMerchant(int mid) {
		Merchant merchant = new Merchant(mid);
		int updateMerchant = merchantService.updateMerchant(merchant);
		return updateMerchant == 0 ? false : true;
	}

	@RequestMapping(value = "getAllMerchant")
	@ResponseBody
	public List<Merchant> getAllMerchant() {
		List<Merchant> list = merchantService.getAllMerchant();
		return list;
	}
	
	@RequestMapping(value = "getMerchantByMid")
	@ResponseBody
	public Merchant getMerchantByMid(int mid) {
		Merchant merchant = merchantService.getMerchantByMid(mid);
		return merchant;
	}

	@RequestMapping(value = "getMerchantByCid")
	@ResponseBody
	public List<Merchant> getMerchantByCid(int cid) {
		List<Merchant> list = merchantService.getMerchantByCid(cid);
		return list;
	}
	
	@RequestMapping(value = "getMerchantByCondition")
	@ResponseBody
	public List<Merchant> getMerchantByCondition(String mname, int cid, int pageIndex, int pageSize) {
		MerchantCondition condition = new MerchantCondition(mname, cid, pageIndex, pageSize);
		List<Merchant> list = merchantService.getMerchantByCondition(condition);
		return list;
	}
}
