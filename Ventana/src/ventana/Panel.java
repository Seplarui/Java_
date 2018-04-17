package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame{
    
    public Panel() {
        setTitle("Título");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //FlowLayout fl= new FlowLayout(FlowLayout.LEFT,5,10);
        
        GridLayout grid=new GridLayout(3,2,5,5);
        
        //Creo un objeto tipo JPanel
        
        JPanel jp= new JPanel();
        JButton boton= new JButton("Botón");
        Dimension d= new Dimension();
        jp.setLayout(grid);
        
        for (int i=0; i<6; i++) {
            JButton button= new JButton("Boton"+(i+1));
            button.setPreferredSize(d);
            jp.add(button);
        }
        
        d.height=40;
        d.width=200;
        boton.setPreferredSize(d);
        
        //Añado el panel al frame
        
        add(jp);
        
        //Fondo de color rojo
        
        jp.setBackground(Color.red);
        
        //Añadir botón
        
        jp.add(boton);
    
        class escuchador_boton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jp.setBackground(Color.blue);
        }
    }
        
        boton.addActionListener(new escuchador_boton());
    
    }
    public static void main(String[] args) {
        
        Panel pn= new Panel();
        pn.setVisible(true);
        
        
    }

}
