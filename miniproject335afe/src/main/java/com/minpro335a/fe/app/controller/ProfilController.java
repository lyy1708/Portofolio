package com.minpro335a.fe.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profil/")
public class ProfilController {

	@GetMapping("indexapi")
	public String index() {
		return "profil/indexapi.html";
	}
}