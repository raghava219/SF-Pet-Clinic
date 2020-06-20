package com.spring.example.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.example.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
