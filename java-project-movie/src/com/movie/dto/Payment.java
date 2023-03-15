package com.movie.dto;

import java.sql.Date;
import java.util.ArrayList;

public class Payment {
	
	private int payment_no;
	private Date payment_date;
	private String card_name;
	private int adult_member_count;
	private int child_member_count;
	private String cus_id;
	private ArrayList<Seat> seatList = new ArrayList<Seat>();
	private int seat_no;
	private int totalPrice;

	public Payment() {
		// TODO Auto-generated constructor stub
	}
//select용
	public Payment(int payment_no, Date payment_date, String card_name, int adult_member_count, int child_member_count,
			String cus_id, int totalPrice, ArrayList<Seat> seatList) {
		super();
		this.payment_no = payment_no;
		this.payment_date = payment_date;
		this.card_name = card_name;
		this.adult_member_count = adult_member_count;
		this.child_member_count = child_member_count;
		this.cus_id = cus_id;
		this.totalPrice = totalPrice;
		this.seatList = seatList;
	}

	
	
	
	
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public Payment(String card_name, int adult_member_count, int child_member_count, String cus_id, int seat_no) {
		super();
		this.card_name = card_name;
		this.adult_member_count = adult_member_count;
		this.child_member_count = child_member_count;
		this.cus_id = cus_id;
		this.seat_no = seat_no;
	}
	//insert용
	public Payment(int payment_no, Date payment_date, String card_name, int adult_member_count, int child_member_count,
			String cus_id, ArrayList<Seat> seatList) {
		super();
		this.payment_no = payment_no;
		this.payment_date = payment_date;
		this.card_name = card_name;
		this.adult_member_count = adult_member_count;
		this.child_member_count = child_member_count;
		this.cus_id = cus_id;
		this.seatList = seatList;
		
	}

	public int getPayment_no() {
		return payment_no;
	}

	public void setPayment_no(int payment_no) {
		this.payment_no = payment_no;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	public String getCard_name() {
		return card_name;
	}

	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}

	public int getAdult_member_count() {
		return adult_member_count;
	}

	public void setAdult_member_count(int adult_member_count) {
		this.adult_member_count = adult_member_count;
	}

	public int getChild_member_count() {
		return child_member_count;
	}

	public void setChild_member_count(int child_member_count) {
		this.child_member_count = child_member_count;
	}

	public String getCus_id() {
		return cus_id;
	}

	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}

	public ArrayList<Seat> getSeatList() {
		return seatList;
	}

	public void setSeatList(ArrayList<Seat> seatList) {
		this.seatList = seatList;
	}

	@Override
	public String toString() {
		return "Payment [payment_no=" + payment_no + ", payment_date=" + payment_date + ", card_name=" + card_name
				+ ", adult_member_count=" + adult_member_count + ", child_member_count=" + child_member_count
				+ ", cus_id=" + cus_id + ", seatList=" + seatList + "]";
	}
	


}
