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
public class Paso {
    
    private int num;
    
    private String titulo;
    
    private String descripcion;
    
    private String imagenNombre;

    public Paso() {
    }

    public Paso(int num, String titulo, String descripcion, String imagenNombre) {
        this.num = num;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenNombre = imagenNombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public String getImagenNombre() {
        return imagenNombre;
    }

    public void setImagenNombre(String imagenNombre) {
        this.imagenNombre = imagenNombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.num;
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
        final Paso other = (Paso) obj;
        if (this.num != other.num) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paso{" + "num=" + num + ", titulo=" + titulo + ", descripcion=" + descripcion + ", imagenNombre=" + imagenNombre + '}';
    }
    
    
    
}
