package JPAservicios;

import java.util.List;

import javax.ejb.Local;

import sesion6.ComicDTO;
import JPAservicios.ConsultaNombrePrecioComicDTO;
import JPAservicios.ResultadoDTO;

@Local
public interface IGestionarComicLocal {
	
	public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(Long idComic);

	public ComicDTO crearComic(ComicDTO comicDTO) throws Exception;
	
	public ResultadoDTO actualizarComic(Long idComic);
	
	public ResultadoDTO eliminarComic(Long idComic);
	
	public List<ComicDTO> consultarComics();
}
