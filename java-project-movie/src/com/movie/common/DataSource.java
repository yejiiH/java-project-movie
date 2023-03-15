package com.movie.common;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Connection을 생성하고, 해지하는 역할을하는 클래스
 */
public class DataSource {
	/***********************************************************/
	String driverClass="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
	String user="J2205JDEVELOPER#TEAM4";
	String password="J2205JDEVELOPER#TEAM4";
	/***********************************************************/
	
	/*
	 * Connection객체를 생성해서 반환하는 메쏘드
	 */
	public Connection getConnection() throws Exception{
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
	}
	
}
