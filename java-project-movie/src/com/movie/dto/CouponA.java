package com.movie.dto;

public class CouponA {
	private int coupon_no;
	private String coupon_name;
	private int coupon_effect;
	public CouponA(int coupon_no, String coupon_name, int coupon_effect) {
		super();
		this.coupon_no = coupon_no;
		this.coupon_name = coupon_name;
		this.coupon_effect = coupon_effect;
	}
	public int getCoupon_no() {
		return coupon_no;
	}
	public void setCoupon_no(int coupon_no) {
		this.coupon_no = coupon_no;
	}
	public String getCoupon_name() {
		return coupon_name;
	}
	public void setCoupon_name(String coupon_name) {
		this.coupon_name = coupon_name;
	}
	public int getCoupon_effect() {
		return coupon_effect;
	}
	public void setCoupon_effect(int coupon_effect) {
		this.coupon_effect = coupon_effect;
	}
	@Override
	public String toString() {
		return "Coupon [coupon_no=" + coupon_no + ", coupon_name=" + coupon_name + ", coupon_effect=" + coupon_effect
				+ "]";
	}
	
	
}
