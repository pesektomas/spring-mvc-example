package org.tom.socialConnector.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
public class IndexController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView model = new ModelAndView("hello");
		model.addObject("msg", "hello world");
 
		return model;
	}
}
