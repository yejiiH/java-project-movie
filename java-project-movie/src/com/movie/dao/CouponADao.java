package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.movie.common.DataSource;
import com.movie.dto.CouponA;
import com.movie.dto.Payment;

public class CouponADao {
	private DataSource dataSource;
	public CouponADao() {
		dataSource = new DataSource();
	}
	
	public CouponA selectCoupon(int coupon_no) throws Exception {
		CouponA findCoupon = null;

		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CouponASQL.CouponA_SELECT_NO);
		
		pstmt.setInt(1,coupon_no);
				
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			findCoupon = new CouponA(rs.getInt("coupon_no"),rs.getString("coupon_name"),rs.getInt("coupon_effect"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findCoupon;
	}
	
	
	
/*
public int insertCouponNo(int coupon_no, String coupon_name,int coupon_effect) throws Exception{
		
		Connection con= dataSource.getConnection();
		PreparedStatement pstmt= con.prepareStatement(CouponASQL.CouponA_INSERT);
		
		pstmt.setInt(1,coupon_no);
		pstmt.setString(2,coupon_name);
		pstmt.setInt(3,coupon_effect);
		
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	*/
/*
public CouponA select(int coupon_no, String coupon_name,int coupon_effect) throws Exception {
	CouponA findCouponNo = null;

	Connection con = dataSource.getConnection();
	PreparedStatement pstmt = con.prepareStatement();
	pstmt.setInt(1, coupon_no);
	pstmt.setString(2,coupon_name);
	pstmt.setInt(3,coupon_effect);
	
	ResultSet rs = pstmt.executeQuery();
	if (rs.next()) {
		findCouponNo = new CouponA(rs.getInt("coupon_no"),rs.getString("coupon_name"),rs.getInt("coupon_effect"));
	}
	rs.close();
	pstmt.close();
	con.close();
	return findCouponNo;
}
	*/
	
	
}
