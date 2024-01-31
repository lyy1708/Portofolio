package com.minpro335a.fe.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/")
public class HomeController {
	
	@GetMapping("indexapi")
	public String index() {
		return "home/indexapi.html";
	}

	@GetMapping("homepage")
	public String homepage() {
		return "home/homepage.html";
	}
}
