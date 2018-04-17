package ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame{
    
    public Panel() {
        setTitle("Título");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Creo un objeto tipo JPanel
        
        JPanel jp= new JPanel();
        
        //Añado el panel al frame
        
        add(jp);
        
        //Fondo de color rojo
        
        jp.setBackground(Color.red);
        
    }
    
    
    public static void main(String[] args) {
        
        Panel pn= new Panel();
        pn.setVisible(true);
        
        
    }

}
