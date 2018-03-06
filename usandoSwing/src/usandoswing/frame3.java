package usandoswing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 * 
 * @author sepla
 */
public class frame3  extends JFrame {
    
    JPanel panel= new JPanel();
    private JButton azul, rosa, amarillo, verde;
    
    public frame3() {
        setTitle("Ventana");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new BorderLayout());
        azul= new JButton("Azul");
        Dimension d= new Dimension();
        d.height=40;
        d.width=100;
        azul.setPreferredSize(d);
        
        rosa= new JButton("Rosa");
        rosa.setPreferredSize(d);
        
        amarillo= new JButton("Amarillo");
        amarillo.setPreferredSize(d);
        
        verde= new JButton("Verde");
        verde.setPreferredSize(d);
        
        panel.add(azul, BorderLayout.NORTH);
        panel.add(verde, BorderLayout.EAST);
        panel.add(amarillo, BorderLayout.WEST);
        panel.add(rosa, BorderLayout.SOUTH);
        
        add(panel);
        panel.setBackground(Color.red);
        
    }

}
