package com.movie.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dto.Movie;
import com.movie.dto.Payment;
import com.movie.dto.Seat;

public class PaymentDao {
	private DataSource dataSource;

	public PaymentDao() {
		dataSource = new DataSource();
	}

	/*
	 * cus_id 로 예매취소
	 */
	public int deleteByCusId(String cus_id) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;

		try {
			con = dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(PaymentSQL.PAYMENT_DELETE_BY_CUSID);
			pstmt.setString(1, cus_id);
			rowCount = pstmt.executeUpdate();
			con.commit();
		} catch (Exception e1) {
			con.rollback();
			e1.printStackTrace();
		} finally {
			if (con != null)
				con.close();
		}
		return rowCount;
	}

	/*
	 * payment_no 로 예매취소
	 */
	public int deleteByPaymentNo(int payment_no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			con = dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(PaymentSQL.PAYMENT_DELETE_BY_PAYMENTNO);
			pstmt.setInt(1, payment_no);
			rowCount = pstmt.executeUpdate();
			con.commit();
		} catch (Exception e1) {
			con.rollback();
			e1.printStackTrace();
		} finally {
			if (con != null)
				con.close();
		}
		return rowCount;
	}

	public int insetReservation(Payment payment) throws Exception {
		Connection con = null;
		PreparedStatement pstmt1 = null;
		
		
			con = dataSource.getConnection();
			
			pstmt1 = con.prepareStatement(PaymentSQL.PAYMENT_INSERT2);
			pstmt1.setString(1, payment.getCard_name());
			pstmt1.setInt(2, payment.getAdult_member_count());
			pstmt1.setInt(3, payment.getChild_member_count());
			pstmt1.setString(4, payment.getCus_id());
			pstmt1.setInt(5, payment.getSeat_no());
			
			int rowCount = pstmt1.executeUpdate();
			pstmt1.close();
			con.close();
		return rowCount;
	}
	
	
	
	/*
	 * 주문생성
	 */
	public int createReservation(Payment payment) throws Exception {
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		try {
			con = dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt1 = con.prepareStatement(PaymentSQL.PAYMENT_INSERT);
			pstmt1.setString(1, payment.getCard_name());
			pstmt1.setInt(2, payment.getAdult_member_count());
			pstmt1.setInt(3, payment.getChild_member_count());
			pstmt1.setString(4, payment.getCus_id());

			pstmt2 = con.prepareStatement(PaymentSQL.PAYMENT_INSERT_BY_SEATNO);
			for (Seat seat : payment.getSeatList()) {
				pstmt2.setInt(1, seat.getSeat_arrange());
				pstmt2.setInt(2, seat.getSeat_valid());
				pstmt2.setString(3, seat.getHall_name());
				pstmt2.executeQuery();
			}
		} catch (Exception e1) {
			con.rollback();
			e1.printStackTrace();
		} finally {
			if (con != null)
				con.close();
		}

		return 0;
	}

	/*
	 * cus_id 로 예매내역 검색
	 */
	public ArrayList<Seat> list(String cus_id) throws Exception {
		ArrayList<Seat> seatList = new ArrayList<Seat>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(PaymentSQL.SELECT_BY_CUSID_ALL);
			pstmt.setString(1, cus_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				seatList.add(new Seat(rs.getInt("seat_no"), rs.getInt("seat_arrange"), rs.getInt("seat_valid"),
						rs.getString("hall_name"), rs.getString("cus_id"), null));
			}
		} finally {
			if (con != null) {
				con.close();
			}
		}

		return seatList;
	}

	public List<Payment> selectAllList() throws Exception {
		List<Payment> paymentList = new ArrayList<Payment>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.PAYMENT_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			paymentList.add(new Payment(rs.getInt("payment_no"), rs.getDate("payment_date"), rs.getString("card_name"),
					rs.getInt("adult_member_count"), rs.getInt("child_member_count"), rs.getNString("cus_id"), null));
		}
		rs.close();
		pstmt.close();
		con.close();
		return paymentList;

	}

	public List<Payment> selectAllByCusId(String cus_id) throws Exception{
		ArrayList<Payment> paymentList = new ArrayList<Payment>();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(PaymentSQL.SELECT_BY_CUSID);
		pstmt.setString(1, cus_id);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			paymentList.add(new Payment(rs.getInt("payment_no"), rs.getDate("payment_date"), rs.getString("card_name"),
					rs.getInt("adult_member_count"), rs.getInt("child_member_count"), rs.getNString("cus_id"), null));
		}
		rs.close();
		pstmt.close();
		con.close();
		return paymentList;

	}

	public Payment showDetails(String cus_id) throws Exception {
		Payment payment = new Payment();
		Movie movie = new Movie();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.SELECT_BY_CUSID_ALL);
		pstmt.setString(1, cus_id);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<Seat> aa = new ArrayList<Seat>(); 
		if(rs.next()) {
			int payment_no = rs.getInt("payment_no");
			Date payment_date = rs.getDate("payment_date");
			String card_name = rs.getString("card_name");
			String cusId = rs.getString("cus_id");
			int adult_price = rs.getInt("adult_price");
			int child_price = rs.getInt("child_price");
			int adult_member_count = rs.getInt("adult_member_count");
			int child_member_count = rs.getInt("child_member_count");
			int totalPrice = (adult_price*adult_member_count) + (child_price*child_member_count);
			
			
			payment = new Payment(payment_no, payment_date, card_name, adult_member_count, child_member_count, cusId, totalPrice, aa);
			System.out.print("예매번호 : " + payment_no + ", <p>결제일자 : " + payment_date + ", <p>카드 :" + card_name
					+ ", <p>성인 수 : " + adult_member_count + ", <p>청소년 수 :" + child_member_count
			+ ", <p>ID : " + cusId + "<p>좌석 : ");
			do {
				payment.getSeatList().add(new Seat(rs.getInt("seat_no"),
													rs.getInt("seat_arrange"),
													rs.getInt("seat_valid"),
																		new Movie(rs.getString("hall_name"),
																					rs.getString("m_name"),
																					rs.getString("m_start_time"),
																					rs.getString("m_end_time")
																					)));
				movie = new Movie(rs.getString("hall_name"),
						rs.getString("m_name"),
						rs.getString("m_start_time"),
						rs.getString("m_end_time"));
				System.out.print(rs.getInt("seat_no") + "번 ");
				
			}while(rs.next());
		
			System.out.println("<p>회차 : " + movie.getHallName() + "<p>영화이름 : " + movie.getM_Name() + "<p>시작시간" + movie.getM_Start_Time() + "<p>종료시간 : " + movie.getM_End_Time());
			
			
		}
		return payment;
	}
	
	public int selectByPrice(String cus_id) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.SELECT_PRICE_BY_CUSID);
		pstmt.setString(1, cus_id);
		ResultSet rs = pstmt.executeQuery();
		int total_price=0;
		if(rs.next()) {
			
			int adult_price = rs.getInt("adult_price");
			int child_price = rs.getInt("child_price");
			int adult_member_count = rs.getInt("adult_member_count");
			int child_member_count = rs.getInt("child_member_count");
			
			
			total_price = (adult_price*adult_member_count) + (child_price*child_member_count);
			
			
		}
		return total_price;
	}
	public int selectByCoupon(String id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.SELECT_PRICE_BY_CUSID);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		int total_price=0;
		int discount_total_price = 0;
		

		if (rs.next()) {

			int adult_price = rs.getInt("adult_price");
			int child_price = rs.getInt("child_price");
			int adult_member_count = rs.getInt("adult_member_count");
			int child_member_count = rs.getInt("child_member_count");
			
			
			total_price = (adult_price*adult_member_count) + (child_price*child_member_count);
			discount_total_price = total_price-(total_price/10);

		}
		return discount_total_price;
	}

}
