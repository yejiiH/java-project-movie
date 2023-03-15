package com.movie.service;

import java.util.List;

import com.movie.dao.MovieDao;
import com.movie.dto.Movie;

public class MovieService {

	private MovieDao movieDao;
	
	public MovieService() {
		movieDao = new MovieDao();
	}
	
	public Movie findBymoviehall(String hall_name) throws Exception {
		
		return movieDao.selectByHallName(hall_name);
	}
	
	public List<Movie> findAll() throws Exception{
		
		return movieDao.selectAll();
	}
	
	public int remainUpdate(String hall_name) throws Exception{
		return movieDao.remainSeatUpdate(hall_name);
	}
	
}
