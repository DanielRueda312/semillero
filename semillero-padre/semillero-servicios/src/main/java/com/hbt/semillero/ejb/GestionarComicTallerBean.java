package com.hbt.semillero.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.hbt.semillero.dto.ConsultaNombreDTO;
import com.hbt.semillero.interfaces.IGestionarComicTallerLocal;



@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarComicTallerBean implements IGestionarComicTallerLocal {
	
	@PersistenceContext
	public EntityManager em;
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	@Override
	public ConsultaNombreDTO consultarComicTamanioNombre(Long idComic, short lengthComic) {
		//Se lleva a cabo la consulta del nombre del Comic
		String consulta = "SELECT new com.hbt.semillero.dto.ConsultaNombreDTO(c.nombre)  "
						+ " FROM Comic c WHERE c.id = :idComic";
		ConsultaNombreDTO consultaNombreDTO = new ConsultaNombreDTO();
		try {
			Query consultaNativa = em.createQuery(consulta);
			consultaNativa.setParameter("idComic", idComic);
			consultaNombreDTO = (ConsultaNombreDTO) consultaNativa.getSingleResult();
			//Se comprueba lo de la longitud máxima de caracteres
			if (consultaNombreDTO.length()>=lengthComic) {
				System.out.println("La longitud del nombre del comic " + consultaNombreDTO + " es igual o excede la longitud maxima permitida de " + lengthComic + " caracteres");
			}
			else {
				System.out.println("La longitud del nombre del comic " + consultaNombreDTO + " es aceptable porque es menor que la longitud maxima permitida de " + lengthComic + " caracteres");
			}
			consultaNombreDTO.setExitoso(true);
			consultaNombreDTO.setMensajeEjecucion("Comics procesados exitosamente");	
		} catch (Exception e) {
			consultaNombreDTO.setExitoso(false);
			consultaNombreDTO.setMensajeEjecucion("Se ha presentado un error tecnico");
		}

		return consultaNombreDTO;
	}
}
