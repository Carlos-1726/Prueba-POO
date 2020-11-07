package com.gcb.cdc.EjecutaProyectoF;

import com.gcb.cdc.controlador.Controlador;
import com.gcb.cdc.modelo.ConectaTabla;
import com.gcb.cdc.vista.*;

public class EjecutaProyecto {
	
	public static void main(String[] args){
		
		Vista ventana = new Vista();
		ConectaTabla con = new ConectaTabla();
		Controlador cf = new Controlador(ventana, con);
		ventana.setVisible(true);
		
	}

}
