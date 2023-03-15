package com.movie.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dao.MovieDao;
import com.movie.dao.PaymentDao;
import com.movie.dao.PaymentSQL;
import com.movie.dao.ReservationSQL;
import com.movie.dao.SeatDao;
import com.movie.dao.SeatSQL;
import com.movie.dto.Movie;
import com.movie.dto.Payment;
import com.movie.dto.Seat;

public class PaymentService {
	
	private PaymentDao paymentDao;
	private MovieDao movieDao;
	private SeatDao seatDao;
	
	public PaymentService() {
		paymentDao = new PaymentDao();
		movieDao = new MovieDao();
		seatDao = new SeatDao();
		
	}
	
	/*
	 * 예약전체삭제
	 */
	public int deletebyCusId(String cus_id) throws Exception {
		return paymentDao.deleteByCusId(cus_id);
	}
	/*
	 * 예약 1건삭제
	 */
	public int deleteByPaymentNo(int payment_no) throws Exception {
		return paymentDao.deleteByPaymentNo(payment_no);
		
	}
	
	/*
	 * 선택영화 주문목록
	 */
	public ArrayList<Seat> list(String cus_id) throws Exception{
		return paymentDao.list(cus_id);
	}
	/*
	 * cus_id로 모든 예매내역 확인
	 */
	public List<Payment> selectByCusId(String cus_id) throws Exception {
		return paymentDao.selectAllByCusId(cus_id);
	}
	/*
	 * 모든 회원 예매내역 확인
	 */
	public List<Payment> selectAll() throws Exception{
		return paymentDao.selectAllList();
	}
	/*
	 * cus_id로 예매한 영화내역 확인
	 */
	public Payment detail(String cus_id) throws Exception {
		return paymentDao.showDetails(cus_id);
	}
		
	public int selectPriceByCusID(String cus_id) throws Exception {
		return paymentDao.selectByPrice(cus_id);
	}

	public int selectCouponByCusID(String cus_id) throws Exception {
		return paymentDao.selectByCoupon(cus_id);
	}
		
		


	public int insertPayment(String selectedItem, int parseInt, int parseInt2, String cus_id, int i)throws Exception {
		Payment payment = new Payment(selectedItem, parseInt, parseInt2,cus_id, i);
		return paymentDao.insetReservation(payment);
		
	}
		
		
		
		
		
	
}
