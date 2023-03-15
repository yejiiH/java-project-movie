package com.movie.dto;

public class Movie {

	private String hall_name;
	private int total_Seat_Count;
	private int remain_Seat;
	private String m_Name;
	private String m_Genre;
	private int m_Positive_Age;
	private String m_Start_Time;
	private String m_End_Time;
	private String m_Image;
	private String m_Introduce;
	private int price_no;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Movie(String hall_name, String m_Name, String m_Start_Time, String m_End_Time) {
		super();
		this.hall_name = hall_name;
		this.m_Name = m_Name;
		this.m_Start_Time = m_Start_Time;
		this.m_End_Time = m_End_Time;
	}



	public Movie(String hallName, int totalSeatCount, int remainSeat, String m_Name, String m_Genre, int m_Positive_Age,
			String m_Start_Time, String m_End_Time, String m_Image, String m_Introduce, int price_no) {
		super();
		this.hall_name = hallName;
		this.total_Seat_Count = totalSeatCount;
		this.remain_Seat = remainSeat;
		this.m_Name = m_Name;
		this.m_Genre = m_Genre;
		this.m_Positive_Age = m_Positive_Age;
		this.m_Start_Time = m_Start_Time;
		this.m_End_Time = m_End_Time;
		this.m_Image = m_Image;
		this.m_Introduce = m_Introduce;
		this.price_no = price_no;
	}

	public String getHallName() {
		return hall_name;
	}

	public void setHallName(String hallName) {
		this.hall_name = hallName;
	}

	public int getTotalSeatCount() {
		return total_Seat_Count;
	}

	public void setTotalSeatCount(int totalSeatCount) {
		this.total_Seat_Count = totalSeatCount;
	}

	public int getRemainSeat() {
		return remain_Seat;
	}

	public void setRemainSeat(int remainSeat) {
		this.remain_Seat = remainSeat;
	}

	public String getM_Name() {
		return m_Name;
	}

	public void setM_Name(String m_Name) {
		this.m_Name = m_Name;
	}

	public String getM_Genre() {
		return m_Genre;
	}

	public void setM_Genre(String m_Genre) {
		this.m_Genre = m_Genre;
	}

	public int getM_Positive_Age() {
		return m_Positive_Age;
	}

	public void setM_Positive_Age(int m_Positive_Age) {
		this.m_Positive_Age = m_Positive_Age;
	}

	public String getM_Start_Time() {
		return m_Start_Time;
	}

	public void setM_Start_Time(String m_Start_Time) {
		this.m_Start_Time = m_Start_Time;
	}

	public String getM_End_Time() {
		return m_End_Time;
	}

	public void setM_End_Time(String m_End_Time) {
		this.m_End_Time = m_End_Time;
	}

	public String getM_Image() {
		return m_Image;
	}

	public void setM_Image(String m_Image) {
		this.m_Image = m_Image;
	}

	public String getM_Introduce() {
		return m_Introduce;
	}

	public void setM_Introduce(String m_Introduce) {
		this.m_Introduce = m_Introduce;
	}

	public int getPrice_no() {
		return price_no;
	}

	public void setPrice_no(int price_no) {
		this.price_no = price_no;
	}

	@Override
	public String toString() {
		return "Movie [hallName=" + hall_name + ", totalSeatCount=" + total_Seat_Count + ", remainSeat=" + remain_Seat
				+ ", m_Name=" + m_Name + ", m_Genre=" + m_Genre + ", m_Positive_Age=" + m_Positive_Age
				+ ", m_Start_Time=" + m_Start_Time + ", m_End_Time=" + m_End_Time + ", m_Image=" + m_Image
				+ ", m_Introduce=" + m_Introduce + ", price_no=" + price_no + "]";
	}
	
	

	
}
