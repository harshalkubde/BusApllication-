package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Bname;
import com.app.entity.Bus1;
import com.app.services.Busservices;






@RestController
@RequestMapping("/bus")
public class BusController {

//	public BusController() {
//		super();
//		System.out.println("suucessfuly");
//	}

	@Autowired
	private Busservices bservices;

	@PostMapping
	public ResponseEntity<?> addbus(@RequestBody Bus1 b1) {
		if(b1!=null) {
				bservices.insert(b1);
		return ResponseEntity.status(200).body("suucessfully added");
	} return ResponseEntity.status(402).body("bus cant add");}

	@DeleteMapping("{Id}")
	public String DeleletById(@PathVariable Long Id) {
		return bservices.delete(Id);
	}
	@GetMapping
	public List<Bus1> Display(){
		return bservices.getdeatil();
	}
	@GetMapping("/{name}")
	public  List<Bus1> searchbynameid(Bname bname){
		return bservices.serarchbyName(bname);	}
	
	@GetMapping("/sortbydistance")
	public List<Bus1> sortBydistance(){
		return bservices.sortBYDistance();
	}
	
	@PutMapping
	public ResponseEntity<?> updateBus(@RequestBody Bus1 b)
	{
		if(b!=null) {
		
			return ResponseEntity.status(200).body(bservices.update(b));
		}
		return ResponseEntity.status(402).body(bservices.update(b));
	}
	
	


}
