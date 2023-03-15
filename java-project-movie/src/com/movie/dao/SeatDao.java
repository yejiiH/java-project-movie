package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dto.Seat;

public class SeatDao {
	private DataSource dataSource;

	public SeatDao() {
		dataSource = new DataSource();
	}


	public int update(String cus_id, String hall_name, int seat_arrange) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_UPDATE);
		pstmt.setString(1, cus_id);
		pstmt.setString(2, hall_name );
		pstmt.setInt(3, seat_arrange);

		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();

		return rowCount;
	}

//	public int remainUpdate(String hall_name) throws Exception {
//		Connection con = dataSource.getConnection();
//		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_UPDATE2);
//		pstmt.setString(1, hall_name);
//		pstmt.setString(2, hall_name);
//	
//		int remainCount = pstmt.executeUpdate();
//		
//		
//		pstmt.close();
//		con.close();
//
//		return remainCount;
//		
//		
//	}
	
	public int remainResultSelect(String hall_name) throws Exception {
		int count =0;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.MOVIE_HALL_SEAT);
		pstmt.setString(1, hall_name);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			count = rs.getInt("remain_seat");
		}
		
		return count;
	}

	public int remainResultSelectCount(String hall_name) throws Exception {
		int count =0;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.MOVIE_HALL_SEAT);
		pstmt.setString(1, hall_name);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			count = rs.getInt("remain_seat");
		}
		
		return count;
		
	}
	
		
	
	public List<Seat> selectById(String cus_id) throws Exception {
		ArrayList<Seat> findList = new ArrayList<Seat>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_SELECT_BY_ID);
		pstmt.setString(1, cus_id );
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			findList.add(new Seat(rs.getInt("seat_no"), 
							  rs.getInt("seat_arrange"),
							  rs.getInt("seat_valid"),
							  rs.getString("hall_name"),
							  rs.getString("cus_id"),
							  null));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findList;

	
	}

	public List<Seat> selectAll(String hall_name) throws Exception {
		ArrayList<Seat> allList = new ArrayList<Seat>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_SELECT_ALL);
		pstmt.setString(1, hall_name);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			allList.add(new Seat(rs.getInt("seat_no"), 
							  rs.getInt("seat_arrange"),
							  rs.getInt("seat_valid"),
							  rs.getString("hall_name"),
							  rs.getString("cus_id"),
							  null));
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return allList;
		
	}
	
	
	
	public int selectAllint(String hall_name) throws Exception {
		ArrayList<Seat> allList = new ArrayList<Seat>();
		int a = 0;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_SELECT_ALL);
		pstmt.setString(1, hall_name);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			allList.add(new Seat(rs.getInt("seat_no"), 
							  rs.getInt("seat_arrange"),
							  rs.getInt("seat_valid"),
							  rs.getString("hall_name"),
							  rs.getString("cus_id"),
							  null));
			a = rs.getInt("seat_valid");
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return a;
		
	}


	}

