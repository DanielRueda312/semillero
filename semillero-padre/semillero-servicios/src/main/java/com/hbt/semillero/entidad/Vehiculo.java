package com.hbt.semillero.entidad;

import java.math.BigDecimal;

/**
 * 
 * <b>Descripción:<b> Clase que determina la representacion de las caracteristicas en comun de un vehiculo
 * <b>Caso de Uso:<b> SEMILLERO 2021
 * @author Daniel Rueda
 * @version 1.0
 */
public class Vehiculo {
	
	/**
	 * Atributo que determina el color de un vehiculo
	 */
	private String color;
	/**
	 * Atributo que determina el tipo de vehiculo
	 */
	private String tipoVehiculo;
	/**
	 * Atributo que determina el numero de llantas de un vehiculo
	 */
	private int numeroLlantas;
	/**
	 * Atributo que determina el numero de asientos de un vehiculo
	 */
	private int numeroAsientos;
	/**
	 * Atributo que determina si el vehiculo requiere licencia o no
	 */
	private boolean requiereLicencia;
	/**
	 * Atributo que determina el precio de un vehiculo
	 */
	private BigDecimal precio;
	/**
	 * 
	 * Constructor de la clase.
	 */
	
	public Vehiculo() {
		// Constructor vacio
	}
	
	public Vehiculo(String color, Integer precio) {
		this.color = color;
		this.precio =new BigDecimal(precio);
	}

	/**
	 * Metodo encargado de retornar el valor del atributo color
	 * @return El color asociado a la clase
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo color
	 * @param color El nuevo color a modificar.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo tipoVehiculo
	 * @return El tipoVehiculo asociado a la clase
	 */
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo tipoVehiculo
	 * @param tipoVehiculo El nuevo tipoVehiculo a modificar.
	 */
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numeroLlantas
	 * @return El numeroLlantas asociado a la clase
	 */
	public int getNumeroLlantas() {
		return numeroLlantas;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numeroLlantas
	 * @param numeroLlantas El nuevo numeroLlantas a modificar.
	 */
	public void setNumeroLlantas(int numeroLlantas) {
		this.numeroLlantas = numeroLlantas;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numeroAsientos
	 * @return El numeroAsientos asociado a la clase
	 */
	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numeroAsientos
	 * @param numeroAsientos El nuevo numeroAsientos a modificar.
	 */
	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo requiereLicencia
	 * @return El requiereLicencia asociado a la clase
	 */
	public boolean isRequiereLicencia() {
		return requiereLicencia;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo requiereLicencia
	 * @param requiereLicencia El nuevo requiereLicencia a modificar.
	 */
	public void setRequiereLicencia(boolean requiereLicencia) {
		this.requiereLicencia = requiereLicencia;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo precio
	 * @return El precio asociado a la clase
	 */
	public BigDecimal getPrecio() {
		return precio;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo precio
	 * @param precio El nuevo precio a modificar.
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", tipoVehiculo=" + tipoVehiculo + ", numeroLlantas=" + numeroLlantas
				+ ", numeroAsientos=" + numeroAsientos + ", requiereLicencia=" + requiereLicencia + ", precio=" + precio
				+ "]";
	}
	
	
}
