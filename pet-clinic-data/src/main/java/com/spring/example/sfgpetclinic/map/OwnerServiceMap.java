package com.spring.example.sfgpetclinic.map;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring.example.sfgpetclinic.model.Owner;
import com.spring.example.sfgpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap 
				extends AbstractMapService<Owner, Long> 
					implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		return super.save(object);
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

	@Override
	public List<Owner> findAllByLastNameLike(String lastName) {
		return null;
	}

}
