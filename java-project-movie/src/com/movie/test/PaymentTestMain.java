package com.movie.test;

import java.util.ArrayList;

import com.movie.dao.PaymentDao;
import com.movie.dto.Payment;
import com.movie.service.PaymentService;

public class PaymentTestMain {

	public static void main(String[] args) throws Exception {

		PaymentService payment = new PaymentService();


		System.out.println("1.예매내역 출력");
		System.out.println(">> " + payment.list("woohuck"));

		
		System.out.println("2.결제취소");
		System.out.println(">>" + payment.deletebyCusId("junyeung"));

		System.out.println("3.결제금액 출력");
		System.out.println(">> "+ payment.selectPriceByCusID("woohuck"));
		
		System.out.println("3.쿠폰적용결제금액 출력");
		System.out.println(">> "+ payment.selectCouponByCusID("woohuck"));
		
		System.out.println("4. 모든 예약자 확인");
		System.out.println(payment.selectAll());

		System.out.println("5. cus_id로 회원별 모든 예약 확인");
		System.out.println(payment.selectByCusId("junyeung"));
		
		System.out.println("6. cus_id로 예매 상세내역 확인");
		System.out.println(payment.detail("seongmin"));
		
		System.out.println(payment.insertPayment("국민",1,1,"seongmin",48));
		
		
		
	}
}
