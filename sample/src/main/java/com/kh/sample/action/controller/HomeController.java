package com.kh.sample.action.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "start.do", method = RequestMethod.GET)
	public String home(Model model) {
				
		model.addAttribute("serverTime", "homecontroller" );
		
		return "home";
	}
	
}