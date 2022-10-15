package com.emersoncristal.medications.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emersoncristal.medications.service.GenericService;
// controller class, contains endpoints/mappings
@Controller
@RequestMapping("/page1.html")
public class GenericController {
	
		
	private final GenericService genericService;
	
	@Autowired
	public GenericController(GenericService genericService) {
		this.genericService = genericService;
	}
	
	
	@GetMapping
    public String posts(@RequestParam(value = "pageNumber", required = false, defaultValue = "1") int pageNumber,
            @RequestParam(value = "size", required = false, defaultValue = "5") int size, Model model) {
        model.addAttribute("posts1", genericService.getPage(pageNumber, size));
        return "page1";
    }
}
