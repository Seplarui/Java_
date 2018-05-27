import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class jtext extends JFrame{
	
	
	JTextField textField1, textField2;
	JPanel panel= new JPanel();
	
	public jtext() {
		
		setTitle("Ejemplo de JTextField");
		setSize(300, 100);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(new GridLayout(3,1,5,5));
		
		//Crear dos textfield y un button
		
		textField1= new JTextField("Teclea algo y presiona return",20);
		
		//Listener
		
		textField1.addActionListener(new TextFieldListener());
		
		//Asignar una línea negra de borde.
		
		textField1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		textField2= new JTextField(20);
		textField2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		JButton button= new JButton("Limpiar");
		button.addActionListener(new ButtonListener());
		
		//Añadir los elementos al panel
		
		panel.add(textField1);
		panel.add(textField2);
		panel.add(button);
		
		add(panel);
		
	}
	//Escuchador del textfield
	
	class TextFieldListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//coge el texto tecleado en textfield1 y lo asigna al otro textfield.
			
			String text= textField1.getText();
			textField2.setText(text);
		}
	}

	//escuchador del botón.
	
	class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			//limpia los textfields
			textField1.setText("");
			textField1.requestFocus(); //Da el foco al textfield1
			textField2.setText("");
		}
	}

	public static void main(String[] args) {
		
		jtext texto= new jtext();
		texto.setVisible(true);
		
		
	}

}
