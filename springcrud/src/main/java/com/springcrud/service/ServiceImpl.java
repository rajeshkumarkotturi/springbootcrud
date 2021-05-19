package com.springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springcrud.Entity.Details;
import com.springcrud.Repository.Repository;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	
	@Autowired
	private Repository repository;

	@Override
	public Details createpatientdetails(Details details) {
		return repository.save(details);
	}

	@Override
	public List<Details> createAllpatientdetails(List<Details> details) {
		return repository.saveAll(details);
		
	}

	@Override
	public Details getpatientdetailsById(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Details> getAllPatientdetails() {
		return repository.findAll();
		
	}

	@Override
	public String deleteByID(int id) {
		return "Succesfully Deleted"+ id;
		
		
		
	}

	@Override
	public String deleletAll() {
		return null;
	}
	
	


}
