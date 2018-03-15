package lista1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author sepla
 */
public class frame extends JFrame {

    private JPanel panel = new JPanel();
    private JList listaJListColores; //lista para mostrar los colores
    private final String nombresColores[] = {"Negro", "Azul", "Cyan", "Gris Oscuro", "Gris", "Verde", "Gris Claro", "Magenta", "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo"};
    private final Color colores[] = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
    

    public frame() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setTitle("Lista Simple");
        add(panel);
        
        listaJListColores= new JList(nombresColores);
        listaJListColores.setVisibleRowCount(5);
        listaJListColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        panel.setLayout(new FlowLayout());
        
        panel.add(new JScrollPane(listaJListColores));
        
        listaJListColores.addListSelectionListener(new ManejadorLista());
    }
    
    private class ManejadorLista implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            panel.setBackground(colores[listaJListColores.getSelectedIndex()]);
        }
        
        
    }

}
