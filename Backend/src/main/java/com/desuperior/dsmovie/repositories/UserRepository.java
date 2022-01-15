package com.desuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desuperior.dsmovie.entities.User;


//Repositorio  responsavel por buscar salvar, atualizar, deletar  os filmes na aplicação

public interface  UserRepository extends JpaRepository<User, Long> {	
	
	
	User findByEmail(String email);
}
