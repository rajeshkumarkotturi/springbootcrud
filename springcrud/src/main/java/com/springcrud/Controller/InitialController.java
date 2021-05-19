package com.springcrud.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcrud.Entity.Details;
import com.springcrud.service.Service;

@RestController
public class InitialController {
	
	@Autowired
	private Service service;
	
	@PostMapping("/create")
	public Details saveDetails(@PathVariable @Valid Details details) {
		return service.createpatientdetails(details);
	}
		
		@PostMapping("/saveAll")
		public List<Details> saveAllDetails(@RequestBody List<Details> details) {
			return service.createAllpatientdetails(details);}
		
		@GetMapping("/get/{id}")
		public Details findDetails(int id) {
			return service.getpatientdetailsById(id);}
			
		@GetMapping("/getAll")	
		public List<Details> findAllDetails() {
				return service.getAllPatientdetails();}
		
		@DeleteMapping("/deleteAll")
		public String deleteAll() {
			return service.deleletAll();
		}
		
		@DeleteMapping("/delete/{id}")
		public String delete(int id) {
			return service.deleteByID(id);
			
			
		
				
				
			
			
		}
		
		
			
		
		
		
	}
	
	
	
	


