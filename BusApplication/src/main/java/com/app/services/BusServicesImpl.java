package com.app.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Bname;
import com.app.entity.Bus1;
import com.app.rep.BusRepositor;

@Service
@Transactional
public class BusServicesImpl implements Busservices {
	@Autowired
	BusRepositor busresp;


	@Override
	public String insert(Bus1 b1) {
		busresp.save(b1);

		return " bus add suucessfuly";
	}

	@Override
	public String delete(Long id) {
		busresp.deleteById(id);

		return "data deleted suucessfully";
	}

	@Override
	public List<Bus1> getdeatil() {
	
		return busresp.findAll().stream().collect(Collectors.toList());
	}

	@Override

	public List<Bus1> serarchbyName(Bname bname){
		return busresp.searchbybname(bname);
	}
	
	@Override
	public List<Bus1> sortBYDistance(){
		return busresp.sortBydistance();
		
				
	}

	@Override
	public String update(Bus1 b) {
		if(busresp.existsById(b.getId()))
		{
			busresp.save(b);
			return "Successfully updated!";
		}
		return "Update Failed...Invalid ID";
	}



	

	}
	

	

