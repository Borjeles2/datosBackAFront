package com.proyecto.scraping.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.scraping.Beans.Pelicula;

import lombok.AllArgsConstructor;

//@AllArgsConstructor
//@Service
//public class PeliculaService {
public interface PeliculaService {
	
//	public List<Pelicula> savePelicula(String pelicula);

	public List<Pelicula> mostrarPelicula(String url);
	
//	public void guardarPelicula(String url)
	
//	@Autowired 
//	private PeliculaResporitory peliculaResporitory;
//	
//	public Pelicula create (Pelicula pelicula) {
//		return peliculaResporitory.save(pelicula);
//	}
//    
//	public List<Pelicula> getAllPeliculas (){
//		return peliculaResporitory.findAll();
//	}
//	
//	public void delete (Long id) {
//		peliculaResporitory.deleteById(id);
//	}
//	
//	public Optional<Pelicula> findById (Long id) {
//		return peliculaResporitory.findById(id);
//	}
//	
//	public Pelicula updatePelicula(Pelicula pelicula) {
//        return peliculaResporitory.save(pelicula);
//    }
//	
//    public boolean existById(Long id) {
//        return peliculaResporitory.existsById(id);
//    }
	
}
