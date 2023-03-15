package com.movie.test;

import com.movie.dao.MovieDao;

public class MovieTestMain {

	public static void main(String[] args) throws Exception {

		MovieDao movie = new MovieDao();
		System.out.println("1. hall_name select");
		System.out.println(">> "+movie.selectByHallName("2회차"));
		
		System.out.println("2. hall_name selectAll");
		System.out.println(">> "+movie.selectAll());
	
	}

}
