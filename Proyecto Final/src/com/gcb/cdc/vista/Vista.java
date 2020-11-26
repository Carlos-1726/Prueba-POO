package com.gcb.cdc.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Vista extends JFrame {
	
	public JComboBox ventestados;
	public JRadioButton hombre;
	public JRadioButton mujer;
	public JRadioButton epoc;
	public JRadioButton asma;
	public JRadioButton hipertension;
	public JRadioButton obesidad;
	public JRadioButton edad;
	public JButton estados;
	public JPanel panel1,panel2, panelbotons,pandatos,pangraph;
	public JLabel info,info2,info3,nulo,nulo2;
	public ButtonGroup genero, padecimiento;
	public Color color,color2;
	
	public Vista(){
		
		super("Proyecto Final");
		setSize(900,600);
		setBackground(color);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,100);
		setResizable(true);
		
		color = new Color(91,203,185);
		color2 = new Color(192,255,246);
		
		setLayout(new GridLayout(1,2));
		
		panel1 = new JPanel();
		//panel1.setBackground(color);
		panel1.setLayout(new BorderLayout());
		
		ventestados = new JComboBox();
		panel1.add(ventestados,BorderLayout.NORTH);
		
		panelbotons = new JPanel();
		panelbotons.setBackground(color);
		panelbotons.setLayout(new GridLayout(4,2));
		
		
		hombre = new JRadioButton("Hombre");
		hombre.setBackground(color);
		hombre.setFont(new Font("TimesRoman", Font.BOLD, 15));
		hombre.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(hombre);
		
		mujer = new JRadioButton("Mujer");
		mujer.setBackground(color);
		mujer.setFont(new Font("TimesRoman", Font.BOLD, 15));
		mujer.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(mujer);
		
		epoc = new JRadioButton("EPOC");
		epoc.setBackground(color);
		epoc.setFont(new Font("TimesRoman", Font.BOLD, 15));
		epoc.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(epoc);
		
		asma = new JRadioButton("Asma");
		asma.setBackground(color);
		asma.setFont(new Font("TimesRoman", Font.BOLD, 15));
		asma.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(asma);
		
		hipertension = new JRadioButton("Hipertensión");
		hipertension.setBackground(color);
		hipertension.setFont(new Font("TimesRoman", Font.BOLD, 15));
		hipertension.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(hipertension);
		
		obesidad = new JRadioButton("Obesidad");
		obesidad.setBackground(color);
		obesidad.setFont(new Font("TimesRoman", Font.BOLD, 15));
		obesidad.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(obesidad);
		
		edad = new JRadioButton("Edad");
		edad.setBackground(color);
		edad.setFont(new Font("TimesRoman", Font.BOLD, 15));
		edad.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(edad);
		
		genero = new ButtonGroup();
		genero.add(hombre);
		genero.add(mujer);
		
		padecimiento = new ButtonGroup();
		padecimiento.add(epoc);
		padecimiento.add(asma);
		padecimiento.add(hipertension);
		padecimiento.add(obesidad);
		padecimiento.add(edad);
		
		panel1.add(panelbotons,BorderLayout.CENTER);
		
		estados = new JButton("Mostrar Estados");
		estados.setFont(new Font("Serif", Font.BOLD, 13));
		panel1.add(estados,BorderLayout.SOUTH);
		
		this.add(panel1);
		
		panel2 = new JPanel();
		panel2.setBackground(color);
		panel2.setLayout(new BorderLayout());
		
		pandatos = new JPanel();
		pandatos.setBackground(color);
		pandatos.setLayout(new GridLayout(5,1));
		
		nulo = new JLabel("");
		nulo.setBackground(color2);
		pandatos.add(nulo);
		
		info = new JLabel("");
		info.setFont(new Font("Serif", Font.BOLD, 15));
		info.setBackground(color2);
		info.setHorizontalAlignment(SwingConstants.CENTER);
		pandatos.add(info);
		
		info2 = new JLabel("");
		info2.setFont(new Font("Serif", Font.BOLD, 15));
		info2.setBackground(color2);
		info2.setHorizontalAlignment(SwingConstants.CENTER);
		pandatos.add(info2);
		
		info3 = new JLabel("");
		info3.setFont(new Font("Serif", Font.BOLD, 15));
		info3.setBackground(color2);
		info3.setHorizontalAlignment(SwingConstants.CENTER);
		pandatos.add(info3);
		
		nulo2 = new JLabel("");
		nulo2.setBackground(color2);
		pandatos.add(nulo2);
		
		panel2.add(pandatos,BorderLayout.NORTH);
		
		pangraph = new JPanel();
		pangraph.setLayout(new BorderLayout());
		panel2.add(pangraph,BorderLayout.CENTER);
		
		this.add(panel2);
		
		
		
	}

}
