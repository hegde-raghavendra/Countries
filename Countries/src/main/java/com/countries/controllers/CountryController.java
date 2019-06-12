package com.countries.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.countries.entities.Country;
import com.countries.repositories.CountryRepository;

@Controller
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepo;
	
	@SuppressWarnings("deprecation")
	@GetMapping("/")
	public String showPage(Model model, @RequestParam(defaultValue="0") int page) {
		
		model.addAttribute("data", countryRepo.findAll(new PageRequest(page, 6)));  
		model.addAttribute("currentPage", page);
		return "index";
		
	}
	
	@PostMapping("/save")
	public String save(Country c) throws Exception {
		
		System.out.println("Inside post controller");
		
		if (c.getId()!= null && countryRepo.existsById(c.getId())) {
			
			 
			throw new RuntimeException("ID already exists");

		}
		
		countryRepo.save(c);
		
		return "redirect:/";
		
	}
	
	@PostMapping("/update")
	public String update(Country c) {
		
		System.out.println("Inside update controller");
		

		countryRepo.save(c);
		
		return "redirect:/";
		
	}
	
	@GetMapping("/delete")
	public String delete(Integer id) {
		
		countryRepo.deleteById(id);
		
		return "redirect:/";
		
	}
	
	@GetMapping("/findOne")
	@ResponseBody
	public Optional<Country> findOne(Integer id) {
		
		return countryRepo.findById(id);
		
	}
	
	

}
