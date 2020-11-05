package com.gcb.cdc.vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Vista extends JFrame {
	
	public JComboBox ventestados;
	public JRadioButton hombre;
	public JRadioButton mujer;
	public JRadioButton epoc;
	public JRadioButton asma;
	public JRadioButton hipertension;
	public JRadioButton obesidad;
	public JRadioButton edad;
	public Button estados;
	public JPanel panel1,panel2, panelbotons;
	
	public Vista(){
		
		super("Proyecto Final");
		setSize(900,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,100);
		setResizable(true);
		
		setLayout(new GridLayout(1,2));
		
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		
		ventestados = new JComboBox();
		panel1.add(ventestados,BorderLayout.NORTH);
		
		panelbotons = new JPanel();
		panelbotons.setLayout(new GridLayout(4,2));
		
		hombre = new JRadioButton("Hombre");
		panelbotons.add(hombre);
		mujer = new JRadioButton("Mujer");
		panelbotons.add(mujer);
		epoc = new JRadioButton("EPOC");
		panelbotons.add(epoc);
		asma = new JRadioButton("Asma");
		panelbotons.add(asma);
		hipertension = new JRadioButton("Hipertension");
		panelbotons.add(hipertension);
		obesidad = new JRadioButton("Obesidad");
		panelbotons.add(obesidad);
		edad = new JRadioButton("Edad");
		panelbotons.add(edad);
		
		panel1.add(panelbotons,BorderLayout.CENTER);
		
		this.add(panel1);
		
		panel2 = new JPanel();
		this.add(panel2);
		
		
	}

}
