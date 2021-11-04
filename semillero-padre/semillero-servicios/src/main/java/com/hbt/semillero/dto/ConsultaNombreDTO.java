package com.hbt.semillero.dto;
import JPAservicios.ResultadoDTO;

public class ConsultaNombreDTO extends ResultadoDTO {
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	
	public ConsultaNombreDTO() {
		
	}
	
	public ConsultaNombreDTO(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * Método que nos permite obtener la longitud que posee el nombre de un Comic
	 */
	public int length() {
		// TODO Auto-generated method stub
		return this.nombre.length();
	}
}
