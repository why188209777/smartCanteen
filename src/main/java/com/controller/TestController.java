package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Admin;

@Controller
public class TestController {

	@RequestMapping(value = "test")
	public Admin test() {
		return new Admin(1, "aa", "123", "123");
	}
}
