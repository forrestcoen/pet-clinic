package com.forrestcoen.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.forrestcoen.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
