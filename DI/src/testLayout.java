
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author sepla
 */

class frame_Layout extends JFrame {
    
    public frame_Layout() {
        
    setSize(300,200);
    //Flowlayout
    
    FlowLayout fl= new FlowLayout(FlowLayout.LEFT,5,10);
    JPanel panel = new JPanel();
    
    add(panel);
    
    //Layout al panel
    
    panel.setLayout(fl);
    
    //4 botones
    
    for (int i=0; i<4; i++) {
        JButton button= new JButton("Button"+(i+1));
        button.setPreferredSize(new Dimension(100,25));
        panel.add(button);
        
        
                
    }
    }
    
    
    
}
public class testLayout {
    
    public static void main(String[] args) {
        frame_Layout fr= new frame_Layout();
        
        fr.setVisible(true);
    }

}
