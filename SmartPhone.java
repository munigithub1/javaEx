package com.javaex.PhoneSang;

public class SmartPhone extends MusicPhone
{
	String playApp;

	public void execute(String str)
	{
		// 코드작성
//		if ("통화".equals(str))
//		{
//			playCall();
//		} else
//		{
//			super.execute(str);
//		}
		if ("앱".equals(str))
		{
			playApp();
		} else
		{
			super.execute(str);
		}
	}

//	public SmartPhone(String playApp) // 하면 오류가 뜸
//	{
//		super();
//		this.playApp = playApp;
//	}
//
//	public SmartPhone(String playApp, String playMusic, String call)
//	{
//		super();
//		this.playApp = playApp;
//		//System.out.println(execute(toString()));
//	}

	public void playApp()
	{
		System.out.println("앱실행");
	}
	public void playMusic()
	{
		System.out.println("다운로드해서 음악재생");
	}

//	protected void playCall()
//	{
//		System.out.println("통화기능시작");
//	}
	// 메소드작성
	// 메소드작성
}
