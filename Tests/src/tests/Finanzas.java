/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author haplo
 */
public class Finanzas {
    
    private double cambioDolar;
    private double cambioEuro;
    //Constructor
    
   public void finanzas() {
       
       cambioDolar=1.36;
        
    }
   
   public double finanzas(double cambio) {
       
       cambio=cambio*1.386;
       return cambio;
   }
   
   public static void main(String[] args) {
       
       double res;
       Finanzas fin= new Finanzas();
       res=fin.finanzas(3);
       
       System.out.println("El cambio es: "+res);
   }
    
}
