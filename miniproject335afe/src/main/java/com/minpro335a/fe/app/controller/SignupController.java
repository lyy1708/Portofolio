package com.minpro335a.fe.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup/")
public class SignupController {
	
	@GetMapping("indexapi")
	public String index() {
		return "signup/indexapi.html";
	}

}
