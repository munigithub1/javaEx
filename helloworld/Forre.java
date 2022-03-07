package com.javaex.helloworld;

import java.util.Scanner;

public class Forre
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=1;
		
		while (true)
		{
			if (i % 6 ==0 && i % 14 == 0)
			{
				System.out.println(i);
				break;
			}
			/*
			 * else { continue; }
			 */
			//continue를 쓰면 i++에 영향이 미침
			i++;
		}
	}

}
