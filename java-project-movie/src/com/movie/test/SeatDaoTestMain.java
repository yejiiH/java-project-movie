package com.movie.test;

import com.movie.dao.SeatDao;
import com.movie.service.SeatService;

public class SeatDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		SeatDao seatDao = new SeatDao();
		
		System.out.println("1.update좌석예매");
		int rowCount=seatDao.update("jeonghun","1회차",5);
		System.out.println(">> "+rowCount);
		
		System.out.println("2.회차당 남은좌석 출력");
		rowCount=seatDao.remainResultSelect("3회차");
		System.out.println(">> "+rowCount);
		
		System.out.println("3.아이디로 예매좌석 호출");
		System.out.println(seatDao.selectById("jeonghun"));

		System.out.println("4.전체좌석 출력");
		System.out.println(">> "+seatDao.selectAll("2회차"));
		
		SeatService seatService = new SeatService();
		System.out.println(seatService.findAllByhallName("1회차"));
		
		System.out.println("ㅁㅁ" + seatService.updateSeat("123", "4회차", 38));
}
}
