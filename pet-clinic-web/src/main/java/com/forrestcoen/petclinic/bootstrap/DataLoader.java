package com.forrestcoen.petclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.forrestcoen.petclinic.model.Owner;
import com.forrestcoen.petclinic.model.Pet;
import com.forrestcoen.petclinic.model.PetType;
import com.forrestcoen.petclinic.model.Vet;
import com.forrestcoen.petclinic.services.OwnerService;
import com.forrestcoen.petclinic.services.PetTypeService;
import com.forrestcoen.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		Owner owner1 = new Owner();
		
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brockerel");
		owner1.setCity("Miami");
		owner1.setTelephone("1231231234");
		ownerService.save(owner1);
		
		Pet mikesPet = new Pet();
		mikesPet.setName("Rosco");
		mikesPet.setPetType(savedDogPetType);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		owner1.getPets().add(mikesPet);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brockerel");
		owner2.setCity("Miami");
		owner2.setTelephone("1231231234");
		ownerService.save(owner2);
		
		Pet fionasPet = new Pet();
		fionasPet.setName("Just Cat");
		fionasPet.setPetType(savedCatPetType);
		fionasPet.setOwner(owner2);
		fionasPet.setBirthDate(LocalDate.now());
		owner2.getPets().add(fionasPet);
		
		System.out.println("Loaded Owners....");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vetService.save(vet2);
		
		System.out.println("Loaded Vets....");
	}

}
