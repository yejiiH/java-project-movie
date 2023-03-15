package com.movie.우혁;

import com.movie.dao.PaymentDao;
import com.movie.dto.Payment;

public class PaymentService {
	private PaymentDao paymentDao;
	public PaymentService() {
		paymentDao=new PaymentDao();
	}
	/*
	public Payment findByNo(int p_no) throws Exception{
		return paymentDao.selectByNo(p_no);
	}
	
	public int deleteByNo(int p_no) throws Exception{
		return paymentDao.deleteByNo(p_no);
	}
	*/
	
	
	
}
