package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

		System.out.println("=====================================");
		System.out.println("\t [숫자 맞추기 게임 시작] \t");
		System.out.println("=====================================");

		Scanner sc = new Scanner(System.in);
//		Scanner sc2 = new Scanner(System.in);
		int rNum = 0;
		int num = 0;
		String ans = "";
		
		rNum = (int)(Math.random()*100) +1;
		//System.out.print("임의의 정수 : " + rNum);
		
		while(true) {
			System.out.print(">>");	
			
			num = sc.nextInt();
			if(num == rNum) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				
//				ans = sc2.nextLine();
				sc.next();	// 입력 버퍼 비우기
				ans = sc.nextLine();
				if(ans.equals("y")) {
					System.out.println("=====================================");
					System.out.println("\t [숫자 맞추기 게임 종료] \t");
					System.out.println("=====================================");

					break;
				}else {
					rNum = (int)(Math.random()*100) +1;
					continue;
				}
			}else if(num > rNum) {
				System.out.println("더 낮게");
			}else{
				System.out.println("더 높게");
			}
		}
		
		sc.close();
//		sc2.close();
	}

}
