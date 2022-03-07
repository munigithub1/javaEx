package com.javaex.helloworld;

import java.util.Scanner;

public class ForDanTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int dan = sc.nextInt();
		int i =1;
		
		for( i = 1; i < 10; i++ )
		{
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		sc.close();
	}
}
