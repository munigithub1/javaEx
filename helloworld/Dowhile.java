package com.javaex.helloworld;

import java.util.Scanner;

public class Dowhile
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hab;
		hab = 0;
		do
		{
			System.out.println("숫자를 입력");
			int num = sc.nextInt();

			if (num != 0)
			{
				hab += num;
				System.out.println("합계 : " + hab);
			} 
			else if (num == 0)
			{
				System.out.println("종료!");
				break;
			}
		} while (true);
		sc.close();
	}

}
