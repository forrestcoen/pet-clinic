package com.forrestcoen.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.forrestcoen.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
	Owner findByLastName(String lastName);
}
