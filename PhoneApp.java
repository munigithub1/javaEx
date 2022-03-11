package com.javaex.PhoneSang;

public class PhoneApp
{
	public static void main(String[] args)
	{

		Phone phone = new SmartPhone();
		phone.execute("앱");
		phone.execute("음악");
		phone.execute("통화");

	}
}
