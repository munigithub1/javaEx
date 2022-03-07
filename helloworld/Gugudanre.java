package com.javaex.helloworld;

import java.util.Scanner;

public class Gugudanre
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * int dan = 2; // 몇단 int vob = 1; // 1~9
		 * 
		 * for (dan = 2; dan < 10; dan++) { for (vob = 1; vob < 10; vob++) {
		 * System.out.println(dan + "*" + vob + "=" + dan * vob); }
		 * System.out.println(""); }
		 */

		// 별
		char s;
		int getsu;
		s = '*';
		for (s = 1; s <= 5; s++)
		{
			for (getsu = 1; getsu <= s; getsu++)
			{
				
				System.out.print(s);
			}
			System.out.println("");
		}

	}

}
