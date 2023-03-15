package com.movie.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.movie.common.DataSource;
import com.movie.dto.PriceInfo;



public class PriceInfoDao {
	private DataSource dataSource;
	public PriceInfoDao() {
	dataSource = new DataSource();
	}
	
	
	public PriceInfo priceSelectByNo(String hall_name) throws Exception{
		PriceInfo priceinfo = null;
		String sql="select * from price_Info p join movie_hall m on p.price_no = m.price_no where hall_name = ?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, hall_name);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			priceinfo = new PriceInfo(rs.getInt("price_no"), rs.getInt("adult_price"), rs.getInt("child_price"));
			
			
		}
		rs.close();
		con.close();
		return priceinfo;
}
}
