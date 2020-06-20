package com.spring.example.sfgpetclinic.repository;


import org.springframework.data.repository.CrudRepository;

import com.spring.example.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
