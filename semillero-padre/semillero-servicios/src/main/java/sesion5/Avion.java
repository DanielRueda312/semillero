package sesion5;

import sesion5.TipoVehiculoEnum;
import sesion5.AccionesVehiculoInterface;

/**
 * 
 * <b>Descripción:<b> Clase que determina la representacion de las caracteriscas en comun de un vehiculo
 * <b>Caso de Uso:<b> SEMILLERO 2021
 * @author DIEGO FERNANDO
 * @version 1.0 
 */
public class Avion extends Vehiculo implements AccionesVehiculoInterface {

	@Override
	public int obtenerVelocidadMaxima() {
		return 700;
	}

	@Override
	public Long obternerPesoMaximoCarga() {
		return 50L;
	}

	@Override
	public boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEmun) throws Exception {
		if(getTipoVechiculo().getIdentificador() == (tipoVehiculoEmun.getIdentificador())) {
			System.out.println("El vehiculo si es del mismo tipo");
			return true;
		} else {
			throw new Exception("El tipo de vehiculo asignado es erroneo, debe ser Aereo");
		}
	}
}
