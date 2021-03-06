package com.desuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable

public class ScorePk implements Serializable{
	private static final long serialVersionUID = 1L;


	@ManyToOne 
	//configuração da chave estrangeira
	@JoinColumn(name="movie_id")
	private Movie movie;
	
	@ManyToOne
	@JoinColumn(name= "user_id")	
	private User user;

	public ScorePk() { // constutor vazio
	}
	
	
// métodos acessores
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}