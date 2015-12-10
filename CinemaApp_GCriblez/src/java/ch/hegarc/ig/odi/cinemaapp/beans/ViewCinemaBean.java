/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.ig.odi.cinemaapp.beans;

import ch.hegarc.ig.odi.cinemaapp.service.Services;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author gary.criblez
 */
@Named(value = "viewCinemaBean")
@SessionScoped
public class ViewCinemaBean implements Serializable {
    
    @Inject
    Services services;

    /**
     * Creates a new instance of ViewCinemaBean
     */
    public ViewCinemaBean() {
    }
    
}
