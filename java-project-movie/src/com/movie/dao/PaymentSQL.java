package com.movie.dao;

public class PaymentSQL {

	
//	public final static String PAYMENT_INSERT
//	="insert into payment values(payment_no_seq.nextval,SYSDATE,?,?,?,?)";
//	public final static String PAYMENT_SELECT_ALL
//	="select * from payment";
//	public final static String PAYMENT_SELECT_BY_NO
//	="select * from payment where payment_no=?";
//	public final static String PAYMENT_DELETE
//	="delete from payment where payment_no=?";
	
	public final static String PAYMENT_DELETE_BY_CUSID = 
	"delete FROM payment WHERE cus_id=?";

	public final static String PAYMENT_DELETE_BY_PAYMENTNO =
	 "DELETE FROM payment WHERE payment_no=?";

	public final static String PAYMENT_INSERT =
	"INSERT INTO payment(payment_no, payment_date, card_name, adult_member_count, child_member_count, cus_id) VALUES (payment_no_SEQ.nextval, sysdate, ?, ?, ?, ?)";
	
	public final static String PAYMENT_INSERT2 =
			"INSERT INTO payment(payment_no, card_name, adult_member_count, child_member_count, cus_id, seat_no) VALUES (payment_no_SEQ.nextval, ?, ?, ?, ?, ?)";
	

	public final static String PAYMENT_INSERT_BY_SEATNO =
	"INSERT INTO seat(seat_no, seat_arrange, seat_valid, hall_name) VALUES (SEAT_NO_SEQ.nextval, ?, ?, ?)";

	public final static String SELECT_BY_CUSID =
	"SELECT * FROM payment WHERE cus_id=?";

	public final static String PAYMENT_SELECT_ALL =
			"SELECT * FROM payment";

	public final static String SELECT_BY_MOVIEHALL =
	"SELECT * FROM payment p join seat s on p.seat_no = s.seat_no join movie_hall m on s.hall_name = m.hall_name where m.hall_name = ?";

	public final static String SELECT_BY_CUSID_ALL =
	"select * from payment p join seat s on p.seat_no = s.seat_no join movie_hall m on s.hall_name = m.hall_name join price_info price on price.price_no = m.price_no where p.cus_id = ?";
	
	public final static String SELECT_PRICE_BY_CUSID = 
	"SELECT p.payment_no, p.payment_date, p.card_name, m.m_name, p.cus_id, m.hall_name, s.seat_no, s.seat_arrange, s.seat_valid, m.m_start_time, m.m_end_time, pi.adult_price, p.adult_member_count, pi.child_price, p.child_member_count, p.card_name, sysdate FROM payment p join seat s on p.seat_no = s.seat_no join movie_hall m on s.hall_name = m.hall_name join price_info pi on m.price_no = pi.price_no where p.cus_id = ?";

	
}
