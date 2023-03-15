package com.movie.test;
import java.util.List;

import com.movie.dao.ReservationDao;
import com.movie.dto.Reservation;


public class ReservationDaoTest {

	public static void main(String[] args) throws Exception {
		ReservationDao reservationDao=new ReservationDao();
		
			System.out.println("1.예매번호 부여");
			
			Reservation r=new Reservation(0,"yeji",0,null);
			//payment 적용 전 
			System.out.println(">> "+reservationDao.insertReservationNo("aa"));
			
			
			System.out.println("2.예매내역 확인");
			System.out.println(">>"+reservationDao.selectAll());
			
			System.out.println("3.예매내역 확인2(payment)");
			System.out.println(">>"+reservationDao.selectByReNo(0));
			
			System.out.println("4.예매내역 취소");
			System.out.println(">>"+reservationDao.deleteReservation(0));
		
		
			
		}
	

	}

