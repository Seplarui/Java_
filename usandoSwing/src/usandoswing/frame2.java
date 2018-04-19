
package usandoswing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class frame2 extends JFrame{
    
    public frame2() {
        
    
    setTitle("Usando Swing");
    setSize(500,500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JPanel panel= new JPanel();
    
    add(panel);
    
    panel.setBackground(Color.red);
    JButton boton= new JButton("Boton");
    Dimension d= new Dimension();
    
    d.height=80;
    d.width=200;
    boton.setPreferredSize(d);
    panel.add(boton);
    
    
    }
}
