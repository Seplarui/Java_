
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * 
 * @author sepla
 */

class frame_GridLayout extends JFrame {
    
    public frame_GridLayout() {
        
        setSize(300,300);
        
        //filas=3, columnas=2, horizontal gap=5, vergial gap=5
        GridLayout grid= new GridLayout(3,2,5,5);
        
        JPanel panel= new JPanel();
        
        add(panel);
        
        panel.setLayout(grid);
        
        for (int i=0; i<6;i++) {
            JButton boton= new JButton("Botón" +(i+1));
            boton.setPreferredSize(new Dimension(100,25));
            
            panel.add(boton);
            
        }
    }
}

public class testGridLayout {
    
    public static void main(String[] args) {
        frame_GridLayout f= new frame_GridLayout();
        f.setVisible(true);
    }

}
