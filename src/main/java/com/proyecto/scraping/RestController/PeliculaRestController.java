package com.proyecto.scraping.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.scraping.Beans.Pelicula;
import com.proyecto.scraping.Services.PeliculaService;
import com.proyecto.scraping.Services.PeliculaServiceImpl;

@RestController
@RequestMapping("/")
public class PeliculaRestController {

//	@Autowired
//	PeliculaResporitory peliculaResporitory;

	@Autowired
	private PeliculaService peliculaService;

	PeliculaServiceImpl peliculaServiceScraping = new PeliculaServiceImpl();

	@Value("${spring.datasource.URL}")
	String URL;

//	@RequestMapping("/test")
////	@RequestMapping(value="test" ,method=RequestMethod.GET)
//	public String test() {
////		peliculaServiceScraping.guardarPelicula(URL);
////		return String.valueOf(peliculaServiceScraping.getHtmlDocument(URL));
//		return "Esto es lo que devuelve el test";
//	}

	@GetMapping("/peliculas")
	public List<Pelicula> savePelicula() {
//		peliculaService.savePelicula(URL);
		return peliculaService.mostrarPelicula(URL);
	}

}
