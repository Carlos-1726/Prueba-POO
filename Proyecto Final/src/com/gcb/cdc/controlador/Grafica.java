/*
 * GRAFICA
 * com.gcb.cdc.controlador
 * Gabriel Camacho y Carlos Dighero
 * ********************************
 * Descripción :
 * Clase que una grafica de Barras de acuerdo a los parametros establecidos por el usuario
 */

package com.gcb.cdc.controlador;

import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica {
	
	//Atributos
	private int valor,val1,val2,val3,val4,val5,val6;
	private String barra;
	private String rango;
	private String titulo;
	
	
	public Grafica(int valor, String barra, String rango,String titulo){
		//Constructor de la clase definido para crear la grafica de padecimientos
		this.valor = valor;
		this.rango = rango;
		this.barra = barra;
		this.titulo = titulo;
		
	}
	public Grafica(int val1,int val2, int val3,int val4,int val5,int val6, String barra,String titulo){
		//Constructor de la clase definido para crear la grafica de edades
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		this.val4 = val4;
		this.val5 = val5;
		this.val6 = val6;
		this.barra = barra;
		this.titulo = titulo;
		
	}
		
	public JPanel createDemoPanel(){
		
		Color color = new Color(91,203,185);
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();//Creación de una grafica de barras
		dataset.setValue(valor, barra, rango); //Establecimiento de parametros de la tabla 
		
		JFreeChart graph = ChartFactory.createBarChart(titulo,"Población","Numero de Personas", dataset, PlotOrientation.VERTICAL, true, true, false);
		//Establecimiento de parametros basicos de la tabla
		graph.setBackgroundPaint(color); //Se establece un color para el background de la grafica
        graph.getTitle().setPaint(Color.black); //Se establece un color para el título
        CategoryPlot p = graph.getCategoryPlot(); //Clase con la cual se muestra los items de la tabla
        
        BarRenderer br = (BarRenderer) p.getRenderer();
        br.setMaximumBarWidth(.10); //Se establece el grosor de la barra
         
        p.setRangeGridlinePaint(Color.white); //Se establece un color para el título
        
        ChartPanel chartPanel = new ChartPanel(graph);//Implementación de la grafica creada a un panel
		return chartPanel;
	}
	
	public JPanel createDemoPanel2(){
		
		//Metodo que crea la grafica de barras para la parte de edades
		Color color = new Color(91,203,185);
		
		DefaultCategoryDataset datoset = new DefaultCategoryDataset();
		datoset.setValue(val1, barra, "20-30");
		datoset.setValue(val2, barra, "30-40");
		datoset.setValue(val3, barra, "40-50");
		datoset.setValue(val4, barra, "50-60");
		datoset.setValue(val5, barra, "60-70");
		datoset.setValue(val6, barra, "70-100");
		
		JFreeChart graf = ChartFactory.createBarChart(titulo,"Población","Numero de Personas", datoset, PlotOrientation.VERTICAL, true, true, false);
		graf.setBackgroundPaint(color);
		graf.getTitle().setPaint(Color.black); 
		
		CategoryPlot plot = graf.getCategoryPlot(); 
		plot.setRangeGridlinePaint(Color.white);
		
		BarRenderer b = (BarRenderer) plot.getRenderer();
	    b.setMaximumBarWidth(.10); 
	    
	    ChartPanel graphPanel = new ChartPanel(graf);
		return graphPanel;
		
	}
	
	
	
}
