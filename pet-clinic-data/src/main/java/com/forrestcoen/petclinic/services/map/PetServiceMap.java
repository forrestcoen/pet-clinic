package com.forrestcoen.petclinic.services.map;

import java.util.Set;

import com.forrestcoen.petclinic.model.Pet;
import com.forrestcoen.petclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet pet) {
		super.delete(pet);
	}

	@Override
	public Pet save(Pet pet) {
		return super.save(pet.getId(), pet);
	}

}
