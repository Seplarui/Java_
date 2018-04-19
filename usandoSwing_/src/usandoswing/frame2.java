package usandoswing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * 
 * @author sepla
 */
public class frame2  extends JFrame {
    
    private JPanel panel= new JPanel();
    public frame2() {
        setTitle("Título Ventana");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        panel.setBackground(Color.red);
        JButton boton= new JButton("Botón");
        
        boton.addActionListener(new escuchador_boton());
        Dimension d= new Dimension();
        
        d.height=40;
        d.width=100;
        
        boton.setPreferredSize(d);
        panel.add(boton);
    }
    
    //Clase para escuchar los eventos del botón
    
    class escuchador_boton implements ActionListener {
        //Se ha de reescribir el método actionPerformed, es el que responde al clic del botón
        
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.blue);
        }
    }

}
