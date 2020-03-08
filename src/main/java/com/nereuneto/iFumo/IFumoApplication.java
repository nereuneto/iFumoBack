package com.nereuneto.iFumo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nereuneto.iFumo.domain.Categoria;
import com.nereuneto.iFumo.repositories.CategoriaRepository;

@SpringBootApplication
public class IFumoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(IFumoApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Carvão");
		Categoria cat2 = new Categoria(null,"Essência");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	}

}
