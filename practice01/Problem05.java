package com.javaex.practice01;

public class Problem05 {

	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {
			for(int j=i; j<i+10; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}

}
