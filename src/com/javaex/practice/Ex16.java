package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		float price = sc.nextFloat();
		
		System.out.print("받은돈: ");
		float pay = sc.nextFloat();
		
		float vat = pay/10;
		
		System.out.println("--------------------------------");
		
		System.out.println("받은돈: " + pay );
		
		System.out.println("상품가격: " + price);
		
		System.out.println("부가세: " + vat );
		
		System.out.println("잔액: " + (pay-price));
		
		
		sc.close();

	}

}
