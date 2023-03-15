package com.movie.성민;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.movie.common.DataSource;

public class CusDao {
	DataSource dataSource = new DataSource();
	
	public CusDao() {
		dataSource = new DataSource();
	}
	
	public int insert(Cus cus) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_INSERT);
		pstmt.setString(1, cus.getCus_nickname());
		pstmt.setString(2, cus.getCus_name());
		pstmt.setString(3, cus.getCus_id());
		pstmt.setString(4, cus.getCus_password());
		Date birth = new SimpleDateFormat("yyyy/MM/dd").parse(cus.getCus_birthday());
		pstmt.setDate(5, new java.sql.Date(birth.getTime()));
		pstmt.setString(6, cus.getCus_gender());
		pstmt.setString(7, cus.getCus_phone());
		pstmt.setString(8, cus.getCus_email());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		
		return rowCount;
	}
	
	public int update(Cus cus) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_UPDATE);
		pstmt.setString(5, cus.getCus_id());
		pstmt.setString(1, cus.getCus_nickname());
		pstmt.setString(2, cus.getCus_password());
		pstmt.setString(3, cus.getCus_phone());
		pstmt.setString(4, cus.getCus_email());
		int rowCount = pstmt.executeUpdate();
		
		
		pstmt.close();
		con.close();
		
		return rowCount;
	}
	
	public int delete(String id) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_DELETE);
		pstmt.setString(1, id);
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		return rowCount;
	}
	
	public Cus selectByNo(int cus_no) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_SELECT_BY_NO);
		pstmt.setInt(1, cus_no);
		ResultSet rs = pstmt.executeQuery();
		Cus cus = null;
		if(rs.next()) {
				cus = new Cus(rs.getInt("cus_no"),
							  rs.getString("cus_nickname"),
							  rs.getString("cus_name"),
							  rs.getString("cus_id"),
							  rs.getString("cus_password"),
							  rs.getString("cus_birthday"),
							  rs.getString("cus_gender"),
							  rs.getString("cus_phone"),
							  rs.getString("cus_email"),
							  rs.getInt("cus_point")
							  );
		}
		rs.close();
		pstmt.close();
		con.close();
		return cus;
	}
	
	public List<Cus> selectAll() throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CusSQL.CUS_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<Cus> cus = new ArrayList<Cus>();
		while(rs.next()) {
		  cus.add(new Cus(rs.getInt("cus_no"),
						  rs.getString("cus_nickname"),
						  rs.getString("cus_name"),
						  rs.getString("cus_id"),
						  rs.getString("cus_password"),
						  rs.getString("cus_birthday"),
						  rs.getString("cus_gender"),
						  rs.getString("cus_phone"),
						  rs.getString("cus_email"),
						  rs.getInt("cus_point")));
				
				
		}
		rs.close();
		pstmt.close();
		con.close();
		return cus;
	}
	
}