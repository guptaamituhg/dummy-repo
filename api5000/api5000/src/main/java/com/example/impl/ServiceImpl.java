package com.example.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.Number;
import com.example.repo.NumberRepo;
import com.example.service.NumberService;

@Service
public class ServiceImpl implements NumberService{

	@Autowired
	NumberRepo repo;
	
	
	
	@Override
	public Number insertValue(Number num) {
		return repo.save(num);
	}
	
	@Override
	public int getValue(int index) {
		return repo.findById(index).getValue();
	
	}
	
	
	@Transactional
	@Override
	public synchronized int incrementValue(int index) {
		
		if(!TableEmptyOrNot())
		{
			System.out.println("in if block");
			Number num = new Number();
			num.setId(1);
			num.setValue(0);
			insertValue(num);
			return 0;
		}
		else {
		System.out.println("in else  block");
		int value = getValue(index);
		++value;
		repo.updateValue(index, value);
		
		return value;
		}
		
		
	}
	
	
	@Override
	public boolean TableEmptyOrNot() {
		if(repo.findAll().size()>0) 
		{
			return true;
		}
		return false;
	}


}
