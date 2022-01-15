package com.desuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desuperior.dsmovie.entities.Score;
import com.desuperior.dsmovie.entities.ScorePk;

//Repositorio  responsavel por buscar salvar, atualizar, deletar  os filmes na aplicação

public interface  ScoreRepository extends JpaRepository<Score, ScorePk> {	

}
