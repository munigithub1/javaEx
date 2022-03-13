package com.javaex.Array;

import java.util.Scanner;

public class Problem04money {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int won[] = new int[8];
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // 환산할 돈의 종류
		System.out.print("금액 : ");
		int money = sc.nextInt();

		for (int i = 0; i < 8; i++) {
			won[i] = money / unit[i];
			money = money % unit[i];
			System.out.println(unit[i] + "원 권 " + won[i] + "개");
		}
		sc.close();
	}

}
