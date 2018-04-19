package usandoswing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * 
 * @author sepla
 */
public class ejercicioSwing  extends JFrame {
    
    JPanel panel= new JPanel();
    private JButton azul, rosa, amarillo, verde;
    
    public ejercicioSwing() {
        setTitle("Ejercicio");
        
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
        panel.add(rosa, BorderLayout.SOUTH);
        panel.add(amarillo, BorderLayout.WEST);
        panel.add(verde, BorderLayout.EAST);
        
        add(panel);
        panel.setBackground(Color.red);
        
        class fondo_azul implements ActionListener {
            
            public void actionPerformed (ActionEvent e) {
                panel.setBackground(Color.blue);
            }
        
    }
        
        class fondo_rosa implements ActionListener {
            public void actionPerformed(ActionEvent e) 
            {
                panel.setBackground(Color.pink);
            }
        }
        
        class fondo_amarillo implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.yellow);
            }
        }
        
        class fondo_verde implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.green);
            }
        }
        
                azul.addActionListener(new fondo_azul());
                rosa.addActionListener(new fondo_rosa());
                amarillo.addActionListener(new fondo_amarillo());
                verde.addActionListener(new fondo_verde());
                

        
    }
    
    public static void main(String[] args)
    {
        ejercicioSwing fr=new ejercicioSwing();
        fr.setVisible(true);
    }
    

}
