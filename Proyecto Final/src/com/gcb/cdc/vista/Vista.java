/*
 * VISTA
 * com.gcb.cdc.vista
 * Gabriel Camacho y Carlos Dighero
 * ********************************
 * Descripción :
 * Clase que realiza la parte visual del programa y mostrar los resultados al usuario 
 */

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
	//Atributos de la clase
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
		
		super("Proyecto Final"); //Estableciemiento del titulo del Frame
		setSize(900,600); //Aquí se establece el tamaño del Frame
		setBackground(color);//Aquí se establece el color de background del Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Operación para poder cerrar el Frame
		setLocation(300,100); //Aquí se establece la posición del Frame en la pantalla del usuario
		setResizable(true); //Se establece si el Frame puede reducirse o no
		
		color = new Color(91,203,185);
		color2 = new Color(192,255,246);
		//Se genera un Grid para poder acomodar los items
		setLayout(new GridLayout(1,2));
		
		panel1 = new JPanel(); //Se genera un panel principal para situar los items de la izquierda
		panel1.setLayout(new BorderLayout());
		
		ventestados = new JComboBox();
		panel1.add(ventestados,BorderLayout.NORTH); //Implementación del ComboBox al panel principal
		
		panelbotons = new JPanel(); 
		panelbotons.setBackground(color);
		panelbotons.setLayout(new GridLayout(4,2)); //Se crea un nuevo panel para todos los Radio Botones con un Grid para comodarlos
		
		
		hombre = new JRadioButton("Hombre");
		hombre.setBackground(color);
		hombre.setFont(new Font("TimesRoman", Font.BOLD, 15)); //Se agregan los Radio Botones con sus propios a tributos 
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
		
		genero = new ButtonGroup(); //Se agregan los Radio Botones pertenecientes al genero en un Botton Group
		genero.add(hombre);
		genero.add(mujer);
		
		padecimiento = new ButtonGroup();//Se agregan los Radio Botones pertenecientes a los padecimientos en un Botton Group
		padecimiento.add(epoc);
		padecimiento.add(asma);
		padecimiento.add(hipertension);
		padecimiento.add(obesidad);
		padecimiento.add(edad);
		
		panel1.add(panelbotons,BorderLayout.CENTER);
		
		estados = new JButton("Mostrar Estados");
		estados.setFont(new Font("Serif", Font.BOLD, 13)); 
		panel1.add(estados,BorderLayout.SOUTH);//Se agrega un boton que deplejará los items en el ComboBox en la parte inferior del panel principal
		
		this.add(panel1); //Se agrega el primer panel principal al Frame
		
		panel2 = new JPanel();  //Se genera un segundo panel principal para situar los items de la derecha
		panel2.setBackground(color); //Aquí se establece el color de background del segundo panel principal
		panel2.setLayout(new BorderLayout());
		
		pandatos = new JPanel();
		pandatos.setBackground(color);
		pandatos.setLayout(new GridLayout(5,1)); //Se crea un nuevo panel para agregar los Label correspondientes a los datos proporcionados por el usuario
		
		nulo = new JLabel(""); //Se agrega cada Label al Grid del panel recientemente agregado con su atributos correspondientes
		nulo.setBackground(color);
		pandatos.add(nulo);
		
		info = new JLabel("");
		info.setFont(new Font("Serif", Font.BOLD, 15));
		info.setBackground(color);
		info.setHorizontalAlignment(SwingConstants.CENTER);
		pandatos.add(info);
		
		info2 = new JLabel("");
		info2.setFont(new Font("Serif", Font.BOLD, 15));
		info2.setBackground(color);
		info2.setHorizontalAlignment(SwingConstants.CENTER);
		pandatos.add(info2);
		
		info3 = new JLabel("");
		info3.setFont(new Font("Serif", Font.BOLD, 15));
		info3.setBackground(color);
		info3.setHorizontalAlignment(SwingConstants.CENTER);
		pandatos.add(info3);
		
		nulo2 = new JLabel("");
		nulo2.setBackground(color);
		pandatos.add(nulo2);
		
		panel2.add(pandatos,BorderLayout.NORTH); //Se grega el panel con los datos al segundo panel principal
		
		pangraph = new JPanel();
		pangraph.setLayout(new BorderLayout());
		panel2.add(pangraph,BorderLayout.CENTER); // Se crea un nuevo panel destinado a la grafica de barras y se grega al segundo panel princiapal
		
		this.add(panel2); // Se agrega el segundo Panel Secundario al Frame.
		
		
		
	}

}
