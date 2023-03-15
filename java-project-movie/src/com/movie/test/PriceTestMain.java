package com.movie.test;

import com.movie.dao.PriceInfoDao;
import com.movie.dto.PriceInfo;

public class PriceTestMain {

	public static void main(String[] args) throws Exception{
			
		PriceInfoDao priceInfoDao = new PriceInfoDao();
		System.out.println(priceInfoDao.priceSelectByNo("1회차"));
		
		
		
		
		}
}
