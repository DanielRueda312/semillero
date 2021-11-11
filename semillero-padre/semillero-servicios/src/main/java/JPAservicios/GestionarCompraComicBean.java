package JPAservicios;

import java.time.LocalDate;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sesion6.EstadoEnum;

import sesion6.ComicDTO;
import sesion6.Comic;
import JPAservicios.IGestionarCompraComic;


/**
 * 
 * <b>Descripción:<b> Clase que determina el bean de la gestion de la compra del comic
 * <b>Caso de Uso:<b> 
 * @author Daniel Rueda
 * @version 1.0
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarCompraComicBean implements IGestionarCompraComic {
	
	@PersistenceContext
	public EntityManager em;
	
	/**
	 * 
	 * Metodo encargado de crear el servicio necesario para comprar un Comic
	 * <b>Caso de Uso</b>
	 * @author Daniel Rueda
	 * 
	 * @param comicDTO, cantidadaComprar
	 * @return comicDTOResult
	 * @throws Exception
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ComicDTO comprarComic(ComicDTO comicDTO, Long cantidadaComprar) throws Exception {
		
		Long nuevaCantidad;
		
		//Caso 1: No existe stock en la bodega para el comic seleccionado
		if(comicDTO.getEstadoEnum() == EstadoEnum.INACTIVO) {
			throw new Exception("El comic seleccionado no cuenta con stock en bodega");
		}
		
		//Caso 2: El comic se compra exitosamente y aún queda stock en la bodega para el comic seleccionado
		if(comicDTO.getCantidad()>cantidadaComprar) {
			nuevaCantidad = comicDTO.getCantidad() - cantidadaComprar;
			ComicDTO comicDTOResult = null;
			Comic comic = this.convertirComicDTOToComic(comicDTO);
			comic.setCantidad(nuevaCantidad);
			comic.setEstadoEnum(EstadoEnum.ACTIVO);
			comic.setFechaVenta(LocalDate.now());
			em.merge(comic);
			comicDTOResult = this.convertirComicToComicDTO(comic);
			comicDTOResult.setExitoso(true);
			comicDTOResult.setMensajeEjecucion("La compra del comic " + comicDTOResult.getNombre() + " fue exitosa");
			return comicDTOResult;
		}
		
		//Caso 3: El comic se compra exitosamente y se acaba el stock en la bodega para el comic seleccionado
		if(comicDTO.getCantidad() == cantidadaComprar) {
			ComicDTO comicDTOResult = null;
			Comic comic = this.convertirComicDTOToComic(comicDTO);
			comic.setCantidad(0L);
			comic.setEstadoEnum(EstadoEnum.INACTIVO);
			comic.setFechaVenta(LocalDate.now());
			em.merge(comic);
			comicDTOResult = this.convertirComicToComicDTO(comic);
			comicDTOResult.setExitoso(true);
			comicDTOResult.setMensajeEjecucion("La compra del comic " + comicDTOResult.getNombre() + " fue exitosa");
			return comicDTOResult;
		}
		
		//Caso 4: El cliente busca comprar más de lo que hay en el stock de la bodega para el comic seleccionado
		if(comicDTO.getCantidad()<cantidadaComprar) {
			throw new Exception("La cantidad existente del comic es:  " + comicDTO.getCantidad() + " y supera la ingresada");
		}
	}
	
	
	
	/**
	 * 
	 * Metodo encargado de transformar un comic a un comicDTO
	 * 
	 * @param comic
	 * @return
	 */
	private ComicDTO convertirComicToComicDTO(Comic comic) {
		ComicDTO comicDTO = new ComicDTO();
		comicDTO.setId(comic.getId());
		comicDTO.setNombre(comic.getNombre());
		comicDTO.setEditorial(comic.getEditorial());
		comicDTO.setTematicaEnum(comic.getTematicaEnum());
		comicDTO.setColeccion(comic.getColeccion());
		comicDTO.setNumeroPaginas(comic.getNumeroPaginas());
		comicDTO.setPrecio(comic.getPrecio());
		comicDTO.setAutores(comic.getAutores());
		comicDTO.setColor(comic.getColor());
		comicDTO.setFechaVenta(comic.getFechaVenta());
		comicDTO.setEstadoEnum(comic.getEstadoEnum());
		comicDTO.setCantidad(comic.getCantidad());
		return comicDTO;
	}

	/**
	 * 
	 * Metodo encargado de transformar un comicDTO a un comic
	 * 
	 * @param comic
	 * @return
	 */
	private Comic convertirComicDTOToComic(ComicDTO comicDTO) {
		Comic comic = new Comic();
		comic.setId(comicDTO.getId());
		comic.setNombre(comicDTO.getNombre());
		comic.setEditorial(comicDTO.getEditorial());
		comic.setTematicaEnum(comicDTO.getTematicaEnum());
		comic.setColeccion(comicDTO.getColeccion());
		comic.setNumeroPaginas(comicDTO.getNumeroPaginas());
		comic.setPrecio(comicDTO.getPrecio());
		comic.setAutores(comicDTO.getAutores());
		comic.setColor(comicDTO.getColor());
		comic.setFechaVenta(comicDTO.getFechaVenta());
		comic.setEstadoEnum(comicDTO.getEstadoEnum());
		comic.setCantidad(comicDTO.getCantidad());
		return comic;
	}



	
	
	}
	
}
