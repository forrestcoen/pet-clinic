package com.forrestcoen.petclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.forrestcoen.petclinic.model.Specialty;
import com.forrestcoen.petclinic.services.SpecialtyService;

@Service
@Profile({ "default", "map" })
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {

	@Override
	public Set<Specialty> findAll() {
		return super.findAll();
	}

	@Override
	public Specialty findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Specialty save(Specialty specialty) {
		return super.save(specialty);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Specialty specialty) {
		super.delete(specialty);
	}

}
