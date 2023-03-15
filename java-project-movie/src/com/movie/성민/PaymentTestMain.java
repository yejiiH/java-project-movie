package com.movie.성민;

import com.movie.dto.Payment;

public class PaymentTestMain {

	public static void main(String[] args)throws Exception {
		
		PaymentSelect pay = new PaymentSelect();
		
		int a = pay.selectByPrice("seongmin");
		System.out.println(a);
		
		String aa = pay.selectByID("seongmin");
		System.out.println(aa);
		
		
		
	}
	
	

}
