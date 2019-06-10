package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.internal.util.StringUtils;
import com.model.Merchant;
import com.model.MerchantCondition;
import com.model.Page;
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
	
	@RequestMapping(value = "getMerchantByConditionAndPage")
	@ResponseBody
	public Object getMerchantByConditionAndPage(String mname, @RequestParam(required = false, defaultValue = "0") Integer cid, int pageIndex, int pageSize) {
		/*当输入框没有输入值时*/
		if (StringUtils.isEmpty(mname)) {
			mname = null;
		}
		System.out.println(pageIndex + " " + pageSize);
		MerchantCondition condition = new MerchantCondition(mname, cid);
		System.out.println(condition);
		int count = merchantService.getMerchantCountByCondition(condition);
		int totalSize = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
		Page page = new Page(pageIndex, pageSize, totalSize);
		List<Merchant> list = merchantService.getMerchantByConditionAndPage(condition, page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", page);
		map.put("list", list);
		return map;
	}
}
