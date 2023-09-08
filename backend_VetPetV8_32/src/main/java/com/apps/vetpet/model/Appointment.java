package com.apps.vetpet.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.apps.vetpet.model.Visit;
import com.apps.vetpet.model.Pet;
import com.apps.vetpet.model.PetOwner;
import com.apps.vetpet.model.VisitScheduler;
import com.apps.vetpet.model.Veterian;
import com.apps.vetpet.model.Appointment;
import com.apps.vetpet.model.VaccineScheduler;
import com.apps.vetpet.model.Image;
import com.apps.vetpet.converter.DurationConverter;
import com.apps.vetpet.converter.UUIDToByteConverter;
import com.apps.vetpet.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Appointment")
@Table(name = "\"Appointment\"", schema =  "\"vetpetv8\"")
@Data
                        
public class Appointment {
	public Appointment () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"AppointmentId\"", nullable = true )
  private Integer appointmentId;
	  
  @Column(name = "\"DateOfappointment\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date dateOfappointment;  
  
	  
  @Column(name = "\"Reasonproblem\"", nullable = true )
  private String reasonproblem;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"AppointmentPetappointment\"",
            joinColumns = @JoinColumn( name="\"AppointmentId\""),
            inverseJoinColumns = @JoinColumn( name="\"Pet_id\""), schema = "\"vetpetv8\"")
private List<Pet> petappointment = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"AppointmentAppointmentDetails\"",
            joinColumns = @JoinColumn( name="\"AppointmentId\""),
            inverseJoinColumns = @JoinColumn( name="\"Visit_id\""), schema = "\"vetpetv8\"")
private List<Visit> appointmentDetails = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"AppointmentVetPetVaccineSchedular\"",
            joinColumns = @JoinColumn( name="\"AppointmentId\""),
            inverseJoinColumns = @JoinColumn( name="\"Vet_id\""), schema = "\"vetpetv8\"")
private List<Veterian> vetPetVaccineSchedular = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"AppointmentVetpetappointment\"",
            joinColumns = @JoinColumn( name="\"AppointmentId\""),
            inverseJoinColumns = @JoinColumn( name="\"Pet_ownerId\""), schema = "\"vetpetv8\"")
private List<PetOwner> vetpetappointment = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Appointment [" 
  + "AppointmentId= " + appointmentId  + ", " 
  + "DateOfappointment= " + dateOfappointment  + ", " 
  + "Reasonproblem= " + reasonproblem 
 + "]";
	}
	
}