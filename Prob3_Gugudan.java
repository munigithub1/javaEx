package com.javaex.helloworld;
public class Prob3_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//이름 
		for(int i=2; i<10; i++)
		{
			System.out.print("["+i+"단]\t");
		}
		System.out.println(" ");
		
		//j를 단, i를 수
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
				
			}
			System.out.println(" ");
		}
	}

}
