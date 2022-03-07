package com.javaex.helloworld;

import java.util.Scanner;

public class ContinueBreakTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) 
		{
			System.out.println("반복중...");
			num = sc.nextInt();
			if (num == 0)
			{
				break;
			}
			num--;
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
