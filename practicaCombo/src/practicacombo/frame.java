package practicacombo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author sepla
 */
public class frame extends JFrame {

    private JComboBox combo;
    private JLabel etiqueta;
    private JPanel panel;
    private String[] imagenes = {"Rabbit", "Cat", "Dog", "Bird", "Pig"};
    private Icon img;

    public frame() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setTitle("Combos e Imagenes");
        panel= new JPanel();
        panel.setLayout(new BorderLayout());
        
        add(panel);
        
        combo= new JComboBox(imagenes);
        panel.add(combo, BorderLayout.NORTH);
        
        //se instancia un objeto ImageIcon que es el encaragdo de ir al disco y traer la imagen
        
        img= new ImageIcon(getClass().getResource("imagenes/rabbit.gif"));
        
        etiqueta= new JLabel(); //intancio etiqueta
        etiqueta.setText("Rabbit"); //texto de la etiqueta
        etiqueta.setIcon(img); //se añade el icono a la etiqueta
        
        //centro el texto y lo posiciono debajo de la imagen
        
        etiqueta.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        etiqueta.setToolTipText("Esta es una etiqueta"); //etiqueta que aparece al poner el cursor encima de la imagen
        
        
        
        
        
        panel.add(etiqueta, BorderLayout.CENTER); //se añade la etiqueta al panel

        //combo al escuchador
        combo.addItemListener(new ManejadorCombo());
    }
    
    private class ManejadorCombo implements ItemListener {
        public void itemStateChanged (ItemEvent e) {
            
            //obtengo el indice del texto que el usuario ha seleccionado en el combo
            //usando el método getSelectedIndex() del combo. Este método me devuelve un entero
            //donde 0 será que el usuario ha seleccionado "Rabbit", 1 "cat"...
            
            int indice= combo.getSelectedIndex();
            //obtengo el texto que corresopnde con ese índice usando el vector imagenes:
            String s= imagenes[indice];
            //instancio la imagen apropiada concatenando
            
            img= new ImageIcon(getClass().getResource("imagenes/"+s+".gif"));
            //añado el icono a la etiqueta
            etiqueta.setIcon(img);
            //añado el texto a la etiqueta:
            etiqueta.setText(s);
            
        }
    }

}
