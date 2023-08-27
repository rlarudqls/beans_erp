package com.beans.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeansMainController {

	@GetMapping("/")
	public String showMainPage() {
		return "main";
	}
}
