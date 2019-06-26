/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.recetas.web.beans;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import org.recetas.dominio.Dificultad;
import org.recetas.dominio.Ingrediente;
import org.recetas.dominio.Paso;
import org.recetas.dominio.Receta;
import org.recetas.dominio.Unidad;

/**
 *
 * @author SISTEMAS
 */
@Named(value = "appMB")
@ApplicationScoped
public class AppManagedBean {

    
    private List<Receta> listaRecetas;
    
    
    public AppManagedBean() {
        
        this.listaRecetas = new ArrayList();
        
        Receta receta = new Receta(1,"Hamburguesa", 
                "Unas burguers que harán que volvamos a disfrutar de este tipo de comida,"
                        + " por eso y como muestra, esta hamburguesa de ternera con cebolla confitada.", 
                10, Dificultad.MEDIA);
        
        receta.setImagenNombre("hamburgher.jpg");
        
        List<Ingrediente> listaIngredientes = new ArrayList() ;
        
        listaIngredientes.add(new Ingrediente("hamburguesa de vacuno", 100, Unidad.gr));
        
        listaIngredientes.add(new Ingrediente("queso de cabra", 50, Unidad.gr));
        
        listaIngredientes.add(new Ingrediente("bacon", 80, Unidad.gr));
        
        listaIngredientes.add(new Ingrediente("pan hamburguesa", 1, Unidad.und));
        
        receta.setListaIngredientes(listaIngredientes);
        
        List <String> listaUtensilios = new ArrayList();
        
        listaUtensilios.add("plancha para freir");
        
        listaUtensilios.add("cuchillo");
        
        receta.setListaUtensilios(listaUtensilios);
        
       
        
        List<Paso> listaPasos = new ArrayList();
        
            // paso 1
            Paso paso = new Paso(1, "Calentar el aceite en la plancha", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
                    + " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, "
                    + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", "hamburguesa_paso1.jpg");
            listaPasos.add(paso);
            
            //paso2
            paso = new Paso(2, "Freir la hamburguesa", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
                    + " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, "
                    + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", "hamburguesa_paso2.jpg");
            listaPasos.add(paso);
            
            
            //paso3
            paso = new Paso(3, "Montar la hamburguesa", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
                    + " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, "
                    + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", "hamburguesa_paso3.jpg");
            listaPasos.add(paso);
      
             
         receta.setListaPasos(listaPasos);
         this.listaRecetas.add(receta);
        //Receta 2 
       
        receta = new Receta(2, "Espagueti Carbonara", 
                "Una deliciosa pasta italiana para 2 personas", 
                15, Dificultad.BAJA);
        
        receta.setImagenNombre("bacon_chips_and_fries.jpg");
        
        listaIngredientes = new ArrayList() ;
        
        listaIngredientes.add(new Ingrediente("espaguetis", 100, Unidad.gr));
        
        listaIngredientes.add(new Ingrediente("queso parmesano", 20, Unidad.gr));
        
        listaIngredientes.add(new Ingrediente("bacon", 50, Unidad.gr));
        
        listaIngredientes.add(new Ingrediente("aceite de oliva", 5, Unidad.ml));
        
        listaIngredientes.add(new Ingrediente("huevos", 2, Unidad.und));
        
        receta.setListaIngredientes(listaIngredientes);
        
        listaUtensilios = new ArrayList();
        
        listaUtensilios.add("sarten");
        
        listaUtensilios.add("tenedor");
        
        receta.setListaUtensilios(listaUtensilios);
        
        this.listaRecetas.add(receta);
        
   
  
    }

    public List<Receta> getListaRecetas() {
        return listaRecetas;
    }

    public void setListaRecetas(List<Receta> listaRecetas) {
        this.listaRecetas = listaRecetas;
    }
    
}
