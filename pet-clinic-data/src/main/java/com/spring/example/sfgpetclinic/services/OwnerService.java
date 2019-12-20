package com.spring.example.sfgpetclinic.services;

import java.util.List;

import com.spring.example.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
	
	List<Owner> findAllByLastNameLike(String lastName);
	
}
