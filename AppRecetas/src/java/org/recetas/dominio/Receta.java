/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.recetas.dominio;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public class Receta implements Serializable {

    private int id;

    private String titulo;

    private String imagenNombre;

    private String descripcion;

    private int tiempoElaboracion;

    private Dificultad dificultad;

    private double valoracionMedia;

    private int numValoracines;

    private List<Ingrediente> listaIngredientes;

    private List<String> listaUtensilios;

    private List<Paso> listaPasos;

    public Receta() {
    }

    public Receta(int id, String titulo, String descripcion, int tiempoElaboracion, Dificultad dificultad) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tiempoElaboracion = tiempoElaboracion;
        this.dificultad = dificultad;
        this.numValoracines = 1;
        this.valoracionMedia = 5;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoElaboracion() {
        return tiempoElaboracion;
    }

    public void setTiempoElaboracion(int tiempoElaboracion) {
        this.tiempoElaboracion = tiempoElaboracion;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public double getValoracionMedia() {
        return valoracionMedia;
    }

    public void setValoracionMedia(double valoracionMedia) {
        this.valoracionMedia = valoracionMedia;
    }

    public int getNumValoracines() {
        return numValoracines;
    }

    public void setNumValoracines(int numValoracines) {
        this.numValoracines = numValoracines;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagenNombre() {
        return imagenNombre;
    }

    public void setImagenNombre(String imagenNombre) {
        this.imagenNombre = imagenNombre;
    }

    public List<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public List<String> getListaUtensilios() {
        return listaUtensilios;
    }

    public void setListaUtensilios(List<String> listaUtensilios) {
        this.listaUtensilios = listaUtensilios;
    }

    public List<Paso> getListaPasos() {
        return listaPasos;
    }

    public void setListaPasos(List<Paso> listaPasos) {
        this.listaPasos = listaPasos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Receta other = (Receta) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Receta{" + "id=" + id + ", titulo=" + titulo + ", imagenNombre=" + imagenNombre + ", descripcion=" + descripcion + ", tiempoElaboracion=" + tiempoElaboracion + ", dificultad=" + dificultad + ", valoracionMedia=" + valoracionMedia + ", numValoracines=" + numValoracines + ", listaIngredientes=" + listaIngredientes + ", listaUtensilios=" + listaUtensilios + ", listaPasos=" + listaPasos + '}';
    }

}
