
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sepla
 */
class frameBorderLayout extends JFrame {

    JPanel panel = new JPanel();
    private JButton azul, rosa, amarillo, verde;

    public frameBorderLayout() {
        
        setTitle("Ejemplo con varios botones");
        
        setSize(500,500);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new BorderLayout());
        
        azul= new JButton("Azul");
        Dimension d= new Dimension();
        d.height=40;
        d.width=100;
        
        azul.setPreferredSize(d);
        
        verde= new JButton("Verde");
        
        verde.setPreferredSize(d);
        
        amarillo = new JButton("Amarillo");
        
        amarillo.setPreferredSize(d);
        
        rosa= new JButton("Rosa");
        rosa.setPreferredSize(d);
        
        panel.add(azul, BorderLayout.NORTH);
        panel.add(verde, BorderLayout.EAST);
        panel.add(amarillo, BorderLayout.WEST);
        panel.add(rosa, BorderLayout.SOUTH);
        
        add(panel);
        
        panel.setBackground(Color.red);
        

    }

}

public class testBorderLayout {
    
    public static void main(String[] args) {
        
        frameBorderLayout fm= new frameBorderLayout();
        fm.setVisible(true);
    }
    
    
    

}
