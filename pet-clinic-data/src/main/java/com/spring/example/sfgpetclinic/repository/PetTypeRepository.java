package com.spring.example.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.example.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
