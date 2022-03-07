package com.javaex.helloworld;

import java.util.Scanner;

public class ConExBreakTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
			while(true)
			{
				num = sc.nextInt();
				if (num < 0)
				{
				continue; //판별하지않고 내려감
				}
			if (num == 0)
			{
			break;
			}
			if (num % 3 ==0)
				{
					System.out.println("3의 배수입니다");
				}
				else 
				{
					System.out.println("3의 배수가 아닙니다");
				}
			System.out.println("프로그램 종료");
				sc.close();
		}
	}
}
