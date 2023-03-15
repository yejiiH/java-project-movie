package com.movie.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import com.movie.dto.CardInfo;

public class CardInfoDao {
String card_name;
DataSource ds;
public CardInfo SelectCardInfo(String Card_name) throws Exception{
	Connection conn= ds.getConnection();
	String sql="select * from card_info where card_name=?";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rs=pstmt.executeQuery();
	if(rs.next()) {
		CardInfo cardinfo=new CardInfo();
		cardinfo.setCard_name(rs.getString(1));
	}
	return null;

	}

}
