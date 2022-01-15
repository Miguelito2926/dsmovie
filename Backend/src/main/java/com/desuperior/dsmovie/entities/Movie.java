package com.desuperior.dsmovie.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name="tb_movie") //comando para criar a tabela com nome tb_movie

public class Movie { // classe do meu banco de dados
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // comando para colocar o auto incremento na tabela
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	// Coleção de scores
	@OneToMany(mappedBy = "id.movie")
	private Set<Score> scores = new HashSet<>();
	
	public Movie() { //contrutor vazio
		
	}

	// método construtor  com argumentos
	public Movie(Long id, String title, Double score, Integer count, String image) {
	
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	
	// métodos de acesso get e set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Score> getScores() {
		return scores;
	}
	
	
	

}
