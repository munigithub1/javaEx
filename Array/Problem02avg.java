package com.javaex.Array;

import java.util.Scanner;

public class Problem02avg {
// 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5]; //배열 생성
		
		int sum = 0; // 합 초기 설정
		double avg;
		for (int i = 0; i < num.length; i++) {
			System.out.print("입력 : ");
			num[i] = sc.nextInt();
			sum += num[i]; 
		}
		avg = (double) sum / num.length; // 형변환

		System.out.println("점수 합계 : " + sum);
		System.out.println("점수 평균 : " + avg);
		sc.close();
	}
}
