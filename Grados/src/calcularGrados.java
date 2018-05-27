import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calcularGrados extends JFrame{
	
	private JTextField kelvin= new JTextField("Grados Kelvin");
	private JTextField celsius= new JTextField("Grados Celsius");
	
	JPanel panel= new JPanel();
	
	
	//Constructor
	public calcularGrados() {
		
		setTitle("Calcular Grados");
		setSize(500,500);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel.setLayout(new GridLayout(3,1,10,10));
		
		//Creamos los cuadros de texto
		

		
		//Botón
		
		JButton botonConvertir= new JButton("Convertir Grados");
		botonConvertir.addActionListener(new botonListener());
		
		add(panel);
		panel.add(celsius);
		panel.add(kelvin);
		panel.add(botonConvertir);
		
	}
	
	class botonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			double text= Double.parseDouble(celsius.getText()) +273.15;
			String convertirToString = String.valueOf(text);
			kelvin.setText(convertirToString);
		}
	}
	
	public static void main(String[] args)  {
		
		calcularGrados ventana= new calcularGrados();
		ventana.setVisible(true);
	}
		
	
	

}
