package com.desuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name="tb_score") //comando para criar a tabela com nome tb_score

public class Score {
	@EmbeddedId
	private ScorePk id = new ScorePk();
	private Double value;

	
	public Score() {
	}
	
	public void setMovie(Movie movie) { // método de associação de filma com score 
		id.setMovie(movie);
	}

	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePk getId() {
		return id;
	}


	public void setId(ScorePk id) {
		this.id = id;
	}


	public Double getValue() {
		return value;
	}


	public void setValue(Double value) {
		this.value = value;
	}
	
	
	
	
}
