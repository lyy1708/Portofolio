package com.minpro335a.fe.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bloodgroup/")
public class BloodGroupController {
	
	@GetMapping("indexapi")
	public String index() {
		return "bloodGroup/indexapi.html";
	}
}
