package com.springcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.Entity.Details;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Details,Integer> {

	public Details findById(Details details);

	
}
