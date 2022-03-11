package com.javaex.chusang;

public class Depart extends Employee
{
	// 코드작성
	String department;

	/**
	 * @param department
	 * @param string
	 * @param i
	 * @param string
	 * @param i
	 */
	public Depart(String name, int salary, String department)
	{
		super(name, salary);
//		super(); 
		this.department = department;
//		this.name = name;
//		this.salary = salary;
	}
	public Depart(String department)
	{
		super();
		this.department = department;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public void getInformation() //Employee에서 오버라이딩한 것
	{
		System.out.println("이름 : " + this.getName() + " 연봉 : " + this.getSalary() + " 부서 : " + this.getDepartment());
	}
}
