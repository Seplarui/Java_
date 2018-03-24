package tests;

import java.util.Scanner;

/**
 *
 * @author haplo
 */
public class miNumero {
    
    private int numero;
    
    public void miNumero() {
        
        numero=0;
        
    }
    
    public int dobleNumero(int numero) {
        int doble=2*numero;
        return doble;
    }
    
    public int tripleNumero(int numero) {
        int triple=3*numero;
        return triple;
    }
    
    public static void main(String[] args) {
        
        
        System.out.println("Introduce un número por favor: ");
        Scanner sc= new Scanner(System.in);
        int numero=sc.nextInt();
        
        miNumero calculo= new miNumero();
        
       int  doble=calculo.dobleNumero(numero);
                System.out.println("El doble del número introducido es: "+doble);

       int triple= calculo.tripleNumero(numero);
                System.out.println("El triple del número introducido es: "+triple);

        
        
        
    }
}
