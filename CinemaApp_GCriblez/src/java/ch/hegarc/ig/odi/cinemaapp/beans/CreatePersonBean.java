/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.ig.odi.cinemaapp.beans;

import ch.hegarc.ig.odi.cinemaapp.exceptions.UniqueException;
import ch.hegarc.ig.odi.cinemaapp.service.Services;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * Bean pour la création d'une personne
 * @author gary.criblez
 */
@Named(value = "createPersonBean")
@RequestScoped
public class CreatePersonBean implements Serializable {
    
    private Long id;
    private String firstName;
    private String lastName;
    
    
    @Inject
    Services services;

    
    
    
    /**
     * Mémorise la nouvelle personne.
     * 
     * @return "success" si la personne a pu être mémorisée, sinon "failure".
     */
    public String submit() {
        try {
            services.savePerson(id, firstName, lastName);
            return "success";
        } catch(UniqueException ex) {
            return "failure";
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
