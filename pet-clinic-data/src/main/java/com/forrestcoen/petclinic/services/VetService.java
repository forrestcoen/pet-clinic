package com.forrestcoen.petclinic.services;

import java.util.Set;

import com.forrestcoen.petclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
