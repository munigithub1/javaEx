package com.javaex.helloworld;

public class leftright
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] leftArray = new int[]
		{ 10, 20, 30 };
		int[] rightArray = new int[]
		{ 10, 21, 30 };

		if (leftArray.length != rightArray.length)
		{
			System.out.println("두 배열이 크기 다름");
		}
		else {
			System.out.println("같음");
			for (int i = 0; i < leftArray.length; i++)
			{
				if (leftArray[i] != rightArray[i])
				{
					System.out.println(i + "번 값이 다름");
					System.out.println(leftArray[i] + "<->" + rightArray[i]);
				}
			}
		}
	}
}
