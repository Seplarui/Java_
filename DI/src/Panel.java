
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sepla
 */
class framePanel extends JFrame {

    public framePanel() {

        setTitle("Título Ventana");
        setSize(300, 200);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        add(panel);

        panel.setBackground(Color.red);

        //Añadir botón
        JButton boton = new JButton("Boton");

        //dimensiones del botón
        Dimension d = new Dimension();

        d.height = 40;
        d.width = 100;
        
            class escuchador_boton implements ActionListener {
                
                public void actionPerformed(ActionEvent e) {
                    panel.setBackground(Color.blue);
                }
   
    
}
        boton.setPreferredSize(d);
        boton.addActionListener(new escuchador_boton());
        panel.add(boton);
        


    }

}

public class Panel {

    public static void main(String[] args) {

        framePanel fp = new framePanel();

        fp.setVisible(true);
    }

}
