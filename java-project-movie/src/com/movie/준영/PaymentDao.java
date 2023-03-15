package com.movie.준영;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dto.Payment;


public class PaymentDao {
	private DataSource dataSource;

	public PaymentDao() {
		dataSource = new DataSource();
	}
	/*
	public int insertPayment(Payment payment) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.PAYMENT_INSERT);
		
		pstmt.setInt(1, payment.getCoupon_no());
		pstmt.setString(2, payment.getCard_name());
		pstmt.setInt(3, payment.getAdult_member_count());
		pstmt.setInt(4, payment.getChild_member_count());
		
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rowCount;
	}
	
	public List<Payment> selectAll() throws Exception{
		List<Payment> PaymentList=new ArrayList<Payment>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.PAYMENT_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			PaymentList.add(new Payment(rs.getInt("payment_no"), rs.getString("payment_date"),
					rs.getInt("coupon_no"), rs.getString("card_name"), rs.getInt("adult_member_count"),
					rs.getInt("child_member_count")));
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
		return PaymentList;
	}
	

	public Payment selectByNo(int no) throws Exception{
		Payment findPaymentNo=null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.PAYMENT_SELECT_BY_NO);
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			findPaymentNo = new Payment(rs.getInt("payment_no"), rs.getString("payment_date"),
					rs.getInt("coupon_no"), rs.getString("card_name"), rs.getInt("adult_member_count"),
					rs.getInt("child_member_count"));
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return findPaymentNo;
	}
	
	public int deleteByNo(int no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.PAYMENT_DELETE);
		
		pstmt.setInt(1, no);
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rowCount;
	}
	*/
}
