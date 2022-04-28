package org.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("main");// logical view name
		mav.addObject("myname","Rajesh Nallusamy");
		return mav;
	}

}
