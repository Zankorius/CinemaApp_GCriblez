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
 * Classe métier Movie
 * @author gary.criblez
 */
public class Movie implements Serializable {
    private Long id;
    private String name;
    private String producer;
    Map<Long,Person> persons;
    
    /**
     * Constructeur Movie sans paramètre
     */
    public Movie() {
    }
    
    /**
     * Constructeur Movie
     * Param id, name, producer
     * Initialise la map pour les personnes ayant vue le film
     */
    public Movie(Long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.persons = new LinkedHashMap();
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

    public Map<Long, Person> getPersons() {
        return persons;
    }

    public void setPersons(Map<Long, Person> persons) {
        this.persons = persons;
    }
    
    /**
     * Ajoute la personne au film et le film à la personne
     * @param movie 
     */
    public void addPerson(Person person) {
        person.getMovies().put(id, this);
        this.persons.put(person.getId(), person);
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", name=" + name + ", producer=" + producer + ", persons=" + persons + '}';
    }
    
    
}
