package usandoswing;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;



/**
 * 
 * @author sepla
 */
public class testJtext  extends JFrame {
    
    JTextField textField1, textField2;
    
    JPanel panel= new JPanel();
    
    public testJtext()
    {
        setTitle("Ejemplo");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel.setLayout(new GridLayout(3,1,5,5));
        
        textField1= new JTextField("Teclea algo y presiona return", 20);
        
        //Listener
        
        textField1.addActionListener(new TextFieldListener());
        
        //Asignar línea negra de borde
        
        textField1.setBorder(BorderFactory.createLineBorder(Color.black));
        
        textField2= new JTextField(20);
        textField2.setBorder(BorderFactory.createLineBorder(Color.blue));
        
        JButton boton= new JButton("Limpiar");
        
        boton.addActionListener(new ButtonListener());
        
        //Se añaden los elementos al panel
        
        panel.add(textField1);
        panel.add(textField2);
        panel.add(boton);
        add(panel);
        
    }
    
    //Escuchador del textfield
    
    class TextFieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //coge el texto tecleado en textfield1 y lo asigna al otro textfield
            
            String text= textField1.getText();
            textField2.setText(text);
        }
    }
    
    //Escuchador del botón
    
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //limpiea los textfields
            
            textField1.setText("");
            textField1.requestFocus(); //da el foco al textfield1
            
            textField2.setText("");
            
        }
    }
    
    public static void main(String[] args) {
        testJtext jt= new testJtext();
        
        jt.setVisible(true);
    }
    
    

}
