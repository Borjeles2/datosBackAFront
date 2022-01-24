package com.proyecto.scraping.RestController;

import java.util.List;
import java.util.Optional;

import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.scraping.Beans.Pelicula;
import com.proyecto.scraping.Services.PeliculaResporitory;
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
	
	@RequestMapping("/test")
//	@RequestMapping(value="test" ,method=RequestMethod.GET)
	public String test() {
//		peliculaServiceScraping.guardarPelicula(URL);
//		return String.valueOf(peliculaServiceScraping.getHtmlDocument(URL));
		return "Esto es lo que devuelve el test";
	}
	
	@GetMapping("/peliculas")
	public List<Pelicula> savePelicula() {
//		peliculaService.savePelicula(URL);
		return peliculaService.mostrarPelicula(URL);
	}

//	@GetMapping("/todos")
//	public ResponseEntity<List<Pelicula>> getAllPeliculas() {
//		return new ResponseEntity<>(peliculaService.getAllPeliculas(), HttpStatus.OK);
//	}
//
//	@GetMapping("/id/{id}")
//	public ResponseEntity<Pelicula> getPeliculaById(@PathVariable Long id) {
//		Optional<Pelicula> pelicula = peliculaService.findById(id);
//		if (pelicula.isPresent()) {
//			return new ResponseEntity<>(pelicula.get(), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.OK);
//		}
//	}
	
//	@PutMapping
//	public ResponseEntity<Pelicula> updatePelicula(@PathVariable("id") String id, @RequestBody Pelicula pelicula) {
//		return new ResponseEntity<>(peliculaService.updatePelicula(pelicula), HttpStatus.ACCEPTED);
//	}
//
//	@DeleteMapping("/borrar/{id}")
//	public ResponseEntity<HttpStatus> deletePelicula(@PathVariable("id") Long id) {
//		peliculaService.delete(id);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}

}
