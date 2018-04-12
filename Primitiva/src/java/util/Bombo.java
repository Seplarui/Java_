package java.util;

import java.util.Aleatorio;

/**
 *
 * @author haplo
 */
public class Bombo {
    
    //vector para almacenar las bolas
    private int bolas[];
    //número de bolas por defecto en el bombo
    private int numBolas=49;
    //Objeto para generar número aleatorios
    private Aleatorio alea;
    //Constructor por defecto
    public Bombo() {
        inicializa();
    }
    //Constructor que permite indicar un número
    //de bolas (distinto a 49)
    public Bombo(int nBolas) {
        numBolas=nBolas;
        inicializa();
    }
    
    public int numBolas() {
        return(numBolas);
    }
    
    private void inicializa() {
        int i;
        bolas= new int[numBolas];
        
    }
    
}
