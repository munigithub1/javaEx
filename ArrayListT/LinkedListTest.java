package com.javaex.ArrayListT;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); // list의 데이터들이 <Integer>에 들어갈 것
		System.out.println(list);
		
		// 값 추가
		list.add(3); // 3 출력
		System.out.println(list);
		

		list.add(2); // 2 출력
		System.out.println(list);

		list.addFirst(1); // 가장 앞에 데이터 추가
		System.out.println(list);

		list.add(1, 10); // index 1에 데이터 10 추가
		System.out.println(list);
		
		list.addLast(100); // 가장 뒤에 데이터 추가
		System.out.println(list);
		
//		list.removeLast(); // 가장 뒤에 데이터 제거 // removeFirst(); 
//		System.out.println(list);
//		
//		list.removeFirst(); // 가장 앞에 데이터 제거 // removeFirst(); 
//		System.out.println(list);
//		
//		list.remove(1); // index 1 제거
//		System.out.println(list);
		
		System.out.println(list.size()); // list 크기 5
		
		for(Integer i : list) { // for문을 통한 전체 출력
			System.out.println(i);
		}
		
		Iterator<Integer> iter = list.iterator(); //Iterator 선언
		while(iter.hasNext()) { // 다음값이 있는지 체크
			System.out.println(iter.next()); // 값 출력
		}
		System.out.println(list.contains(1)); // 1이 있는가
		System.out.println(list.contains(10));
		
		System.out.println("------------------");
		// 값 삭제
		
	}

}
