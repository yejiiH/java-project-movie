package com.movie.예지;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.movie.common.DataSource;

public class Coupon {
	DataSource dataSource = new DataSource();
	String sql = "SELECT p.payment_no, p.payment_date, p.card_name, m.m_name, p.cus_id, m.hall_name, s.seat_no, s.seat_arrange, s.seat_valid, m.m_start_time, m.m_end_time, pi.adult_price, p.adult_member_count, pi.child_price, p.child_member_count, p.card_name, sysdate FROM payment p join seat s on p.seat_no = s.seat_no join movie_hall m on s.hall_name = m.hall_name join price_info pi on m.price_no = pi.price_no where p.cus_id = ?";

	public int selectByCoupon(String id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		int discount_total_price = 0;
		

		if (rs.next()) {

			int adult_price = rs.getInt("adult_price");
			int child_price = rs.getInt("child_price");
			int adult_member_count = rs.getInt("adult_member_count");
			int child_member_count = rs.getInt("child_member_count");

			discount_total_price = ((adult_price * adult_member_count) + (child_price * child_member_count))/rs.getInt("coupon_effect");

		}
		return discount_total_price;
	}
}
