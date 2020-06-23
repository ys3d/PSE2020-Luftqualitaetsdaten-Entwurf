package de.visaq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AjaxController {
	
	private String FILE_PATH;

	@RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String crunchifyDisplayForm() {
		return null;
	}
}
