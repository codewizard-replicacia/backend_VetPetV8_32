package com.apps.vetpet.repository;


import com.apps.vetpet.model.Veterian;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class VeterianRepository extends SimpleJpaRepository<Veterian, String> {
    private final EntityManager em;
    public VeterianRepository(EntityManager em) {
        super(Veterian.class, em);
        this.em = em;
    }
    @Override
    public List<Veterian> findAll() {
        return em.createNativeQuery("Select * from \"vetpetv8\".\"Veterian\"", Veterian.class).getResultList();
    }
}