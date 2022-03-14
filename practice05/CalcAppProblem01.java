package com.javaex.practice05;

import java.util.Scanner;

public class CalcAppProblem01 {

	public static void main(String[] args) {
		System.out.println("연산 입력");

		Scanner sc = new Scanner(System.in);
		String str = ""; // 임시로 받을 문자 초기화

//		System.out.println(arr[1]); // arr[1] 확인

		while (true) {
			System.out.print(">> ");

			str = sc.nextLine();
			String[] arr = str.split(" ");

			System.out.println(str); // str 확인
//			System.out.println("입력한 계산식 : " + str);
			if ("/q".equals(arr[0])) {
				System.out.println("종료합니다");
				break;
			} else if (arr.length > 2) {
				int num1 = Integer.parseInt(arr[0]); // 배열이 3개로 분리되었는지 체크
				int num2 = Integer.parseInt(arr[2]);

				if ("+".equals(arr[1])) {
					AddProblem01 add = new AddProblem01();
					add.setValue(num1, num2); // 값 초기화 -> num1, num2로
					System.out.println(add.calculate()); // 계산 결과 출력
				} else if ("-".equals(arr[1])) {
					SubProblem01 sub = new SubProblem01();
					sub.setValue(num1, num2);
					System.out.println(sub.calculate());
				} else if ("*".equals(arr[1])) {
					MulProblem01 mul = new MulProblem01();
					mul.setValue(num1, num2);
					System.out.println(mul.calculate());
				} else if ("/".equals(arr[1])) {
					DivProblem01 div = new DivProblem01();
					div.setValue(num1, num2);
					System.out.println(div.calculate());
				} else {
					System.out.println("알 수 없는 연산입니다."); // System.out.println(">>")로
				}
			}
		}
		sc.close();
	}
}
