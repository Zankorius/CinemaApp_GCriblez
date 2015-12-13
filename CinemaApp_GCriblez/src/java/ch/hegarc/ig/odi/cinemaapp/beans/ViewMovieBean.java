/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.ig.odi.cinemaapp.beans;

import ch.hegarc.ig.odi.cinemaapp.business.Movie;
import ch.hegarc.ig.odi.cinemaapp.service.Services;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 * Bean pour gérer la vue d'un film et la liste des personnes qui l'ont vue
 * @author gary.criblez
 */
@Named(value = "viewMovieBean")
@SessionScoped
public class ViewMovieBean implements Serializable {
    
    @Inject
    Services services;
    
    private Movie movie;

    /**
     * Creates a new instance of ViewCinemaBean
     */
    public ViewMovieBean() {
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
    /**
     * Méthode permettant d'afficher un film et ses détails.
     * @param mov Le film a afficher
     * @return "show" si le client est valide, "error" si le paramètre est null
     */
    public String showMovie(Movie mov){
        if(mov != null){
            movie = mov;
            return "show";
        }else{
            movie = null;
            return "error";
        }
    }
    
}
