package com.spring.example.SFPetClinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.example.sfgpetclinic.model.Owner;
import com.spring.example.sfgpetclinic.model.Vet;
import com.spring.example.sfgpetclinic.services.OwnerService;
import com.spring.example.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		//owner1.setId(1L);
		owner1.setFirstName("Raghava");
		owner1.setLastName("Dudi");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		//owner2.setId(2L);
		owner2.setFirstName("Raju");
		owner2.setLastName("Prem");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		//vet1.setId(1L);
		vet1.setFirstName("Arjun");
		vet1.setLastName("Reddy");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		//vet2.setId(2L);
		vet2.setFirstName("Vinay");
		vet2.setLastName("Kumar");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
		
	}

}
