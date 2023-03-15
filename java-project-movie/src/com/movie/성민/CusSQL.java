package com.movie.성민;


public class CusSQL {
	public static final String CUS_INSERT = "insert into cus values(cus_no_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?,0,null)";
	public static final String CUS_UPDATE = "update cus set cus_nickname= ?, cus_password= ?, cus_phone= ?, cus_email = ? where cus_id = ?";
	public static final String CUS_DELETE = "delete cus where cus_id = ?";
	public static final String CUS_SELECT_BY_NO = "select * from cus where cus_no = ?";
	public static final String CUS_SELECT_ALL = "select * from customer_info";
}