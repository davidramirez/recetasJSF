package org.recetas.dominio;

public enum Dificultad {
    
    BAJA ("success"),
    MEDIA ("warning"), 
    ALTA ("danger");
    
    private final String color;
    
    private Dificultad(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
}
