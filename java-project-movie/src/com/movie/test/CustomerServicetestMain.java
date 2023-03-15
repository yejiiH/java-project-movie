package com.movie.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.movie.dto.Customer;
import com.movie.service.CusService;

public class CustomerServicetestMain {

	public static void main(String[] args) throws Exception {
		CusService cusService = new CusService();

		String birth = "1994/07/19";
		Date aaa = new SimpleDateFormat("yyyy/MM/dd").parse(birth);

		Customer newCustomer = new Customer("newid22", 0, "뉴등장", "신새롬", "1234", aaa, "M", "010-7895-4574",
				"new22@naver.com", 3000, 1);
		System.out.println("회원가입>>" + cusService.addCustomer(newCustomer));

		System.out.println("로그인>>" + cusService.login("hejin", "6789"));

		System.out.println("회원탈퇴>>" + cusService.deleteInfo("hunjung"));
		
		Customer updateCustomer = new Customer ("newid22", 0, "점점점", "신수정", "1234", aaa, "M", "010-7895-4574",
				"new22@naver.com", 3000, 1);
		System.out.println("정보수정>>"+ cusService.updateInfo(updateCustomer));
		
		System.out.println("아이디 찾기");
		System.out.println(cusService.findId("한예지", "1011112222"));
		
		System.out.println("비밀번호 찾기");
		System.out.println(cusService.findPassword("yeji", "한예지"));
		
		System.out.println("전체 회원리스트");
		List<Customer> customerList=cusService.findAll();
		for(Customer customer2:customerList) {
				System.out.println(customer2); 
		}

	}

}
