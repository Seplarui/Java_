
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author sepla
 */

class framePanel extends JFrame {
    
    public framePanel() {
        
        setTitle("Título Ventana");
        setSize(300,200);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel= new JPanel();
        
        add(panel);
        
        panel.setBackground(Color.red);
        
        
        
    }
    
}


public class Panel {
    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        framePanel fp= new framePanel();
        
        fp.setVisible(true);
    }

}
