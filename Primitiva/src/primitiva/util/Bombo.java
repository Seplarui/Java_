package primitiva.util;

import primitiva.util.Aleatorio;

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
        for(i=1;i<=numBolas;i++) {
            
            bolas[i-1]=i;
            alea=new Aleatorio();
        }
    }
    //Extrae y devuelve una bola del bombo
    
    public int sacar(){
        int devuelve,i;
        i=alea.nextInt(0,numBolas-1);
        devuelve=bolas[i];
        bolas[i]=bolas[numBolas-1];
        numBolas--;
        return devuelve;
        
    }
    
    class Resultado {
        //Clase que almacena el resultado
        
        private int r[][];
        protected Bombo bombo;
        public Resultado() {
            r= new int[6][8];
            bombo= new Bombo();
            
        }
        
        public void rellena() {
            //Rellena la matriz de resultados
            int i,j;
            for(i=0;i<6;i++) {
                for(j=0;j<8;j++) {
                    r[i][j]=bombo.sacar();
                }
            }
        }
        //Muestra el resultado
        public void muestra() {
            int i,j;
            for(i=0;i<8;i++) {
                for(j=0;j<6;j++) {
                    System.out.println(r[j][i]+" ");
                    
                }
                System.out.println("\n");
            }
        }
    }
    
}
