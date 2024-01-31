package com.minpro335a.fe.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aksesmenu/")
public class MenuAksesController {
	
	@GetMapping("indexapi")
	public String index() {
		return "aksesMenu/indexapi.html";
	}
}
