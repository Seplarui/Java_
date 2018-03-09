package usandoswing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author sepla
 */
public class Convertidor extends JFrame {

    public Convertidor() {

        setTitle("Convertidor Grados");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GridLayout grid= new GridLayout(4,1,5,5);
        JLabel etiqueta1 = new JLabel("Grados Celsius:");
        JLabel etiqueta2 = new JLabel("Grados Kelvin:");
        JTextField kelvin = new JTextField("Grados Kelvin");
        JTextField celsius = new JTextField("Grados Celsius");
        JButton limpiar = new JButton("Limpiar");
        Dimension d = new Dimension();
        d.height = 40;
        d.width = 40;
        limpiar.setPreferredSize(d);
        panel.setLayout(grid);
        panel.add(etiqueta1);
        panel.add(kelvin);

        panel.add(etiqueta2);
        panel.add(celsius);
        panel.add(limpiar);
        add(panel);

    }

    public static void main(String[] args) {

        Convertidor con = new Convertidor();

        con.setVisible(true);

    }

}
