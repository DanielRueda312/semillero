package com.hbt.semillero.interfaces;

public abstract class AccionesVehiculo {

	public abstract int obtenerVelocidadMaxima();
	
	public abstract Long obtenerPesoMaximoCarga();
	
	public abstract Long determinarTipoVehiculo();
	
	public void acelerar() {
		System.out.println("El vehiculo ha iniciado acelerar");
	}
}
