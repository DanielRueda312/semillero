package com.hbt.semillero.interfaces;

public interface AccionesVehiculointerface {

	public  int obtenerVelocidadMaxima();
	
	public  Long obtenerPesoMaximoCarga();
	
	public  String determinarTipoVehiculo();
	
	public default void acelerar() {
		System.out.println("El vehiculo ha iniciado acelerar");
	}
}
