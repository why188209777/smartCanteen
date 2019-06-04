package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Merchant;
import com.service.MerchantService;

@Controller
@RequestMapping(value = "merchant")
public class MerchantController {
	@Autowired
	private MerchantService merchantService;

	@RequestMapping(value = "addMerchant")
	public String addMerchant(String mname, String description, int cid) {
		Merchant merchant = new Merchant(mname, description, cid);
		int addmerchant = merchantService.addMerchant(merchant);
		return addmerchant == 0 ? "error" : "success";
	}

	@RequestMapping(value = "delMerchant")
	public String delMerchant(int mid) {
		int delMerchant = merchantService.delMerchant(mid);
		return delMerchant == 0 ? "error" : "success";
	}

	@RequestMapping(value = "updateMerchant")
	public String updateMerchant(int mid) {
		Merchant merchant = new Merchant(mid);
		int updateMerchant = merchantService.updateMerchant(merchant);
		return updateMerchant == 0 ? "error" : "success";
	}

	@RequestMapping(value = "getMerchantsByCid")
	public String getMerchantsByCid(int cid) {

		List<Merchant> merchant = merchantService.getMerchantsByCid(cid);
		return merchant == null ? "error" : "success";
	}
}
