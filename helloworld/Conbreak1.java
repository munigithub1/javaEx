package com.javaex.helloworld;

import java.util.Scanner;

public class Conbreak1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;

		for (i=1; i <= 20; i++)
		{
			if (i % 2 == 0 && i % 3 == 0 ) 
			{
				continue;
			} 
			else 
			{
				System.out.println(i);
			}
			i++;
		}
		sc.close();
	}
}
