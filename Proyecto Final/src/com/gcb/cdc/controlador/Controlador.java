package com.gcb.cdc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.gcb.cdc.modelo.ConectaTabla;
import com.gcb.cdc.vista.Vista;

public class Controlador implements ActionListener{

	Vista vistcod = new Vista();
	ConectaTabla contabla = new ConectaTabla(); 
	
	public Controlador(Vista vistcod, ConectaTabla contabla){
		
		this.vistcod = vistcod;
		this.contabla = contabla;
		this.vistcod.ventestados.addActionListener(this);
		this.vistcod.estados.addActionListener(this);
		this.vistcod.hombre.addActionListener(this);
		this.vistcod.mujer.addActionListener(this);
		this.vistcod.asma.addActionListener(this);
		this.vistcod.edad.addActionListener(this);
		this.vistcod.epoc.addActionListener(this);
		this.vistcod.hipertension.addActionListener(this);
		this.vistcod.obesidad.addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == vistcod.estados){
			
			vistcod.ventestados.removeAllItems();
			
			vistcod.ventestados.addItem("Aguascalientes");
			vistcod.ventestados.addItem("Baja California");
			vistcod.ventestados.addItem("Baja California Sur");
			vistcod.ventestados.addItem("Campeche");
			vistcod.ventestados.addItem("Coahuila de Zaragoza");
			vistcod.ventestados.addItem("Colima");
			vistcod.ventestados.addItem("Chiapas");
			vistcod.ventestados.addItem("Chihuahua");
			vistcod.ventestados.addItem("Ciudad de México");
			vistcod.ventestados.addItem("Durango");
			vistcod.ventestados.addItem("Guanajuato");
			vistcod.ventestados.addItem("Guerrero");
			vistcod.ventestados.addItem("Hidalgo");
			vistcod.ventestados.addItem("Jalisco");
			vistcod.ventestados.addItem("Estado de México");
			vistcod.ventestados.addItem("Michoacán");
			vistcod.ventestados.addItem("Morelos");
			vistcod.ventestados.addItem("Nayarit");
			vistcod.ventestados.addItem("Nuevo León");
			vistcod.ventestados.addItem("Oaxaca");
			vistcod.ventestados.addItem("Puebla");
			vistcod.ventestados.addItem("Queretaro");
			vistcod.ventestados.addItem("Quintana Roo");
			vistcod.ventestados.addItem("San Luis Potosi");
			vistcod.ventestados.addItem("Sinaloa");
			vistcod.ventestados.addItem("Sonora");
			vistcod.ventestados.addItem("Tabasco");
			vistcod.ventestados.addItem("Tamaulipas");
			vistcod.ventestados.addItem("Tlaxcala");
			vistcod.ventestados.addItem("Veracruz");
			vistcod.ventestados.addItem("Yucatán");
			vistcod.ventestados.addItem("Zacatecas");
			
			vistcod.ventestados.updateUI();
			vistcod.ventestados.repaint();
			
		}
		
		
	}

}
