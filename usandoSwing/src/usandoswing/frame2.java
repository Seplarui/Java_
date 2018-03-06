package usandoswing;

import java.awt.*;
import javax.swing.*;

/**
 * 
 * @author sepla
 */
public class frame2  extends JFrame {
    
    public frame2() {
        setTitle("Título Ventana");
        
        setSize(500,500);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel= new JPanel();
        
        add(panel);
        
        panel.setBackground(Color.red);
        
        JButton boton= new JButton("Botón");
        
        Dimension d= new Dimension();
        
        d.height=40;
        d.width=100;
        
        boton.setPreferredSize(d);
        panel.add(boton);
    }

}
