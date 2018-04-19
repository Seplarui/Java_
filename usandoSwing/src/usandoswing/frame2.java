
package usandoswing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class frame2 extends JFrame{
    
    private JPanel panel= new JPanel();
    
    public frame2() {
        
    
    setTitle("Usando Swing");
    setSize(500,500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    add(panel);
    
    panel.setBackground(Color.red);
    JButton boton= new JButton("Boton");
    boton.addActionListener(new escuchador_boton());
    Dimension d= new Dimension();
    
    d.height=80;
    d.width=200;
    boton.setPreferredSize(d);
    panel.add(boton);
    }
    
    class escuchador_boton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.blue);
        }
    }
    

}
