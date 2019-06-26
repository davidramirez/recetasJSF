/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.recetas.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.recetas.dominio.Ingrediente;
import org.recetas.dominio.Paso;
import org.recetas.dominio.Receta;
import org.recetas.web.beans.AppManagedBean;

@Stateless
public class RecetasService implements RecetasServiceLocal {

    @Inject
    private AppManagedBean appMB;

    @Override
    public List<Receta> getListaRecetas() {
        List<Receta> listaRecetas = appMB.getListaRecetas();
        return listaRecetas;
    }

    @Override
    public Receta getRecetaById(int id) {
        Receta recetaById = null;
        List<Receta> listaRecetas = getListaRecetas();
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
        List<Receta> listaRecetas = getListaRecetas();
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
        List<Receta> listaRecetas = getListaRecetas();
        for (Receta receta : listaRecetas) {
            if (receta != null && receta.getId() == idReceta) {
                listaUtensilios = receta.getListaUtensilios();
            }
        }
        return listaUtensilios;
    }

    @Override
    public List<Paso> getListaPasos(int idReceta) {
        List<Paso> listaPasos = null;
        List<Receta> listaRecetas = getListaRecetas();
        for (Receta receta : listaRecetas) {
            if (receta != null && receta.getId() == idReceta) {
                listaPasos = receta.getListaPasos();
            }
        }
        return listaPasos;
    }

    @Override
    public void addValoracion(int idReceta, int valoracion) {
        List<Receta> listaRecetas = getListaRecetas();
        for (Receta receta : listaRecetas) {
            if (receta != null && receta.getId() == idReceta) {
                sumaMedia(receta, valoracion);
            }
        }
    }

    public void sumaMedia(Receta receta, int valoracion) {
        double sumaValoraciones = receta.getValoracionMedia()* (double)receta.getNumValoracines();
        double media = (sumaValoraciones+valoracion)/((double)receta.getNumValoracines()+1);
        
        receta.setValoracionMedia(media);
        receta.setNumValoracines(receta.getNumValoracines()+1);
    }
}
