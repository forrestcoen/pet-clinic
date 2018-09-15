package com.forrestcoen.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.forrestcoen.petclinic.model.Owner;
import com.forrestcoen.petclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}

	@Override
	public Owner save(Owner owner) {
		return super.save(owner.getId(), owner);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
