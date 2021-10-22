package com.hbt.semillero.entidad;

public class Bicicleta extends Vehiculo {
	
	private String tipoBicicleta;
	private boolean utilizaChalecoReflector;
	/**
	 * Metodo encargado de retornar el valor del atributo tipoBicicleta
	 * @return El tipoBicicleta asociado a la clase
	 */
	public String getTipoBicicleta() {
		return tipoBicicleta;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo tipoBicicleta
	 * @param tipoBicicleta El nuevo tipoBicicleta a modificar.
	 */
	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo utilizaChalecoReflector
	 * @return El utilizaChalecoReflector asociado a la clase
	 */
	public boolean isUtilizaChalecoReflector() {
		return utilizaChalecoReflector;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo utilizaChalecoReflector
	 * @param utilizaChalecoReflector El nuevo utilizaChalecoReflector a modificar.
	 */
	public void setUtilizaChalecoReflector(boolean utilizaChalecoReflector) {
		this.utilizaChalecoReflector = utilizaChalecoReflector;
	}
}
