package sesion5;

import sesion5.Avion;
import sesion5.Barco;
import sesion5.Bicicleta;
import sesion5.Vehiculo;
import sesion5.TipoVehiculoEnum;

public class CreacionVehiculoRest {

	public static void main(String[] args) {

		Vehiculo vehiculo1 = new Vehiculo("Amarillo", 120000);
		vehiculo1.setColor("Amarillo");
		vehiculo1.setNumeroAsientos(2);
		vehiculo1.setNumeroLlantas(4);
		vehiculo1.setRequiereLicencia(true);
		vehiculo1.setTipoVechiculo(TipoVehiculoEnum.TERRESTRE);
		
		Barco barco1 = new Barco();
		barco1.setColor("Blanco");
		barco1.setNumeroAsientos(20);
		barco1.setNumeroLlantas(0);
		barco1.setRequiereLicencia(true);
		barco1.setTipoVechiculo(TipoVehiculoEnum.ACUATICO);
		
		Bicicleta bicicleta1 = new Bicicleta();
		
		Avion avion1 = new Avion();
		avion1.setTipoVechiculo(TipoVehiculoEnum.AEREO);
		
		try {
			avion1.determinarTipoVehiculo(TipoVehiculoEnum.AEREO);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		
		System.out.println(vehiculo1.toString());
		System.out.println(barco1.toString());
		System.out.println("LA VELOCIDAD DEL BARCO ES: " + barco1.obtenerVelocidadMaxima());
		System.out.println("LA VELOCIDAD DE LA BICICLETA ES: " + bicicleta1.obtenerVelocidadMaxima());
		barco1.acelerar();
		bicicleta1.acelerar();
		
	}

}
