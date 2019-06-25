/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.recetas.web.beans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import org.recetas.dominio.Receta;

/**
 *
 * @author david
 */
@Named(value = "recetaMB")
@ViewScoped
public class RecetaManagedBean implements Serializable {

    private Receta receta;
    
    @Inject
    private AppManagedBean app;
    /**
     * Creates a new instance of RecetaManagedBean
     */
    public RecetaManagedBean() {
        
    }
    
    @PostConstruct
    public void cargaReceta(){
        receta = app.getReceta();
        
    }

    public Receta getReceta() {
        return receta;
    }
    
    
}
