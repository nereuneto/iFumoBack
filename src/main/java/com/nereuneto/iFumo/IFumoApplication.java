package com.nereuneto.iFumo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nereuneto.iFumo.domain.Categoria;
import com.nereuneto.iFumo.domain.Produto;
import com.nereuneto.iFumo.repositories.CategoriaRepository;
import com.nereuneto.iFumo.repositories.ProdutoRepository;

@SpringBootApplication
public class IFumoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	public static void main(String[] args) {
		SpringApplication.run(IFumoApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Carvão");
		Categoria cat2 = new Categoria(null,"Essência");
		
		Produto p1 = new Produto(null,"Carvão de areia",5.00);
		Produto p2 = new Produto(null,"Carvão maomeno",7.00);
		Produto p3 = new Produto(null,"Carvão Zomo 1kg",20.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		
		p1.getCategoria().addAll(Arrays.asList(cat1));
		p2.getCategoria().addAll(Arrays.asList(cat1));
		p3.getCategoria().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
	}

}
