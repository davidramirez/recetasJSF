/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.recetas.service;

import java.util.List;
import javax.ejb.Local;
import org.recetas.dominio.Ingrediente;
import org.recetas.dominio.Paso;
import org.recetas.dominio.Receta;

/**
 *
 * @author SISTEMAS
 */
@Local
public interface RecetasServiceLocal {
    
    public List<Receta> getListaRecetas();
    
    public Receta getRecetaById(int id);
    
    public List<Ingrediente> getListaIngredientes(int idReceta);
    
    public List<String> getListaUtensilios (int idReceta);
    
    public List<Paso> getListaPasos ( int idReceta);
    
    public void addValoracion(int idReceta, int valoracion);
    
}
