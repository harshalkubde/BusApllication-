package com.app.services;


import java.util.List;

import com.app.entity.Bname;
import com.app.entity.Bus1;



public interface Busservices {

	
	
	 String insert(Bus1 b1);

	 String delete(Long id);
	 
	 List<Bus1> getdeatil();
	 List<Bus1> serarchbyName(Bname bname);
	 List<Bus1> sortBYDistance();
	 
	 String update(Bus1 b);
		 
	 
}
