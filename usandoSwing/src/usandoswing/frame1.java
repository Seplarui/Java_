package usandoswing;

import java.awt.Color;
import javax.swing.*;

public class frame1 extends JFrame {
    
    public frame1() 
    {
        setTitle("Usando Swing");
        
        setBounds(0,0,800,600);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //AÑADIR PANEL
        
        JPanel panel= new JPanel();
        add(panel);
        panel.setBackground(Color.red);
    }
    
    

}
