package com.apps.vetpet.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.vetpet.model.Visit;
import com.apps.vetpet.model.Pet;
import com.apps.vetpet.model.PetOwner;
import com.apps.vetpet.model.VisitScheduler;
import com.apps.vetpet.model.Veterian;
import com.apps.vetpet.model.Appointment;
import com.apps.vetpet.model.VaccineScheduler;
import com.apps.vetpet.model.Image;

@Entity(name = "VeterianExaminehealth")
@Table(schema = "\"vetpetv8\"", name = "\"VeterianExaminehealth\"")
@Data
public class VeterianExaminehealth{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Vet_id\"")
	private Integer vet_id;

    
    @Column(name = "\"Pet_id\"")
    private Integer pet_id;
 
}