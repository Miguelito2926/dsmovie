package com.desuperior.dsmovie.services;

//MovieServices

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desuperior.dsmovie.dto.MovieDTO;
import com.desuperior.dsmovie.dto.ScoreDTO;
import com.desuperior.dsmovie.entities.Movie;
import com.desuperior.dsmovie.entities.Score;
import com.desuperior.dsmovie.entities.User;
import com.desuperior.dsmovie.repositories.MovieRepository;
import com.desuperior.dsmovie.repositories.ScoreRepository;
import com.desuperior.dsmovie.repositories.UserRepository;

//annotacion
@Service
public class ScoreService {
	
	@Autowired 
	private MovieRepository movieRepository;
	
	@Autowired 
	private UserRepository userRepository;
	
	@Autowired 
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score ();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score = scoreRepository.saveAndFlush(score);
			
		double sum =0.0;
		for (Score s :movie.getScores()) {
			sum = sum + s.getValue();			
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		return new MovieDTO(movie);
	}
	
	
}
