package com.minpro335a.fe.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/caridokter/")
public class CariDokterController {

	@GetMapping("indexapi")
	public String index() {
		return "caridokter/indexapi.html";
	}
	
	//@GetMapping(value = "hasil_cari_dokter")
	//public ModelAndView hasilCari() {
		//ModelAndView view = new ModelAndView("cari_dokter/hasil_cari_dokter.html");
		//return view;
	//}
}
