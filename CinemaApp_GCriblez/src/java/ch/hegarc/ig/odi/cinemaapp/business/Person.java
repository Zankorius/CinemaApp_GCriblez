/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.ig.odi.cinemaapp.business;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *Classe métier Person
 * @author gary.criblez
 */
public class Person implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    Map<Long,Movie> movies;
    
    /**
     * Constructeur Person sans paramètre
     */
    public Person() {
    }
    
    /**
     * Constructeur Person
     * Param id, firstName, lastName
     * Initialise la map pour les films vus
     */
    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = new LinkedHashMap();
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

    public Map<Long, Movie> getMovies() {
        return movies;
    }

    public void setMovies(Map<Long, Movie> movies) {
        this.movies = movies;
    }
    
    /**
     * Ajoute le film a la personne et la personne au film
     * @param movie 
     */
    public void addMovie(Movie movie) {
        movie.getPersons().put(id, this);
        this.movies.put(movie.getId(), movie);
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", movies=" + movies + '}';
    }
    
    
    
    
}
