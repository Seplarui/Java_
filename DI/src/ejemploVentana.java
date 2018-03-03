import javax.swing.JFrame;

/**
 *
 * @author sepla
 */
class frame extends JFrame {

    public frame() {

        setTitle("Título Ventana");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //para que se cierre la ventana con el icono cerrar
    }

}

public class ejemploVentana {

    public static void main(String[] args) {

        frame f = new frame();
        f.setVisible(true);

    }

}
