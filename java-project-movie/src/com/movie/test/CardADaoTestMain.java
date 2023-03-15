package com.movie.test;

import com.movie.dao.CardADao;
import com.movie.dto.CardA;

public class CardADaoTestMain {

	public static void main(String[] args)throws Exception {
		CardADao cardADao=new CardADao();
		
		System.out.println("카드 선택");
		
		CardA findcardName=cardADao.selectCardName("국민");
		System.out.println(findcardName);
		
	} 

}
