package com.minpro335a.fe.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/courier/")
public class CourierController {
	
	@GetMapping("read")
    public String index() {
        return "courier/indexapi.html";
    }


}
