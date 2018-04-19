package usandoswing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    JPanel panel = new JPanel();
    JTextField kelvin = new JTextField("Grados Kelvin", 5);
    JTextField celsius = new JTextField("Grados Celsius", 5);

    
    public Convertidor() {

        setTitle("Convertidor Grados");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GridLayout grid = new GridLayout(4, 1, 5, 5);
        JLabel etiqueta1 = new JLabel("Grados Celsius:");
        JLabel etiqueta2 = new JLabel("Grados Kelvin:");

        celsius.addActionListener(new ConvertirGrados());
        JButton limpiar = new JButton("Limpiar");
        limpiar.addActionListener(new LimpiarTextos());

        Dimension d = new Dimension();
        d.height = 40;
        d.width = 40;
        limpiar.setPreferredSize(d);
        panel.setLayout(grid);
        panel.add(etiqueta1);
        panel.add(celsius);
        panel.add(etiqueta2);
        panel.add(kelvin);
        panel.add(limpiar);
        add(panel);

    }
    
    class ConvertirGrados implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String grado= celsius.getText();
            
            int convertido= Integer.parseInt(grado);
            convertido= convertido + 273;
            
          String  resultado= String.valueOf(convertido);

            kelvin.setText(resultado);
            
        }
    }

    class LimpiarTextos implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            kelvin.setText("");
            celsius.setText("");

        }

    }

    public static void main(String[] args) {

        Convertidor con = new Convertidor();

        con.setVisible(true);

    }

}
