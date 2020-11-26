/*
 * MODELOCOVID
 * com.gcb.cdc.modelo
 * Gabriel Camacho y Carlos Dighero
 * ********************************
 * Descripción :
 * Clase que determina la estructura de los datos que se recuperarán de la base de datos 
 */

package com.gcb.cdc.modelo;

public class ModeloCovid {
	//Atributos
	private String id;
	private int sexo;
	private int entidad;
	private int edad;
	private int epoc;
	private int asma;
	private int obesidad;
	private int hipertension;
	//Recuperación del valor del atributo
	public String getId() {
		return id;
	}
	//Inicializacion del valor del atributo
	public void setId(String id) {
		this.id = id;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getEntidad() {
		return entidad;
	}

	public void setEntidad(int entidad) {
		this.entidad = entidad;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEpoc() {
		return epoc;
	}

	public void setEpoc(int epoc) {
		this.epoc = epoc;
	}

	public int getAsma() {
		return asma;
	}

	public void setAsma(int asma) {
		this.asma = asma;
	}

	public int getObesidad() {
		return obesidad;
	}

	public void setObesidad(int obesidad) {
		this.obesidad = obesidad;
	}

	public int getHipertension() {
		return hipertension;
	}

	public void setHipertension(int hipertension) {
		this.hipertension = hipertension;
	}

	
	public ModeloCovid(){
		//Contructor de la clase 
		id ="";
		sexo=0;
		entidad=0;
		edad=0;
		epoc=0;
		asma=0;
		obesidad=0;
	    hipertension=0;
		
	}
	

}
