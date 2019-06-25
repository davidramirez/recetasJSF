/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.recetas.dominio;

/**
 *
 * @author SISTEMAS
 */
public class Ingrediente {
    
    private String nombre;
    
    private int cantidad;
      
    private Unidad unidades;

    public Ingrediente() {
    }

    public Ingrediente(String nombre, int cantidad, Unidad unidades) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Unidad getUnidades() {
        return unidades;
    }

    public void setUnidades(Unidad unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", unidades=" + unidades + '}';
    }
    
    
}
