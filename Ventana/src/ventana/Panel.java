package ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame{
    
    public Panel() {
        setTitle("Título");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Creo un objeto tipo JPanel
        
        JPanel jp= new JPanel();
        JButton boton= new JButton("Botón");
        Dimension d= new Dimension();
        
        d.height=40;
        d.width=200;
        boton.setPreferredSize(d);
        
        //Añado el panel al frame
        
        add(jp);
        
        //Fondo de color rojo
        
        jp.setBackground(Color.red);
        
        //Añadir botón
        
        jp.add(boton);
        
    }
    
    
    public static void main(String[] args) {
        
        Panel pn= new Panel();
        pn.setVisible(true);
        
        
    }

}
