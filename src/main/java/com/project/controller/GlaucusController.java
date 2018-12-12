package com.project.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.service.GlaucusService;
/**
 * GlaucusController.class is the Controller class to handle the rest call to increment the value in database by one.
 * @author Himanshu Sahu
 * @version 1.0 Build 01 Dec 12, 2018
 */
@Controller
public class GlaucusController {
    @Autowired
	GlaucusService glaucusService;
	/**
	 * The increment method is responsible to handle value increment request.
	 * @return It returns a String value if the data is updated or some error occurred.
	 */
	@RequestMapping(value="/",method = RequestMethod.GET)
	@ResponseBody public String increment() {
		
		return glaucusService.increase();
	}
	
	
}
