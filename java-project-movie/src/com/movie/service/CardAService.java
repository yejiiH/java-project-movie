package com.movie.service;

import com.movie.dao.CardADao;
import com.movie.dto.CardA;


public class CardAService {
	private CardADao cardAdao;
	
	public CardAService(){
		cardAdao =new CardADao();
	}
	//카드사 선택?
	public CardA selectCardName(String card_name)throws Exception{
		return cardAdao.selectCardName(card_name);
	}
}
