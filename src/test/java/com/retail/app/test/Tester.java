package com.retail.app.test;

import java.math.BigDecimal;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "error :Not valid product in system: This product ID does not represent a valid product";
		System.out.println(msg.substring(7, msg.length()));
		String s = "1.01";
		BigDecimal big = new BigDecimal(s);
		//System.out.println(big new BigDecimal(2.00));
		System.out.println(s+1);
		System.out.println(1+2);

	}

}
