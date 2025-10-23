package com.nit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCController {

	@RequestMapping("/data")
	public String getData(Map<String,Object> m) {
		
		m.put("name", "Raj");
		m.put("age", 21);
		return "hello";
	}
}
