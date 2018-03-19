/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import modelo.acceso;
import modelo.listShow;
import modelo.show;

/**
 *
 * @author sepla
 */
public class Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Prueba de guardar en fichero;
        //instanciamos un show con los datos de una serie:
        show sh = new show("Breaking Bad", "Vicent Ghilligan", 5, "Drama", 5);
        //instanciamos una lista de series
        listShow ls = new listShow();
        //añadimos la serie a la lista de series
        ls.setShow(sh);
        //creamos segunda serie
        show sh2 = new show("Juego de Trones", "David Benioff", 6, "1", 6);
        ls.setShow(sh2);
        //guardamos en el fichero los datos creados
        acceso.guardarLS(ls);
        //mensaje para saber que ha acabado:
        System.out.println("Serie guardada con éxito");
    }

}
