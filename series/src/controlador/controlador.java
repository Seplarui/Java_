package controlador;

import modelo.acceso;
import modelo.listShow;
import modelo.show;
/**
 * 
 * @author sepla
 */
public class controlador {
    
    private int posicion;
    private listShow ls;
    
    public controlador(){
        
        posicion=0;
        ls=new listShow();
        ls=acceso.cargarLS();
    }
    
    public show primero() {
        posicion=0;
        return ls.getShow(posicion);
        
    }
    
    public show anterior() {
        if(posicion>0) {
            posicion--;
        }
        return ls.getShow(posicion);
    }
    
    public show siguiente() {
        posicion++;
        if(posicion==ls.longitud()) {
            posicion--;
        }
        return ls.getShow(posicion);
    }
    
    public void nuevo(show s) {
        ls.setShow(s);
        posicion=ls.longitud()-1;
        acceso.guardarLS(ls);
                
    }

}
