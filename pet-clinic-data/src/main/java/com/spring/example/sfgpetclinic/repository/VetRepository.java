package com.spring.example.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.example.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
