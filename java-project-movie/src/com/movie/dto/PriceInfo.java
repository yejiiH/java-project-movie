package com.movie.dto;


public class PriceInfo {
	private int price_no;
	private int adult_price;
	private int child_price;
	public PriceInfo(int price_no, int adult_price, int child_price) {
		super();
		this.price_no = price_no;
		this.adult_price = adult_price;
		this.child_price = child_price;
	}
	public int getPrice_no() {
		return price_no;
	}
	public void setPrice_no(int price_no) {
		this.price_no = price_no;
	}
	public int getAdult_price() {
		return adult_price;
	}
	public void setAdult_price(int adult_price) {
		this.adult_price = adult_price;
	}
	public int getChild_price() {
		return child_price;
	}
	public void setChild_price(int child_price) {
		this.child_price = child_price;
	}
	@Override
	public String toString() {
		return "PriceInfo [price_no=" + price_no + ", adult_price=" + adult_price + ", child_price=" + child_price
				+ "]";
	}

	
	
	
}