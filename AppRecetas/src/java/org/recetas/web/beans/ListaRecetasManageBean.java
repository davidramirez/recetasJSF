package org.recetas.web.beans;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.recetas.dominio.Receta;
import org.recetas.service.RecetasServiceLocal;

@Named(value = "listaRecetasMB")
@ViewScoped
public class ListaRecetasManageBean implements Serializable{
    
    @EJB
    private RecetasServiceLocal recetasServiceLocal;
    
    public ListaRecetasManageBean() {
    }
    
    public List<Receta> getAll(){
        return recetasServiceLocal.getListaRecetas();
    }
    
}
