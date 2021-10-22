package semillero.pruebasUnitarias;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * 
 * <b>Descripción:<b> Clase que determina las pruebas unitarias para el CU1050 gestionar operaciones aritmeticas
 * <b>Caso de Uso:<b> CU1050 gestionar operaciones 
 * @author Daniel Rueda
 * @version 1.0
 */
public class OperacionesAritmeticasTest {
	/**
	 * Constante que contendra el log de la clase AritmeticaTest
	 */
	private final static Logger Log = Logger.getLogger(OperacionesAritmeticasTest.class);
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure(); //Inicializa el logger con una configuracion basica
		Log.info("INICIAN PRUEBAS UNITARIAS");
	}
	
	/**
	 * 
	 * Metodo encargado de probar que el resultado de la suma de dos numeros sea 450
	 * <b>Caso de Uso</b>CU1050 gestionar operaciones
	 * @author Daniel Rueda
	 *
	 */
	@Test
	public void validarResultadoSumaExitoso() {
		Log.info("Inicia ejecucion del metodo validarResultadoSumaExitoso()");
		
		int numero1 = 300;
		int numero2 = 150;
		int resultado = 450;
		
		Assert.assertEquals(resultado, numero1 + numero2);
		
		Log.info("Finaliza la ejecucion del metodo validarResultadoSumaExitoso()");
	}
	@Test
	public void validarResultadoSumaFallido() {
		Log.info("Inicia ejecucion del metodo validarResultadoSumaFallido()");
		
		int numero1 = 300;
		int numero2 = 150;
		int resultado = 455;
		
		try {
			if(resultado != (numero1 + numero2)) {
				Log.info("Se ha generado un error funcional probando el test validarResultadoSumaFallido()");
				throw new Exception("La suma ha fallado en el calculo");
			}
				
			
		} catch (Exception e) {
			Assert.assertEquals(e.getMessage(), "La suma ha fallado en el calculo");
		}
		
		Log.info("Finaliza la ejecucion del metodo validarResultadoSumaFallido()");
	}
	
	@AfterTest
	public void finalizarPruebasUnitarias() {
		Log.info("FINALIZAN PRUEBAS UNITARIAS");
	}
}

