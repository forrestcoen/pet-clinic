package com.forrestcoen.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.forrestcoen.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
