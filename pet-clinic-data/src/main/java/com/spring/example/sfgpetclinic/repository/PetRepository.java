package com.spring.example.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.example.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
