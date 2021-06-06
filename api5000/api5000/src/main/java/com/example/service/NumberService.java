package com.example.service;
import com.example.dao.Number;

public interface NumberService {
	
	public int incrementValue(int index);
	
	public int getValue(int index);
	
	public boolean TableEmptyOrNot();
	
	public Number insertValue(Number num);

}
