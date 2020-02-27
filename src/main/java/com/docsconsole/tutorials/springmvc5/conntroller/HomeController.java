package com.docsconsole.tutorials.springmvc5.conntroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/getHelloMessage", method = RequestMethod.GET)
	public String getHelloMessage(ModelMap model) {
		
		model.addAttribute("msg", "Hello Spring5MVC World !!");
		return "home";
		
	}
}