package com.desuperior.dsmovie.dto;

import com.desuperior.dsmovie.entities.Movie;
//MOVIE DTO CLASS DE CAMADA  DE CONTROLE DA APLICAÇÃO
public class MovieDTO {
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	public MovieDTO () { //contrutor  vazio
		
	}
	
	

	//Construtor com argumentos
	public MovieDTO(Long id, String title, Double score, Integer count, String image) {
		
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	
	//Metodo Construtor para copiar dados do objeto movie
	public MovieDTO(Movie movie) {
		
		id = movie.getId();
		title = movie.getTitle();
		score = movie.getScore();
		count = movie.getCount();
		image = movie.getImage();
	}


//métodos acessores
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
	

	
}
