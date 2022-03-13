package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {

		int menu = 0;
		int money = 0;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			
			System.out.print("선택>");
			menu = sc.nextInt();
			switch(menu) {
				case 1:
					System.out.print("예금액>");
					money = sc.nextInt();
					if(money < 0) {
						System.out.println("잘못된 금액입니다.");
					}
					else {
						balance += money;
					}
					break;
				case 2:
					System.out.print("출금액>");
					money = sc.nextInt();
					if(money < 0) {
						System.out.println("잘못된 금액입니다.");
					}
					else {
						if(balance < money) {
							System.out.println("잔액이 부족합니다.");
						}
						else {
							balance -= money;
						}
					}
					break;
				case 3:
					System.out.println("잔고액>" + balance);
					break;
				case 4:
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("다시 입력해주세요.");
					break;
			}
			if(menu == 4) {
				break;
			}
		}
		sc.close();
	}

}
