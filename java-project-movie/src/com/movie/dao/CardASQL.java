package com.movie.dao;

public class CardASQL {
	
	public static final String Card2_SELECT_NAME
	="select card_name from credit_card where card_name=?";
	
	public static final String Card2_INSERT
	="insert into credit_card(card_name) values(?)";

}
