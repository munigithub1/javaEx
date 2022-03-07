package com.javaex.helloworld;

import java.util.Scanner;

public class ifTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력받으세요");
		int Suja = sc.nextInt();

		if (Suja % 2 == 0) {
			System.out.println("짝수");
		} else if (Suja % 2 == 1) {
			System.out.println("홀수"); //else로도 가능 
		} else if (Suja < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
	}
}
