package com.movie.test;

import java.util.List;

import com.movie.성민.Cus;
import com.movie.성민.CusDao;

public class MovieDaoTestMain {

	public static void main(String[] args) throws Exception{
		CusDao movie = new CusDao();
		List<Cus> cusa = movie.selectAll();
		for (Cus cus : cusa) {
			System.out.println(cus);
			
		}
	
	}

}