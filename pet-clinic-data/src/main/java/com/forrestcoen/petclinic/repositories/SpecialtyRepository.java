package com.forrestcoen.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.forrestcoen.petclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {

}
