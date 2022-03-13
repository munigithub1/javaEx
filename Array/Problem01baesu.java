package com.javaex.Array;

public class Problem01baesu {
// 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 출력하시오.
	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int total = 0;
		int getsu = 0;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 3 == 0) {
				total += data[i];
				getsu++;
			}
		}
		System.out.println("3의 배수 개수=> " + getsu);
		System.out.println("3의 배수 합 : " + total);
	}

}