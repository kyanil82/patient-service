/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.healthcare.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author anilkumaryadav
 */
@ApplicationScoped
public class PatientRepository {
    
    private Set<Patient> patients = new HashSet<>();
 
    public PatientRepository() {
        add(new Patient(1L,"John Smith", 30));
        add(new Patient(1L,"Paul Walker", 40));
    }
 
    public Patient add(Patient patient) {
        patient.setId((long) (patients.size()+1));
        patients.add(patient);
        return patient;
    }
     
    public Patient findById(Long id) {
        Optional<Patient> patient = patients.stream().filter(a -> a.getId().equals(id)).findFirst();
        if (patient.isPresent())
            return patient.get();
        else
            return null;
    }
 
    public Set<Patient> findAll() {
        return patients;
    }
     

 
}
