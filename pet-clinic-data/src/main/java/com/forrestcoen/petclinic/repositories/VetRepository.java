package com.forrestcoen.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.forrestcoen.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
