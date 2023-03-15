package com.movie.dao;
/*
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dto.Movie;

public class MovieDao {
	private DataSource dataSource;

	public MovieDao() {
		dataSource = new DataSource();
	}

	public Movie selectByHallName(String hall_name) throws Exception {
		Movie findHallName = null;

		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MovieSQL.MOIVE_SELECT_BY_HALL_NAME);
		pstmt.setString(1, hall_name);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			findHallName = new Movie(rs.getString("hall_name"), rs.getInt("total_seat_count"), rs.getInt("remain_seat"),
					rs.getString("m_name"), rs.getString("m_genre"), rs.getInt("m_positive_age"),
					rs.getString("m_start_time"), rs.getString("m_end_time"), rs.getString("m_image"),
					rs.getString("m_introduce"), rs.getInt("price_no"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findHallName;
	}

	public List<Movie> selectAll() throws Exception {

		ArrayList<Movie> movieList = new ArrayList<Movie>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MovieSQL.MOIVE_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			movieList.add(new Movie(rs.getString("hall_name"), rs.getInt("total_seat_count"), rs.getInt("remain_seat"),
					rs.getString("m_name"), rs.getString("m_genre"), rs.getInt("m_positive_age"),
					rs.getString("m_start_time"), rs.getString("m_end_time"), rs.getString("m_image"),
					rs.getString("m_introduce"), rs.getInt("price_no")));
			
		}
		return movieList;
	}

	public int remainSeatUpdate(String hall_name) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement("update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = ?) where hall_name = ?");
		pstmt.setString(1, hall_name);
		pstmt.setString(2, hall_name);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	
	
}
