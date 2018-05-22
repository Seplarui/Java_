package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class frame extends JFrame{
	
	private JPanel panel1= new JPanel();
	private JPanel panel2= new JPanel();
	private JPanel panel3= new JPanel();
	private JPanel panel4= new JPanel();
	
	private JButton atras, adelante, buscar, todos;
	private JLabel e1,e2,e3;
	private JTextField id, idBuscar;
	private JTextArea notas;
	
	
	private listener miListener;
	
	public frame() {
		setSize(800,200);
		setTitle("Acceso a MySQL");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel1.setLayout(new BorderLayout());
		panel2.setLayout(new FlowLayout());
		panel3.setLayout(new FlowLayout());
		panel4.setLayout(new FlowLayout());
		
		add(panel1);
		
		panel1.add(panel3,BorderLayout.SOUTH);
		panel1.add(panel2, BorderLayout.CENTER);
		panel1.add(panel4, BorderLayout.NORTH);
		
		//panel sur con botones desplazamiento
		
		atras= new JButton("<");
		adelante= new JButton(">");
		panel3.add(atras);
		panel3.add(adelante);
		
		//PANEL CENTRAL CON DATOS
		
		e1= new JLabel("ID");
		
		id= new JTextField(10);
		
		panel2.add(e1);
		panel2.add(id);
		
		e2= new JLabel("Notas");
		notas=new JTextArea(5,40);
		
		panel2.add(e2);
		panel2.add(notas);
		
		//panel norte con búsquedas
		
		e3= new JLabel("ID a buscar");
		idBuscar=new JTextField(10);
		buscar= new JButton("Buscar");
		todos= new JButton("Todos");
		
		panel4.add(e3);
		panel4.add(idBuscar);
		panel4.add(buscar);
		panel4.add(todos);
		
		//escuchadores
		
		miListener= new listener(id, notas, idBuscar,atras,adelante,buscar,todos);
		atras.addActionListener(miListener);
		adelante.addActionListener(miListener);
		buscar.addActionListener(miListener);
		todos.addActionListener(miListener);
		
		//botones de movimiento deshabilitados inicialmente
		
		adelante.setEnabled(false);
		atras.setEnabled(false);
	}

}
