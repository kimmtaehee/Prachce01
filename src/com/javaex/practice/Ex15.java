package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double mail_1 = 1.609;
		
		System.out.print("마일을 입력하세요 : ");
		int mail = sc.nextInt();
		
		System.out.println( (double)mail + "마일은 " + mail*mail_1 + "킬로미터 입니다.");
		
		sc.close();

	}

}
