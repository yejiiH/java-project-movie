package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dto.Reservation;

public class ReservationDao {
	private DataSource dataSource;
	public ReservationDao() throws Exception{
		dataSource= new DataSource();
	}
/*
  * 예매번호 부여?
 */
	
public int insertReservationNo(String id) throws Exception{
		
		Connection con= dataSource.getConnection();
		PreparedStatement pstmt= con.prepareStatement(ReservationSQL.Reservation_INSERT);
		
		pstmt.setString(1, id);
		//pstmt.setString(4,Reservation.getPayment()); payment?
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
/*
 * 예매내역 확인2
 */
public Reservation selectByReNo(int reservation_no) throws Exception{
	
	Reservation findReservation=null;
	
	Connection con=dataSource.getConnection();
	PreparedStatement pstmt=con.prepareStatement(ReservationSQL.Reservation_SELECT_BY_RE_NO);
	pstmt.setInt(1, reservation_no);
	
	ResultSet rs = pstmt.executeQuery();
	/* payment 적용전
	if(rs.next()) {
		findReservation=new Reservation(rs.getInt("reservation_no"), 
				rs.getString("cus_id"),rs.getInt("payment_no"),
				rs.get000("payment")
				);
	
	}*/
	rs.close();
	pstmt.close();
	con.close();
	return findReservation;
}
		

	/*
	 * 예매 내역 확인
	 */
	
public List<Reservation> selectAll() throws Exception{
		
		List<Reservation> ReservationList=new ArrayList<Reservation>();
		Connection con= dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ReservationSQL.Reservation_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			ReservationList.add(new Reservation(rs.getInt("reservation_no"), 
					rs.getString("cus_id"),rs.getInt("payment_no")));
		}
		rs.close();
		pstmt.close();
		con.close();
		
		
		return ReservationList;
		
	}
	
/*
 * 예매내역 취소?
 */
public int deleteReservation(int reservation_no) throws Exception {
	
	Connection con=dataSource.getConnection();
	PreparedStatement pstmt=con.prepareStatement(ReservationSQL.Reservation_DELETE);
	pstmt.setInt(1, reservation_no);
	int rowCount=pstmt.executeUpdate();
	pstmt.close();
	con.close();
	return rowCount;
	
}
	
}