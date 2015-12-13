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
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

/**
 * Bean pour gérer les listes de personnes et de films
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
     * récupération de la liste de film et la liste de personne de la classe service
     */
    @PostConstruct
    public void init(){
        movies = new ListDataModel<>();
        movies.setWrappedData(services.getMoviesList());
        
        persons = new ListDataModel<>();
        persons.setWrappedData(services.getPeopleList());
    }

    public DataModel<Movie> getMovies() {
        return movies;
    }

    public void setMovies(DataModel<Movie> movies) {
        this.movies = movies;
    }

    public DataModel<Person> getPersons() {
        return persons;
    }

    public void setPersons(DataModel<Person> persons) {
        this.persons = persons;
    }
    
    /**
     * Compte le nombre de personne ayant vue le film
     * @return int
     */
    public int countPersonWhoSeeMovie(Movie mov){
        return mov.getPersons().size();
    }
    
    /**
     * Compte le nombre de film vue par la personne
     * @return int
     */
    public int countWatchingMovie(Person pers){
        return pers.getMovies().size();
    }
    
    
    
}
