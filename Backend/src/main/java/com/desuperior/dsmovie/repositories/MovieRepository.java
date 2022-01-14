package com.desuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desuperior.dsmovie.entities.Movie;

//Repositorio  responsavel por buscar salvar, atualizar, deletar  os filmes na aplicação

public interface  MovieRepository extends JpaRepository<Movie, Long> {	

}
