/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.recetas.service;

import java.util.List;
import javax.ejb.Stateless;
import org.recetas.dominio.Ingrediente;
import org.recetas.dominio.Receta;

/**
 *
 * @author SISTEMAS
 */
@Stateless
public class RecetasService implements RecetasServiceLocal {

    @Override
    public List<Receta> getListaRecetas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Receta getRecetaById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ingrediente> getListaIngredientes(int idReceta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getListaUtensilios(int idReceta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
