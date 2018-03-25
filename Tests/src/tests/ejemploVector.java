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
public class ejemploVector {
    
    public static void main(String[] args) {
        int v[];
        int i, s=0;
        v= new int[5];
        
        for(i=0;i<5;i++) {
            v[i]=i;
        }
        
        for(i=0;i<5;i++) {
            System.out.println(v[i]);
            
        }
        
        for(i=0;i<5;i++) {
            s=s+v[i];
        }
        System.out.println("La suma es: "+s);
    }
}
