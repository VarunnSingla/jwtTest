package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.DAOUser;
import com.javainuse.service.JwtUserDetailsService;

@RestController
public class Controller {
	
//	@Autowired
//	JwtUserDetailsService jwtDet;

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}
	
//	@RequestMapping(value="/hello", method=RequestMethod.POST)
//	public DAOUser createDAOUser(@RequestBody DAOUser DAO) {
//	    return jwtDet.createDAOUser(DAO);
//	}
	
	
	
	

}