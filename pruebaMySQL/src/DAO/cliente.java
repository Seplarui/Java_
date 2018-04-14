/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author haplo
 */
public class cliente {
    
    private String id;
    private String notas;
    
    public cliente() {
        this.id="";
        this.notas="";
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id=id;
    }
    
    public String getNotas() {
        return notas;
    }
    public void setNotas(String notas) {
        this.notas=notas;
    }
    
}
