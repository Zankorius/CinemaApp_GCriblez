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
 * Bean pour la création d'un film
 * @author gary.criblez
 */
@Named(value = "createMovieBean")
@RequestScoped
public class CreateMovieBean implements Serializable {
    
    
    private Long id;
    private String name;
    private String producer;

    
    @Inject
    Services services;
    
     /**
     * Mémorise le nouveau film.
     * 
     * @return "success" si le film a pu être mémorisé, sinon "failure".
     */
    public String submit() {
        try {
            services.saveMovie(id, name, producer);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    
    
    
}
