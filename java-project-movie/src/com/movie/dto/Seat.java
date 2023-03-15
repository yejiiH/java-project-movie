package com.movie.dto;

public class Seat {
	private int seat_no;
	private int seat_arrange;
	private int seat_valid;
	private String hall_name;
	private String cus_id;
	private Movie movie;

	public Seat() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Seat(int seat_no, int seat_arrange, int seat_valid, Movie movie) {
		super();
		this.seat_no = seat_no;
		this.seat_arrange = seat_arrange;
		this.seat_valid = seat_valid;
		this.movie = movie;
	}




	public Seat(int seat_no, int seat_arrange, int seat_valid, String hall_name, String cus_id, Movie movie) {
		super();
		this.seat_no = seat_no;
		this.seat_arrange = seat_arrange;
		this.seat_valid = seat_valid;
		this.hall_name = hall_name;
		this.cus_id = cus_id;
		this.movie = movie;
	}

	public int getSeat_no() {
		return seat_no;
	}

	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}

	public int getSeat_arrange() {
		return seat_arrange;
	}

	public void setSeat_arrange(int seat_arrange) {
		this.seat_arrange = seat_arrange;
	}

	public int getSeat_valid() {
		return seat_valid;
	}

	public void setSeat_valid(int seat_valid) {
		this.seat_valid = seat_valid;
	}

	public String getHall_name() {
		return hall_name;
	}

	public void setHall_name(String hall_name) {
		this.hall_name = hall_name;
	}

	public String getCus_id() {
		return cus_id;
	}

	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Seat [seat_no=" + seat_no + ", seat_arrange=" + seat_arrange + ", seat_valid=" + seat_valid
				+ ", hall_name=" + hall_name + ", cus_id=" + cus_id + ", movie=" + movie + "]";
	}
	
	
	
	
	
	
}