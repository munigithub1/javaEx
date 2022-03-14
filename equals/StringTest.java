package com.javaex.equals;

public class StringTest {

	public static void main(String[] args) {
		String greeting = "Hello JAVA!";
		System.out.println(greeting.charAt(0));
		System.out.println(greeting.charAt(10));
		System.out.println(greeting.substring(1,3));
		// 1,3중 1은 0과 1사이에 있고 3은 2와 3사이에 있다
		// 출력을 하면 e,l 이 나온다
		System.out.println("-----");

		for (int i = 0; i < greeting.length(); i++) {
			System.out.println(greeting.charAt(i));
		}
		
		String str = "JAVA Programming";
		// 문자열의 길이만큼 반복
		for(int i=0; i<str.length(); i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		
		//str2의 내용중 공백 (" ")을 ","로 변경하는 코드 작성
		String str2 = "apple mango banana";
		String s;
		s = str2.replace(" ", ",");
		System.out.println(s);
	}

}
