package com.proyecto.scraping.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.scraping.Beans.Pelicula;

@Service
public class PeliculaServiceImpl implements PeliculaService {

	@Autowired
	private PeliculaResporitory peliculaResporitory;

	@Override
	public List<Pelicula> mostrarPelicula(String url) {
		List<Pelicula> arrayPeliculas;
		arrayPeliculas = peliculaResporitory.findAll();
		return arrayPeliculas;
	}

}
