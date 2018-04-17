package ventana;

import javax.swing.JFrame;



public class Ventana extends JFrame{
    
    public Ventana() {
        setTitle("Hola!!");
        setSize(300,200);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        Ventana v= new Ventana();
        v.setVisible(true);
        
        
    }
    
}
