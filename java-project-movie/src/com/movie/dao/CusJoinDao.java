package com.movie.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.movie.common.DataSource;
import com.movie.dto.Customer;


public class CusJoinDao {

	private DataSource dataSource;

	public CusJoinDao() {
		dataSource = new DataSource();
	}

	public int insertCus(Customer cusDto) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_INSERT);

		pstmt.setString(1, cusDto.getCus_id());
		pstmt.setString(2, cusDto.getCus_nickname());
		pstmt.setString(3, cusDto.getCus_name());
		pstmt.setString(4, cusDto.getCus_password());
		pstmt.setDate(5, new java.sql.Date(cusDto.getCus_birthday().getTime()));
		pstmt.setString(6, cusDto.getCus_gender());
		pstmt.setString(7, cusDto.getCus_phone());
		pstmt.setString(8, cusDto.getCus_email());
		pstmt.setInt(9, cusDto.getCus_point());
		pstmt.setInt(10, cusDto.getCoupon_no());

		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();

		return rowCount;
	}

	public int updateCus(Customer cusDto) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_UPDATE);

		pstmt.setInt(1, cusDto.getCus_no());
		pstmt.setString(2, cusDto.getCus_nickname());
		pstmt.setString(3, cusDto.getCus_name());
		pstmt.setString(4, cusDto.getCus_password());
		pstmt.setDate(5, new java.sql.Date(cusDto.getCus_birthday().getTime()));
		pstmt.setString(6, cusDto.getCus_gender());
		pstmt.setString(7, cusDto.getCus_phone());
		pstmt.setString(8, cusDto.getCus_email());
		pstmt.setInt(9, cusDto.getCus_point());
		pstmt.setInt(10, cusDto.getCoupon_no());
		pstmt.setString(11, cusDto.getCus_id());
		pstmt.setString(12, cusDto.getCus_password());

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;

	}

	public int updateCus2(Customer cusDto) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_UPDATE2);

		pstmt.setString(1, cusDto.getCus_nickname());
		pstmt.setString(2, cusDto.getCus_password());
		pstmt.setDate(3, new java.sql.Date(cusDto.getCus_birthday().getTime()));
		pstmt.setString(4, cusDto.getCus_gender());
		pstmt.setString(5, cusDto.getCus_phone());
		pstmt.setString(6, cusDto.getCus_email());
		pstmt.setString(7, cusDto.getCus_id());

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;

	}

	public int deleteById(String cus_id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_DELETE);

		pstmt.setString(1, cus_id);

		int deleteRowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return deleteRowCount;
	}

	public Customer selectById(String cus_id) throws Exception {

		Customer findCus = null;

		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_SELECT_BY_ID);

		pstmt.setString(1, cus_id);

		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			findCus = new Customer(rs.getString("cus_id"), rs.getInt("cus_no"), rs.getString("cus_nickname"), rs.getString("cus_name"),
					rs.getString("cus_password"), rs.getDate("cus_birthday"),
					rs.getString("cus_gender"), rs.getString("cus_phone"), rs.getString("cus_email"),
					rs.getInt("cus_point"), rs.getInt("coupon_no"));
		}

		rs.close();
		pstmt.close();
		con.close();

		return findCus;
	}

	public String selectByNamePhone(String cus_name, String cus_phone) throws Exception {

		String findId = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_SELECT_BY_NAME_PHONE);

		pstmt.setString(1, cus_name);
		pstmt.setString(2, cus_phone);

		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			findId = rs.getString("cus_id");
		}

		rs.close();
		pstmt.close();
		con.close();

		return findId;

	}
	
	public String selectByIdName(String cus_id, String cus_name) throws Exception {

		String findPassword = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_SELECT_BY_ID_NAME);

		pstmt.setString(1, cus_id);
		pstmt.setString(2, cus_name);

		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			findPassword = rs.getString("cus_password");
		}

		rs.close();
		pstmt.close();
		con.close();

		return findPassword;

	}
	
	
	public ArrayList<Customer> selectAll() throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CusSQL.CUS_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		ArrayList<Customer> CusList=new ArrayList<Customer>();
		while(rs.next()) {
			CusList.add(new Customer(rs.getString("cus_id"), rs.getInt("cus_no"), 
					rs.getString("cus_nickname"), rs.getString("cus_name"),
					rs.getString("cus_password"), rs.getDate("cus_birthday"),
					rs.getString("cus_gender"), rs.getString("cus_phone"), rs.getString("cus_email"),
					rs.getInt("cus_point"), rs.getInt("coupon_no"))
					);
		}
		return CusList;
		
	}

}
