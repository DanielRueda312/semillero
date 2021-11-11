package JPAservicios;

import javax.ejb.Local;

import sesion6.ComicDTO;

/**
 * 
 * <b>Descripción:<b> Clase que determina la interfaz que se tendra en cuenta para gestionar la compra del comic
 * <b>Caso de Uso:<b> 
 * @author Daniel Rueda
 * @version 1.0
 */
@Local
public interface IGestionarCompraComic {
 public ComicDTO comprarComic(ComicDTO comicDTO, Long comicCantidad) throws Exception;
}
