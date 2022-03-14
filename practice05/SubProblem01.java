package com.javaex.practice05;

public class SubProblem01  {
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public SubProblem01(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public SubProblem01() {
		super();
	}
	public void setValue(int a, int b)
	{
//		this.a = a;
//		this.b = b;
		this.setA(a);
		this.setB(b);
	}
	
	public int calculate() {
//		return this.a + this.b;
		return this.getA() - this.getB();
	}
}
