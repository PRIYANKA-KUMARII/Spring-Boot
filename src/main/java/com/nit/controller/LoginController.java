package com.nit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	@RequestMapping("/")
	public String showLoginPage() {
		 return "Login";
	}
	@GetMapping("/login")
	public String handleLogin(Map<String,Object> map) {
		
		map.put("name","Priyanka");
	
		
			 return "success";
			 
		}
			}

