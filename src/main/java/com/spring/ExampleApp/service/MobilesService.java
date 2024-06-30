package com.spring.ExampleApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ExampleApp.model.Mobiles;
import com.spring.ExampleApp.repository.MobilesRepository;

@Service
public class MobilesService {
	@Autowired
	private MobilesRepository repo;
	public void addMobile(Mobiles mobile) {
		repo.save(mobile);
//		return mobile;
		
	}
	public Mobiles getMobile(int id) {
		return repo.findById(id).orElse(new Mobiles());
	}
	
	public List<Mobiles> getMobiles() {
		return repo.findAll();
		
	}

	public void updateMobile(Mobiles mobile) {
		repo.save(mobile);
	}

	public void deleteMobileById(int id) {
		repo.deleteById(id);
	}



}
