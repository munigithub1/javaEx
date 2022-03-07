package com.javaex.helloworld;

import java.util.Scanner;

public class ifTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력받으세요");
		int Suja = sc.nextInt();

		if (Suja > 0) {
			System.out.println("양수");
		} else if (Suja < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0입니다");
		}

		sc.close();
	}

}
