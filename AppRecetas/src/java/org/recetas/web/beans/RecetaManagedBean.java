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
import org.recetas.dominio.Paso;
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
    public static final int VALORACION = 4;
    
    
    
    //Control num pasos
    private int numPaso = 1;
    private List<Paso> listaPasos;
    
    @EJB
    private RecetasServiceLocal recetasService;
    /**
     * Creates a new instance of RecetaManagedBean
     */
    public RecetaManagedBean() {
        //System.out.println("Constructor");
    }
    
    @PostConstruct
    public void cargaReceta(){
        receta = recetasService.getRecetaById(1);
        //System.out.println("receta" + receta.getTitulo());
    }

    public Receta getReceta() {
        return receta;
    }

    public int getPantallaActual() {
        return pantallaActual;
    }

    public int getNumPaso() {
        return numPaso;
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
    
    public boolean isPantallaValorar(){
        return this.pantallaActual == VALORACION;
    }
    
    public void cambiarPantalla(int pantalla){
        this.pantallaActual = pantalla;
        
        if(pantalla == PASOS_RECETAS){
            this.numPaso = 1;
            
            this.listaPasos = recetasService.getListaPasos(this.receta.getId());
            System.out.println("Cargo lista+++++++++++");
            System.out.println(listaPasos);
        }
    }
    
    public List<String> getUtensiliosDeReceta(){
        List<String> list = recetasService.getListaUtensilios(this.receta.getId());
        //System.out.println("lista " + list +"***********");
        return list;
    }
    
    public List<Ingrediente> getIngredientesDeReceta(){
        System.out.println("getingredientes+++++++++++++++++++");
        return recetasService.getListaIngredientes(this.receta.getId());
    }
    
    public boolean hayAnterior(){
        if(this.numPaso == 1)
            return false;
        
        return true;
    }
    
    public boolean haySiguiente(){
        if(this.numPaso < this.listaPasos.size())
            return true;
        
        return false;
    }
    
    public Paso getPaso(){
        return this.listaPasos.get(this.numPaso - 1);
    }
    
    public void pasoAnterior(){
        this.numPaso--;
    }
    
    public void pasoSiguiente(){
        this.numPaso++;
    }
}
