package com.javaex.practice01;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요");

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int max = 0;
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자 : ");
			num = sc.nextInt();	
			
			if(num > max) {
				max = num;
			}
		}
		
		System.out.println("최대값은 " + max + "입니다.");
		
		sc.close();
	}

}
