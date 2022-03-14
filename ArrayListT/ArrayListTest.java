package com.javaex.ArrayListT;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3); // 값 추가
		System.out.println(list);
		
		System.out.println("---------------");
		
		list.add(null); // null값도 add가능
		System.out.println(list);
		System.out.println(list.size()); // 크기 구하기 2 출력
		
		System.out.println("---------------");
		
		list.add(1, 10); // index 1에 10 삽입
		System.out.println(list);
		
//		list.remove(2); // 3, 10 출력 null 출력x
//		System.out.println(list);
//		
//		list.clear(); // 다 지움
//		System.out.println(list);
		
		System.out.println(list.get(1));
		
		System.out.println("---------------");
		
		for(Integer i : list) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("---------------");
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("---------------");
		//arraylist 값 체크
		System.out.println(list.contains(1));  // 1이 있는가
		System.out.println(list.contains(10)); // 10이 있는가
		System.out.println("---------------");
		//arraylist 값 검색
		System.out.println(list.indexOf(1)); // 1이 있는 index반환 없으면 -1
		System.out.println(list.indexOf(10)); // 10이 있는 index반환 있으면 1
	}

}
