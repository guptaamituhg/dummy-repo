package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.NumberService;


@RestController
public class controller {
	
    @Autowired
	NumberService obj;

	@RequestMapping("/api")
	public String incrementService()
	{
		
		return ""+obj.incrementValue(1);
	}

}