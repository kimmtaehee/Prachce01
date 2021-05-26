package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		byte a = sc.nextByte();
		
		System.out.print("100원 개수: ");
		byte b = sc.nextByte();
		
		System.out.print("50원 개수: ");
		byte c = sc.nextByte();
		
		System.out.print("10원 개수: ");
		byte d = sc.nextByte();
		
		System.out.print("동전의 총합은 " + a + b + c + d + " 원 입니다.");
		
		sc.close();
		
	}

}
