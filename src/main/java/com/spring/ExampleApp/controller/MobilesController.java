package com.spring.ExampleApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ExampleApp.model.Mobiles;
//import com.spring.ExampleApp.repository.MobilesRepository;
import com.spring.ExampleApp.service.MobilesService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MobilesController {
	
	@Autowired
	private MobilesService service;
	
	@GetMapping("getMobiles")
	public List<Mobiles> getMobiles() {
		return service.getMobiles();
	}
	
	@GetMapping("getMobile/{id}")
	public Mobiles getMobile(@PathVariable int id) {
		return service.getMobile(id);
	}
	
	@PostMapping("getMobile")
	public Mobiles addMobile(@RequestBody Mobiles mobile) {
		service.addMobile(mobile);
		return service.getMobile(mobile.getId());
	}
	
	@PutMapping("getMobile")
	public Mobiles updateMobile(@RequestBody Mobiles mobile) {
		service.updateMobile(mobile);
		return service.getMobile(mobile.getId());
	}
	
	@DeleteMapping("getMobile/{id}")
	public String deleteMobileById(@PathVariable int id) {
		service.deleteMobileById(id);
		return "Deleted";
	}
	
	
}
