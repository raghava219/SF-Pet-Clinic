package com.spring.example.sfgpetclinic.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring.example.sfgpetclinic.model.Pet;
import com.spring.example.sfgpetclinic.services.PetService;

@Service
public class PetServiceMap 
				extends AbstractMapService<Pet, Long> 
					implements PetService {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}
	
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
