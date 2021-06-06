package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dao.Number;

public interface NumberRepo extends JpaRepository<Number, Integer>{
	
	
	public Number findById(int id);
	
	
	@Modifying
	@Query("Update Number t set t.value=:value where t.id=:id")
	public void updateValue(@Param("id") int id, @Param("value") int value);

}
