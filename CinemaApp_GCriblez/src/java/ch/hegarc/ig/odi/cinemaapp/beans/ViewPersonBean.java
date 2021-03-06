/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.ig.odi.cinemaapp.beans;

import ch.hegarc.ig.odi.cinemaapp.business.Person;
import ch.hegarc.ig.odi.cinemaapp.service.Services;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 * Bean pour gérer la vue d'une personne et des films qu'il a visionné
 * @author gary.criblez
 */
@Named(value = "viewPersonBean")
@SessionScoped
public class ViewPersonBean implements Serializable {
    
    @Inject
    Services services;
    
    private Person person;

    /**
     * Creates a new instance of ViewPersonBean
     */
    public ViewPersonBean() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    /**
     * Méthode permettant d'afficher une personne et ses détails.
     * @param pers La personne a afficher
     * @return "show" si le client est valide, "error" si le paramètre est null
     */
    public String showPerson(Person pers){
        if(pers != null){
            person = pers;
            return "show";
        }else{
            person = null;
            return "error";
        }
    }
    
}
