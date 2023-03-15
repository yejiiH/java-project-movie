package com.movie.service;

import java.util.List;

import com.movie.dao.SeatDao;
import com.movie.dto.Seat;

public class SeatService {
	private SeatDao seatDao;

	public SeatService() {
		seatDao = new SeatDao();
	}

	/*
	 * 좌석예매
	 */
	public int seatReservation(String cus_id, String hall_name, int seat_arrange) throws Exception {
		return seatDao.update(cus_id, hall_name, seat_arrange);
	}

	/*
	 * 회차별 남은좌석수
	 */
	public int findRemain(String hall_name) throws Exception {
		return seatDao.remainResultSelectCount(hall_name);
	}
	
	/*
	 * 아이디로 예매내역검색
	 */
	public List<Seat> findAll(String cus_id) throws Exception {
		return seatDao.selectById(cus_id);
	}
	
	public List<Seat> findAllByhallName(String hall_name) throws Exception{
		return seatDao.selectAll(hall_name);
	}
	
	public int updateSeat(String cus_id, String hall_name, int seat_arrange) throws Exception{
		return seatDao.update(cus_id, hall_name, seat_arrange);
	}
	
	public int findAllint(String hall_name) throws Exception{
		return seatDao.selectAllint(hall_name);
	}
	
	
}
