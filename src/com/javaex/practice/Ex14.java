package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요 : ");
		double w = sc.nextDouble();
		
		System.out.print("세로를 입력하세요 : ");
		double h = sc.nextDouble();
		
		System.out.println("사각형의 넓이는 " + w*4);
		
		System.out.println("사각형의 둘레는 " + (w+h)*2);
		
		
		sc.close();

	}

}
