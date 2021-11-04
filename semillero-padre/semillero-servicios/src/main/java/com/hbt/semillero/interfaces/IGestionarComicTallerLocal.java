package com.hbt.semillero.interfaces;

import javax.ejb.Local;

import com.hbt.semillero.dto.ConsultaNombreDTO;

@Local
public interface IGestionarComicTallerLocal {
	public ConsultaNombreDTO consultarComicTamanioNombre(Long idComic, short lengthComic);
}
