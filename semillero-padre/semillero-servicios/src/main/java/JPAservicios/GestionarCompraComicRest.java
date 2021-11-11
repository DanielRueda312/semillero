package JPAservicios;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sesion6.ComicDTO;

/**
 * 
 * <b>Descripción:<b> Clase que determina el rest de la gestion de la compra de un comic
 * <b>Caso de Uso:<b> 
 * @author Daniel Rueda
 * @version 1.0
 */
@Path("/gestionarCompraComic")
public class GestionarCompraComicRest {
	@EJB
	private IGestionarCompraComic gestionarComicLocal;
	
	@POST
	@Path("/comprarComic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ComicDTO comprarComic(ComicDTO comicDTO, Long cantidadaComprar) {
		ComicDTO comicDTOResult = new ComicDTO();
		try {
			comicDTOResult = this.gestionarComicLocal.comprarComic(comicDTO, cantidadaComprar);
		}  catch (Exception e) {
			comicDTOResult.setExitoso(false);
			comicDTOResult.setMensajeEjecucion("Se ha presentado un error tecnico, causa: " + e.getMessage());
		}
		return comicDTOResult;
	}
	
}
