package com.emersoncristal.medications.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emersoncristal.medications.service.ActiveIngredientService;
// controller class, contains endpoints/mappings
@Controller
@RequestMapping
public class ActiveIngredientController {

	private final ActiveIngredientService activeIngredientService;
	
	@Autowired
	public ActiveIngredientController(ActiveIngredientService activeIngredientService) {
		this.activeIngredientService = activeIngredientService;		
	}
		
		
	@GetMapping("/page2.html")
    public String posts2(@RequestParam(value = "pageNumber", required = false, defaultValue = "1") int pageNumber,
            @RequestParam(value = "size", required = false, defaultValue = "5") int size, Model model) {
        model.addAttribute("posts2", activeIngredientService.getPage(pageNumber, size));
        return "page2.html";
    }
	
	@GetMapping("/page3.html")
    public String posts3(@RequestParam(value = "pageNumber", required = false, defaultValue = "1") int pageNumber,
            @RequestParam(value = "size", required = false, defaultValue = "5") int size, Model model) {
        model.addAttribute("posts3", activeIngredientService.getPage(pageNumber, size));
        return "page3.html";
    }
    
}
