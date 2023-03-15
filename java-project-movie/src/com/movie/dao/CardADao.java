package com.movie.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.movie.common.DataSource;
import com.movie.dto.CardA;
import com.movie.dto.CardInfo;


public class CardADao {
	private DataSource dataSource;
	public CardADao() {
		dataSource= new DataSource();
	}
	/*
public int insertCardName(String card_name) throws Exception{
		
		Connection con= dataSource.getConnection();
		PreparedStatement pstmt= con.prepareStatement(CardASQL.Card2_INSERT);
		
		pstmt.setString(1,card_name);
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	*/

public CardA selectCardName(String card_name) throws Exception {
	CardA findCardName = null;

	Connection con = dataSource.getConnection();
	PreparedStatement pstmt = con.prepareStatement(CardASQL.Card2_SELECT_NAME);
	
	pstmt.setString(1, card_name);
	
	ResultSet rs = pstmt.executeQuery();
	if (rs.next()) {
		findCardName = new CardA(rs.getString("Card_name"));
	}
	rs.close();
	pstmt.close();
	con.close();
	return findCardName;
}

}
