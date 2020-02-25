package com.spring.example.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.example.sfgpetclinic.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
