package com.javaex.helloworld;

import java.util.Scanner;

public class if_elseTestprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동정렬 컨트롤 쉬프트 f
		Scanner sc = new Scanner(System.in);
		// 강의실 번호를 출력하는 프로그램 작성
		System.out.println("과목을 선택하세요");
		System.out.println("(1.Java 2.C 3.C++ 4.Python)");
		int Subnum = sc.nextInt();

		if (Subnum == 1) {
			System.out.println("R101호 입니다");
		} else if (Subnum == 2) {
			System.out.println("R202호 입니다");
		} else if (Subnum == 3) {
			System.out.println("R303호 입니다");
		} else if (Subnum == 4) {
			System.out.println("R404호 입니다");
		} else {
			System.out.println("상담원에게 문의하세요");
		}
		sc.close();
	}

}
