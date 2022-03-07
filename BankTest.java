package com.javaex.helloworld;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean play = true;
		int money = 0;

		while (play) {
			System.out.println("===============================================");
			System.out.println(" 1. 예금  | 2. 출금 | 3. 잔고 | 4. 종료 ");
			System.out.println("===============================================");

			System.out.println("선택 > ");
			int input = Integer.parseInt(scanner.nextLine());

			switch (input) {
			case 1:
				System.out.print("예금 : ");
				money += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("출금 : ");
				money -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("잔고 : ");
				System.out.println(money);
				break;
			case 4:
				System.out.println("종료");
				play = false;
			}
		}
	}
}

