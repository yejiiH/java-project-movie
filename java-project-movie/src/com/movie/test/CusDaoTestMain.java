package com.movie.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.movie.dao.CusJoinDao;
import com.movie.dto.Customer;


public class CusDaoTestMain {

	public static void main(String[] args) throws Exception {
		CusJoinDao cusJoinDao = new CusJoinDao();
		
		String birth = "1994/07/19";
		Date aaa = new SimpleDateFormat("yyyy/MM/dd").parse(birth);
		
		Customer insertCus = new Customer( "huu22", 0, "알매", "알찬잉", "12345", aaa, "F", "010-0010-1234", "alc2han@naver.com", 2000, 1);
		System.out.println("insertCus :" + cusJoinDao.insertCus(insertCus));

		Customer updateCus = new Customer("huu22", 8, "인연이?", "김인연", "12345", aaa, "F", "010-7895-4532",
				"grape2@google.com", 3000, 1);
		System.out.println("updateCus : " + cusJoinDao.updateCus(updateCus));

		Customer updateCus2 = new Customer("hunjung", 7, null, "김최종", "7891", aaa, "M", "1022223333",
				"grape2@google.com", 3000, 1);
		System.out.println("updateCus2 : " + cusJoinDao.updateCus2(updateCus2));

		System.out.println("deleteCus :" + cusJoinDao.deleteById("huu22"));
		
		Customer findCus = cusJoinDao.selectById("hunjung");
		System.out.println("selectById : "+ findCus);
		
		
		String findId = cusJoinDao.selectByNamePhone("임현정", "1022223333");
		System.out.println("ID 찾기 : " + findId);
		
		String findPassword = cusJoinDao.selectByIdName("hunjung","임현정");
		System.out.println("PASSWORD 찾기 : " + findPassword);
		

	}

}
