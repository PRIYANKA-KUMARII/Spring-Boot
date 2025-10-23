package com.nit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHome {
	@RequestMapping("/data")
	public String  showMessage() {
		return "messgae";
		
	}

}
