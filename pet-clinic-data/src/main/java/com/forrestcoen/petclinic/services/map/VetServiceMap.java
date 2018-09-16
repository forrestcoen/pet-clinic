package com.forrestcoen.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.forrestcoen.petclinic.model.Specialty;
import com.forrestcoen.petclinic.model.Vet;
import com.forrestcoen.petclinic.services.SpecialtyService;
import com.forrestcoen.petclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	private final SpecialtyService specialtyService;

	public VetServiceMap(SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet vet) {
		super.delete(vet);
	}

	@Override
	public Vet save(Vet vet) {
		if (vet.getSpecialties().size() > 0) {
			vet.getSpecialties().forEach(specialty -> {
				if (specialty.getId() == null) {
					Specialty savedSpecialty = specialtyService.save(specialty); 
					specialty.setId(savedSpecialty.getId());
				}
			});
		}
		
		return super.save(vet);
	}
}
