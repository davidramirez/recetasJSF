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
import org.recetas.web.beans.AppManagedBean;

@Stateless
public class RecetasService implements RecetasServiceLocal {

    private AppManagedBean appMB;

    @Override
    public List<Receta> getListaRecetas() {
        List<Receta> listaRecetas = appMB.getListaRecetas();
        return listaRecetas;
    }

    @Override
    public Receta getRecetaById(int id) {
        Receta recetaById = null;
        List<Receta> listaRecetas = appMB.getListaRecetas();
        for (Receta receta : listaRecetas) {
            if (receta != null && receta.getId() == id) {
                recetaById = receta;
            }
        }
        return recetaById;
    }

    @Override
    public List<Ingrediente> getListaIngredientes(int idReceta) {
        List<Ingrediente> listaIngredientes = null;
        List<Receta> listaRecetas = appMB.getListaRecetas();
        for (Receta receta : listaRecetas) {
            if (receta != null && receta.getId() == idReceta) {
                listaIngredientes = receta.getListaIngredientes();
            }
        }
        return listaIngredientes;
    }

    @Override
    public List<String> getListaUtensilios(int idReceta) {
        List<String> listaUtensilios = null;
        List<Receta> listaRecetas = appMB.getListaRecetas();
        for (Receta receta : listaRecetas) {
            if (receta != null && receta.getId() == idReceta) {
                listaUtensilios = receta.getListaUtensilios();
            }
        }
        return listaUtensilios;
    }
}
