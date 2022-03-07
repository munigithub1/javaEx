package com.javaex.helloworld;
import java.util.Scanner;
public class Jumsuabcdf
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int jumsu = sc.nextInt();
		if (jumsu >= 90 && jumsu <= 100)
		{
			System.out.println("A등급");
		} else if (jumsu <= 89 && jumsu >= 80)
		{
			System.out.println("B등급");
		} else if (jumsu <= 79 && jumsu >= 70)
		{
			System.out.println("C등급");
		} else if (jumsu <= 69 && jumsu >= 60)
		{
			System.out.println("D등급");
		} else if (jumsu < 60)
		{
			System.out.println("F등급");
		} else
		{
			System.out.println("다시 입력하세요");
		}
		sc.close();
	}
}
