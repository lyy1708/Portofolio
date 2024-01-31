package com.minpro335a.fe.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spesialisasidokter/")
public class SpesialisasiDokterController {
	
	@GetMapping("indexapi")
	public String index() {
		return "spesialisasidokter/indexapi.html";
	}

}
