/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.ig.odi.cinemaapp.beans;

import ch.hegarc.ig.odi.cinemaapp.business.Movie;
import ch.hegarc.ig.odi.cinemaapp.business.Person;
import ch.hegarc.ig.odi.cinemaapp.service.Services;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.inject.Inject;

/**
 *
 * @author gary.criblez
 */
@Named(value = "cinemaBean")
@SessionScoped
public class CinemaBean implements Serializable {
    
    @Inject
    Services services;
    
    private DataModel<Movie> movies;
    private DataModel<Person> persons;

    /**
     * Creates a new instance of CinemaBean
     */
    public CinemaBean() {
    }
    
    
    
}
