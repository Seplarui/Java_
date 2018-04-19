package usandoswing;

import java.awt.Color;
import javax.swing.*;
/**
 * 
 * @author sepla
 */
public class frame1  extends JFrame {
    
    public frame1 () {
        setTitle("Hola");
        
        setBounds(0,0,800,600);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel= new JPanel();
        
        add(panel);
        panel.setBackground(Color.red);
    }

}
