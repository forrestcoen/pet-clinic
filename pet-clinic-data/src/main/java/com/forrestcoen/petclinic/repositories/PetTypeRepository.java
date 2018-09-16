package com.forrestcoen.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.forrestcoen.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
