package com.javaex.chusang;

public class Employee
{
	private String name;
	private int salary;

	public Employee()
	{
	}

	Employee(String name, int salary)
	{
		//super();
		this.name = name;
		this.salary = salary;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public void getInformation() // 오버라이딩 -> depart 겟 인포로
	{
		System.out.println("이름:" + name + "연봉:" + salary);
	}
}
