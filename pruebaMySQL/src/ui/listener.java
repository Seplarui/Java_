package ui;

import DAO.ClienteDAO;
import DAO.Conexion_DB;
import DAO.cliente;

import java.awt.event.*;
import java.sql.*;
import java.util.List;

import javax.swing.*;

public class listener implements ActionListener {

    private JTextField id, idBuscar;
    private JTextArea notas;
    private JButton atras,adelante,buscar,todos;
    private List<cliente> clientes;
    
    private int posicion;
    
    public listener(JTextField id, JTextArea notas, JTextField idBuscar, JButton atras, JButton adelante, JButton buscar, JButton todos) {
        this.id=id;
        this.notas=notas;
        this.idBuscar=idBuscar;
        this.atras=atras;
        this.adelante=adelante;
        this.buscar=buscar;
        this.todos=todos;
        posicion=0;
    }
    
    public void actionPerformed(ActionEvent e) {
        cliente c= new cliente();
        
        if(e.getSource()==this.buscar) {
            adelante.setEnabled(false);
            atras.setEnabled(false);
            
            try {
                Conexion_DB conexion_DB= new Conexion_DB();
                Connection con= conexion_DB.AbrirConexion();
                
                ClienteDAO clienteDAO= new ClienteDAO();
                c.setId(idBuscar.getText());
                c=clienteDAO.findById(con, c);
                conexion_DB.CerrarConexion(con);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        if(e.getSource()==this.todos) {
            adelante.setEnabled(true);
            atras.setEnabled(true);
            
            posicion=0;
            
            try{
                Conexion_DB conexion_DB=new Conexion_DB();
                Connection con= conexion_DB.AbrirConexion();
                ClienteDAO clienteDAO= new ClienteDAO();
                
                clientes=clienteDAO.findAll(con);
                conexion_DB.CerrarConexion(con);
                
                posicion=0;
                c=clientes.get(posicion);
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        if(e.getSource()==this.adelante) {
            posicion++;
            if(posicion==clientes.size()) {
                posicion--;
            }
            c=clientes.get(posicion);
        }
        
        //ATRAS
        
        if(e.getSource()==this.atras) {
            if(posicion>0) {
                posicion--;
            }
            
            c=clientes.get(posicion);
        }
        actualiza(c);
    }
    
    private void actualiza(cliente c) {
        this.id.setText(c.getId());
        this.notas.setText(c.getNotas());
    }
}
