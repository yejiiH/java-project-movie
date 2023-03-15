package com.movie.성민;

import java.util.Date;

public class Cus {
	private int cus_no;
	private String cus_nickname;
	private String cus_name;
	private String cus_id;
	private String cus_password;
	private String cus_birthday;
	private String cus_gender;
	private String cus_phone;
	private String cus_email;
	private int cus_point;
	
	public Cus(int cus_no, String cus_nickname, String cus_name, String cus_id, String cus_password,
			String cus_birthday, String cus_gender, String cus_phone, String cus_eamil, int cus_point) {
		super();
		this.cus_no = cus_no;
		this.cus_nickname = cus_nickname;
		this.cus_name = cus_name;
		this.cus_id = cus_id;
		this.cus_password = cus_password;
		this.cus_birthday = cus_birthday;
		this.cus_gender = cus_gender;
		this.cus_phone = cus_phone;
		this.cus_email = cus_eamil;
		this.cus_point = cus_point;
	}
	public int getCus_no() {
		return cus_no;
	}
	public void setCus_no(int cus_no) {
		this.cus_no = cus_no;
	}
	public String getCus_nickname() {
		return cus_nickname;
	}
	public void setCus_nickname(String cus_nickname) {
		this.cus_nickname = cus_nickname;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public String getCus_id() {
		return cus_id;
	}
	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}
	public String getCus_password() {
		return cus_password;
	}
	public void setCus_password(String cus_password) {
		this.cus_password = cus_password;
	}
	public String getCus_birthday() {
		return cus_birthday;
	}
	public void setCus_birthday(String cus_birthday) {
		this.cus_birthday = cus_birthday;
	}
	public String getCus_gender() {
		return cus_gender;
	}
	public void setCus_gender(String cus_gender) {
		this.cus_gender = cus_gender;
	}
	public String getCus_phone() {
		return cus_phone;
	}
	public void setCus_phone(String cus_phone) {
		this.cus_phone = cus_phone;
	}
	public String getCus_email() {
		return cus_email;
	}
	public void setCus_email(String cus_eamil) {
		this.cus_email = cus_eamil;
	}
	public int getCus_point() {
		return cus_point;
	}
	public void setCus_point(int cus_point) {
		this.cus_point = cus_point;
	}
	@Override
	public String toString() {
		return "Cus [cus_no=" + cus_no + ", cus_nickname=" + cus_nickname + ", cus_name=" + cus_name + ", cus_id="
				+ cus_id + ", cus_password=" + cus_password + ", cus_birthday=" + cus_birthday + ", cus_gender="
				+ cus_gender + ", cus_phone=" + cus_phone + ", cus_email=" + cus_email + ", cus_point=" + cus_point
				+ "]";
	}
	
	
	
	
}