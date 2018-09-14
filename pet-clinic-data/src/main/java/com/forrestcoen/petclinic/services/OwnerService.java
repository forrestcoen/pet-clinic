package com.forrestcoen.petclinic.services;

import com.forrestcoen.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	Owner findByLastName(String lastName);
}
