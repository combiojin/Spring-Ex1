package com.kb.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = "/main.do")
	public String main() {
		
		return "main";
	}
	
//	@RequestMapping(value = "/main.do", method = RequestMethod.POST)
//	public String mainPost() {
//		
//		return "main";
//	}
}

