package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ConsultaNombreDTO;
import com.hbt.semillero.interfaces.IGestionarComicTallerLocal;

@Path("/gestionarComicTaller")
public class GestionarComicTallerRest {
	
	@EJB
	private IGestionarComicTallerLocal gestionarComicLocal;
	
	@GET
	@Path("/consultarNombre")
	@Produces(MediaType.APPLICATION_JSON)
	public ConsultaNombreDTO consultarComicTamanioNombre(@QueryParam("idComic") Long idComic, @QueryParam("lengthComic") short lengthComic) {
		return this.gestionarComicLocal.consultarComicTamanioNombre(idComic, lengthComic);
	}
}
