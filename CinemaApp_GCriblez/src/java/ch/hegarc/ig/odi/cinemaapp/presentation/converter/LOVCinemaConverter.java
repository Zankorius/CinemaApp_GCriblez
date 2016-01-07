/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.ig.odi.cinemaapp.presentation.converter;

import ch.hegarc.ig.odi.cinemaapp.business.Movie;
import ch.hegarc.ig.odi.cinemaapp.service.Services;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

/**
 *
 * @author gary.criblez
 */
@Named(value = "lovCinemaConverter")
@RequestScoped
public class LOVCinemaConverter implements Converter {
    
    @Inject
    Services services;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null)
            return null;
        else {
            int numero = Integer.parseInt(value);
            
            for (Movie m : services.getMoviesList()){
                if (m.getId()== numero)
                    return m;
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null)
            return null;
        else if (value instanceof Movie) {
            return String.valueOf(((Movie)value).getId());
        }
        else {
            return null;
        }
    }
    
}
