package com.apps.vetpet.function;

import com.apps.vetpet.model.Visit;
import com.apps.vetpet.model.Pet;
import com.apps.vetpet.model.PetOwner;
import com.apps.vetpet.model.VisitScheduler;
import com.apps.vetpet.model.Veterian;
import com.apps.vetpet.model.Appointment;
import com.apps.vetpet.model.VaccineScheduler;
import com.apps.vetpet.model.Image;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.vetpet.repository.AppointmentRepository;
import com.apps.vetpet.repository.PetOwnerRepository;
import com.apps.vetpet.repository.VeterianRepository;
import com.apps.vetpet.repository.VisitRepository;
import com.apps.vetpet.repository.VaccineSchedulerRepository;
import com.apps.vetpet.repository.ImageRepository;
import com.apps.vetpet.repository.PetRepository;
import com.apps.vetpet.repository.VisitSchedulerRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
