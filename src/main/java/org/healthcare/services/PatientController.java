/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.healthcare.services;

import io.vertx.core.logging.LoggerFactory;
import java.util.Set;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author anilkumaryadav
 */


@Path("/patients")
@Produces(MediaType.APPLICATION_JSON)
public class PatientController {
    
     private static final io.vertx.core.logging.Logger LOGGER = LoggerFactory.getLogger(PatientController.class);
     
    @Inject
    PatientRepository repository;
     
    @POST
    public Patient add(@Valid Patient patient) {
        LOGGER.info("Patient add: {}", patient);
        return repository.add(patient);
    }
     
    @Path("/{id}")
    @GET
    public Patient findById(@PathParam("id") Long id) {
        LOGGER.info("Patient find: id={}", id);
        return repository.findById(id);
    }
 
    @GET
    public Set<Patient> findAll() {
        LOGGER.info("Employee find");
        return repository.findAll();
    }
     
    
}
