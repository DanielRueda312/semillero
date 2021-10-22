package com.hbt.semillero.entidad;

public class Barco extends Vehiculo {
	
	private String nombreCapitan;
	private String puertoLlegada;
	
	/**
	 * Metodo encargado de retornar el valor del atributo nombreCapitan
	 * @return El nombreCapitan asociado a la clase
	 */
	public String getNombreCapitan() {
		return nombreCapitan;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo nombreCapitan
	 * @param nombreCapitan El nuevo nombreCapitan a modificar.
	 */
	public void setNombreCapitan(String nombreCapitan) {
		this.nombreCapitan = nombreCapitan;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo puertoLlegada
	 * @return El puertoLlegada asociado a la clase
	 */
	public String getPuertoLlegada() {
		return puertoLlegada;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo puertoLlegada
	 * @param puertoLlegada El nuevo puertoLlegada a modificar.
	 */
	public void setPuertoLlegada(String puertoLlegada) {
		this.puertoLlegada = puertoLlegada;
	}
	
}
