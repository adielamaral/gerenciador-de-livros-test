package com.adiel.gerenciador.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adiel.gerenciador.domain.Categoria;
import com.adiel.gerenciador.domain.Livro;
import com.adiel.gerenciador.repositories.CategoriaRepository;
import com.adiel.gerenciador.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null, "Informática", "Livros de Informática");
		Categoria cat2 = new Categoria(null, "Aventura", "Livros de Aventura");
		Categoria cat3 = new Categoria(null, "Fantasia", "Livros de Fantasia");
		Categoria cat4 = new Categoria(null, "Biografia", "Livros de Biografia");
		Categoria cat5 = new Categoria(null, "Romance", "Livros de Romance");
		
		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
		Livro l2 = new Livro(null, "O Programador Pragmático: De Aprendiz a Mestre", "Andrew Hunt, David Thomas", "O Programador Pragmático ilustra as melhores práticas e as principais armadilhas do desenvolvimento de software...", cat1);
		Livro l3 = new Livro(null, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Quando bebê, Harry Potter fora deixado na porta de seus tios maternos Petúnia Dursley (irmã mais velha de Lillian) e Válter Dursley...", cat3);
		Livro l4 = new Livro(null, "Jogos Vorazes", "Suzanne Collins", "Quando Katniss Everdeen, de 16 anos, decide participar dos Jogos Vorazes para poupar a irmã mais nova, causando grande comoção no país, ela sabe que essa pode ser a sua sentença de morte...", cat2);
		Livro l5 = new Livro(null, "O Hobbit", "J.R.R. Tolkien", "Bilbo Bolseiro vive uma vida pacata no condado, como a maioria dos hobbits. Um dia, aparece em sua porta o mago Gandalf, o cinzento , que lhe promete uma aventura como nunca antes vista...", cat3);
		
		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l4));
		cat3.getLivros().addAll(Arrays.asList(l3,l5));
		cat4.getLivros().addAll(Arrays.asList());
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}

}
