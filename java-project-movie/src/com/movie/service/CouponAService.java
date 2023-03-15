package com.movie.service;

import com.movie.dao.CouponADao;
import com.movie.dto.CouponA;


public class CouponAService {
	private CouponADao couponAdao;
	
	public CouponAService(){
		couponAdao =new CouponADao();
	}
	//쿠폰 선택?
	public CouponA selectCouponNo(int coupon_no)throws Exception{
		return couponAdao.selectCoupon(coupon_no);
}
}
