/*
 * EJECUTAPROYECTO
 * com.gcb.cdc.vista
 * Gabriel Camacho y Carlos Dighero
 * ********************************
 * Descripción :
 * Clase que ejecuta el programa  
 */

package com.gcb.cdc.EjecutaProyectoF;

import com.gcb.cdc.controlador.Controlador;
import com.gcb.cdc.modelo.ConectaTabla;
import com.gcb.cdc.vista.*;

public class EjecutaProyecto {
	
	public static void main(String[] args){
		
		Vista ventana = new Vista();
		ConectaTabla con = new ConectaTabla();
		//Se manda como atributo los objetos de la clase vista y ConectaTabla al controlador
		Controlador cf = new Controlador(ventana, con);
		ventana.setVisible(true); //Aquí se hace visible el Frame de la parte de la vista.
		
	}

}
