package com.emersoncristal.medications.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
// sample logger class, for Slf4j logging
@Slf4j
@RestController
public class DemoController {
	@GetMapping("/hello")
	public String hello() {
		
		 log.warn("enter hello...");
		 log.info("Simple log statement with inputs {}, {} and {}", 1, 2, 3);
		 log.trace("This is a trace log example");
		 log.debug("This is a debug log example");
		 log.error("This is an error log example");
		 log.warn("This is a warn log example");
		 
		return "hello rest";
	}
}
