package com.cjc.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.model.Dominoz;
import com.cjc.in.repo.DominozRepository;

@Service
public class DominozServiceIMPL implements DominozService{

	@Autowired
	private DominozRepository repo;
	
	@Override
	public void insertData(Dominoz dominoz) {
		// TODO Auto-generated method stub
	
		repo.save(dominoz);
		
	}

	@Override
	public Dominoz getDominoz(int id) {
		
		return repo.findById(id).get();
	}

}
