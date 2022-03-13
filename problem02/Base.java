package com.javaex.problem02;

public class Base {
	
	public void service(String state) {
		switch(state) {
			case "낮":
				day();
				break;
			case "밤" :
				night();
				break;
			case "오후" :
				afternoon();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
		}
	}
	
	public void day() {
		System.out.println("낮에는 열심히 일하자");
	}

	public void night() {
		System.out.println("night");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
}
