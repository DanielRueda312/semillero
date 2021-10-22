package com.hbt.semillero.entidad;

import com.hbt.semillero.interfaces.AccionesVehiculointerface;

public class Avion extends Vehiculo implements AccionesVehiculointerface {

	@Override
	public int obtenerVelocidadMaxima() {
		
		return 700;
	}

	@Override
	public Long obtenerPesoMaximoCarga() {
		
		return 50L;
	}

	@Override
	public String determinarTipoVehiculo() {
		return "Aereo";
	}

}
