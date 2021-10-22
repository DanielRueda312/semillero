package semillero.pruebasUnitarias;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

/**
 * 
 * <b>Descripción:<b> Clase que determina la creacion de los comics que se utilizaran para el
 * taller
 * <b>Caso de Uso:<b> SEMILLERO 2021
 * @author Daniel Rueda
 * @version
 */
public class CreacionComicTest {
	
	
	public static void main(String[] args) {
		// Se crean los 10 tipos de comics que se tienen en cuenta para el taller
		Comic comic1 = new Comic();
		comic1.setNombre("DBZ");
		comic1.setEditorial("Abrapalabra");
		comic1.setTematicaEnum(TematicaEnum.AVENTURAS);
		comic1.setColeccion("Manga Shounen");
		comic1.setNumeroPaginas(200);
		comic1.setPrecio(new BigDecimal(20000));
		comic1.setAutores("Komisho Uzako");
		comic1.setColor(true);
		comic1.setFechaVenta(LocalDate.of(1999, Month.APRIL, 3));
		comic1.setEstadoEnum(EstadoEnum.ACTIVO);
		comic1.setCantidad(15);
		
		Comic comic2 = new Comic();
		comic2.setNombre("Naruto");
		comic2.setEditorial("booksforU");
		comic2.setTematicaEnum(TematicaEnum.BELICO);
		comic2.setColeccion("Manga Shounen");
		comic2.setNumeroPaginas(450);
		comic2.setPrecio(new BigDecimal(15000));
		comic2.setAutores("Komishiwa Zante");
		comic2.setColor(false);
		comic2.setFechaVenta(LocalDate.of(2002, Month.JANUARY, 15));
		comic2.setEstadoEnum(EstadoEnum.ACTIVO);
		comic2.setCantidad(60);
		
		Comic comic3 = new Comic();
		comic3.setNombre("SNK");
		comic3.setEditorial("Planeta Comic");
		comic3.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic3.setColeccion("Manga Seinen");
		comic3.setNumeroPaginas(250);
		comic3.setPrecio(new BigDecimal(30000));
		comic3.setAutores("Araragi Uzake");
		comic3.setColor(true);
		comic3.setFechaVenta(LocalDate.of(2012, Month.MARCH, 18));
		comic3.setEstadoEnum(EstadoEnum.ACTIVO);
		comic3.setCantidad(15);
		
		Comic comic4 = new Comic();
		comic4.setNombre("Spider-Man");
		comic4.setEditorial("Abrapalabra");
		comic4.setTematicaEnum(TematicaEnum.CIENCIA_FICCION);
		comic4.setColeccion("MARVEL COMICS");
		comic4.setNumeroPaginas(600);
		comic4.setPrecio(new BigDecimal(50000));
		comic4.setAutores("John Anderson");
		comic4.setColor(false);
		comic4.setFechaVenta(LocalDate.of(1980, Month.SEPTEMBER, 30));
		comic4.setEstadoEnum(EstadoEnum.ACTIVO);
		comic4.setCantidad(80);
		
		Comic comic5 = new Comic();
		comic5.setNombre("Batman");
		comic5.setEditorial("Panini Editions");
		comic5.setTematicaEnum(TematicaEnum.CIENCIA_FICCION);
		comic5.setColeccion("BIBLIOTECA DC");
		comic5.setNumeroPaginas(800);
		comic5.setPrecio(new BigDecimal(80000));
		comic5.setAutores("John Stuart Smith");
		comic5.setColor(true);
		comic5.setFechaVenta(LocalDate.of(1970, Month.NOVEMBER, 29));
		comic5.setEstadoEnum(EstadoEnum.ACTIVO);
		comic5.setCantidad(200);
		
		Comic comic6 = new Comic();
		comic6.setNombre("Hinuyasha");
		comic6.setEditorial("Abrapalabra");
		comic6.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic6.setColeccion("Manga Shonen");
		comic6.setNumeroPaginas(300);
		comic6.setPrecio(new BigDecimal(45000));
		comic6.setAutores("Ute Kamizate");
		comic6.setColor(false);
		comic6.setFechaVenta(LocalDate.of(2001, Month.JANUARY, 20));
		comic6.setEstadoEnum(EstadoEnum.INACTIVO);
		comic6.setCantidad(0);
		
		Comic comic7 = new Comic();
		comic7.setNombre("Gantz");
		comic7.setEditorial("Panini Editions");
		comic7.setTematicaEnum(TematicaEnum.CIENCIA_FICCION);
		comic7.setColeccion("Manga Shonen");
		comic7.setNumeroPaginas(300);
		comic7.setPrecio(new BigDecimal(45000));
		comic7.setAutores("Akata Hisuru");
		comic7.setColor(true);
		comic7.setFechaVenta(LocalDate.of(2004, Month.JUNE, 20));
		comic7.setEstadoEnum(EstadoEnum.INACTIVO);
		comic7.setCantidad(0);
		
		Comic comic8 = new Comic();
		comic8.setNombre("Higurashi");
		comic8.setEditorial("Manga Seinen");
		comic8.setTematicaEnum(TematicaEnum.HORROR);
		comic8.setColeccion("Manga Shonen");
		comic8.setNumeroPaginas(500);
		comic8.setPrecio(new BigDecimal(35000));
		comic8.setAutores("Kuze Hinato");
		comic8.setColor(false);
		comic8.setFechaVenta(LocalDate.of(2004, Month.AUGUST, 8));
		comic8.setEstadoEnum(EstadoEnum.INACTIVO);
		comic8.setCantidad(0);
		
		Comic comic9 = new Comic();
		comic9.setNombre("El libro negro de la nueva izquierda");
		comic9.setEditorial("Planeta Comic");
		comic9.setTematicaEnum(TematicaEnum.HUMORISTICO);
		comic9.setColeccion("Fanaticos de Extrema-Derecha");
		comic9.setNumeroPaginas(150);
		comic9.setPrecio(new BigDecimal(3000));
		comic9.setAutores("Agustin Laje");
		comic9.setColor(true);
		comic9.setFechaVenta(LocalDate.of(2018, Month.MAY, 16));
		comic9.setEstadoEnum(EstadoEnum.INACTIVO);
		comic9.setCantidad(0);
		
		Comic comic10 = new Comic();
		comic10.setNombre("Una vida, muchas vidas");
		comic10.setEditorial("Panini Editions");
		comic10.setTematicaEnum(TematicaEnum.HISTORICO);
		comic10.setColeccion("Petro Presidente");
		comic10.setNumeroPaginas(200);
		comic10.setPrecio(new BigDecimal(20000));
		comic10.setAutores("PetroGOD");
		comic10.setColor(false);
		comic10.setFechaVenta(LocalDate.of(2021, Month.AUGUST, 2));
		comic10.setEstadoEnum(EstadoEnum.INACTIVO);
		comic10.setCantidad(0);
		
		//Se agregan los objetos creados con base en la clase Comic en la lista listaComics
		ArrayList<Object> listaComics = new ArrayList<Object>();
		listaComics.add((Object) comic1);
		listaComics.add((Object) comic2);
		listaComics.add((Object) comic3);
		listaComics.add((Object) comic4);
		listaComics.add((Object) comic5);
		listaComics.add((Object) comic6);
		listaComics.add((Object) comic7);
		listaComics.add((Object) comic8);
		listaComics.add((Object) comic9);
		listaComics.add((Object) comic10);
		
		
		comicsActivos(listaComics);
		
	}
	
	
	
	/**
	 * 
	 * Metodo encargado de verificar comics activos 
	 * <b>Caso de Uso</b> SEMILLERO 2021
	 * @author Daniel Rueda
	 *
	 */
	
	private static void comicsActivos(ArrayList al) {
			System.out.println("Inicia ejecucion del metodo comicsActivos()");
			
			for(int i=0; i<10; i++) {
				if(al.get(i) instanceof Comic) {
					if(Comic.getEstadoEnum() == EstadoEnum.ACTIVO) {
						System.out.println(al.get(i).toString());
					}
					else {
						
						
						System.out.println("Este comic se encuentra inactivo");
					}
				}
				
			}
		
			
			
		
		
	}
	
}
