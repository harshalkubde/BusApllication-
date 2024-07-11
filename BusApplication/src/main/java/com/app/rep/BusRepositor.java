package com.app.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entity.Bname;
import com.app.entity.Bus1;

public interface BusRepositor extends JpaRepository<Bus1, Long> {
	@Query("SELECT r From Bus1 r Where r.bname=:src")
	List<Bus1> searchbybname(Bname src);
	
	@Query("SELECT r From Bus1 r ORDER BY r.distance")
	List<Bus1> sortBydistance();
	
	
}
