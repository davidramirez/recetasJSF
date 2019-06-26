/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.recetas.web.beans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import org.recetas.dominio.Ingrediente;
import org.recetas.dominio.Receta;
import org.recetas.service.RecetasServiceLocal;

/**
 *
 * @author david
 */
@Named(value = "recetaMB")
@ViewScoped
public class RecetaManagedBean implements Serializable {

    private Receta receta;
    
    //Control de pantallas
    private int pantallaActual = 0;
    
    public static final int PRINCIPAL_RECETA = 0;
    public static final int LISTA_UTENSILIOS = 1;
    public static final int LISTA_INGREDIENTES = 2;
    public static final int PASOS_RECETAS = 3;
    
    
    @EJB
    private RecetasServiceLocal recetasService;
    /**
     * Creates a new instance of RecetaManagedBean
     */
    public RecetaManagedBean() {
        System.out.println("Constructor");
    }
    
    @PostConstruct
    public void cargaReceta(){
        receta = recetasService.getRecetaById(1);
        System.out.println("receta" + receta.getTitulo());
    }

    public Receta getReceta() {
        return receta;
    }

    public int getPantallaActual() {
        return pantallaActual;
    }

    
    
    public boolean isPantallaPrincipal(){
        return this.pantallaActual == PRINCIPAL_RECETA;
    }
    
    public boolean isPantallaListaUtensilios(){
        return this.pantallaActual == LISTA_UTENSILIOS;
    }
    
    public boolean isPantallaListaIngredientes(){
        return this.pantallaActual == LISTA_INGREDIENTES;
    }
    
    public boolean isPantallaPasos(){
        return this.pantallaActual == PASOS_RECETAS;
    }
    
    public void cambiarPantalla(int pantalla){
        this.pantallaActual = pantalla;
    }
    
    public List<String> getUtensiliosDeReceta(){
        List<String> list = recetasService.getListaUtensilios(this.receta.getId());
        //System.out.println("lista " + list +"***********");
        return list;
    }
    
    public List<Ingrediente> getIngredientesDeReceta(){
        return recetasService.getListaIngredientes(this.receta.getId());
    }
}
