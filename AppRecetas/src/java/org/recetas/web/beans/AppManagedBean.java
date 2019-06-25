/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.recetas.web.beans;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import org.recetas.dominio.Dificultad;
import org.recetas.dominio.Receta;

/**
 *
 * @author SISTEMAS
 */
@Named(value = "appMB")
@ApplicationScoped
public class AppManagedBean {

    
    private List<Receta> listaRecetas;
    
    
    public AppManagedBean() {
        
        this.listaRecetas = new ArrayList();
        
        this.listaRecetas.add(new Receta(1, "Hamburguesa", 
                "Unas burguers que harán que volvamos a disfrutar de este tipo de comida,"
                        + " por eso y como muestra, esta hamburguesa de ternera con cebolla confitada.", 
                10, Dificultad.MEDIA));
        this.listaRecetas.get(0).setImagenNombre("hamburgher.jpg");
        
        this.listaRecetas.add(new Receta(2, "Espagueti Carbonara", 
                "Una deliciosa pasta italiana", 
                15, Dificultad.BAJA));
        
        this.listaRecetas.get(1).setImagenNombre("bacon_chips_and_fries.jpg");
    }

    public List<Receta> getListaRecetas() {
        return listaRecetas;
    }

    public Receta getReceta(){
        return listaRecetas.get(0);
    }
 
    
}
