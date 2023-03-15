package com.movie.dto;

public class CardA {
	String card_name;
	public CardA() {
	};
	public CardA(String card_name) {
	this.card_name=card_name;
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public void insertinto(CardA cardInfo) {
		
	}
	@Override
	public String toString() {
		return "Card2 [card_name=" + card_name + "]";
	}
	
		
	}

	

	
