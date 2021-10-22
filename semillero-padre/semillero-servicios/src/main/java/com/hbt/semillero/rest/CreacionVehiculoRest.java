package com.hbt.semillero.rest;

import com.hbt.semillero.entidad.Avion;
import com.hbt.semillero.entidad.Barco;
import com.hbt.semillero.entidad.Vehiculo;

public class CreacionVehiculoRest {

	public static void main(String[] args) {
		
		Vehiculo vehiculo1 = new Vehiculo("Amarillo", 120000);
		vehiculo1.setColor("Amarillo");
		vehiculo1.setNumeroAsientos(2);
		vehiculo1.setNumeroLlantas(4);
		vehiculo1.setRequiereLicencia(true);
		vehiculo1.setTipoVehiculo("Terrestre");
		
		Barco barco1 = new Barco();
		barco1.setColor("Blanco");
		barco1.setNumeroAsientos(20);
		barco1.setNumeroLlantas(0);
		barco1.setRequiereLicencia(true);
		barco1.setTipoVehiculo("Acuatico");
		
		Avion avion1 = new Avion();
		avion1.setColor("Blanco");
		avion1.setNumeroAsientos(200);
		avion1.setNumeroLlantas(6);
		avion1.setRequiereLicencia(true);
		avion1.setTipoVehiculo("Aereo");
		
		
		
		System.out.println(vehiculo1.toString());
		System.out.println(barco1.toString());
		System.out.println("La velocidad maxima del avion es: " + avion1.obtenerVelocidadMaxima());
		avion1.acelerar();
	}

}
