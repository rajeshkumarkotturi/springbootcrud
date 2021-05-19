package com.springcrud.service;

import java.util.List;

import com.springcrud.Entity.Details;

public interface Service {
	
public Details createpatientdetails(Details details);
	public List<Details> createAllpatientdetails(List<Details> details);
	public Details getpatientdetailsById(int id);
	public List<Details> getAllPatientdetails();
	public String deleteByID(int id);
	public String deleletAll();
	
	
	

}
