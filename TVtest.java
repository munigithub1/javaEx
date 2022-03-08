package com.javaex.oop;

public class TVtest
{
	private int channel;
	private int volume;
	private boolean power;

	public int getChannel()
	{
		return channel;
	}

	public int getVolume()
	{
		return volume;
	}

	public boolean isPower()
	{
		return power;
	}

	public void TV(int channel, int volume, boolean power)
	{
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public TVtest()
	{
		super();
	}

	public void power(boolean on)
	{
		this.power = on;
	}

	public void channel(int channel)
	{
		if (channel >= 1 && channel <= 255)
		{
			this.channel = channel;
		} else	{
			System.out.println("채널 선택 오류");
		}
	}

	public void volume(int volume)
	{
		if (volume >= 0 && volume <= 100)
		{
			this.volume = volume;
		} else if (volume > 100)
		{
			this.volume = 100;
		} else if (volume < 0)
		{
			this.volume = 0;
		}
	}

	public void channel(boolean up)
	{
		if (up == true)
		{
			this.channel++;
		} else
		{
			this.channel--;
		}
	}

	public void status()
	{
		String power = "";
		if (this.isPower())
		{
			power = "On";
		} else
		{
			power = "Off";
		}
		System.out.println("TV 상태 ");
		System.out.println("전원 : " + this.isPower());
		System.out.println("채널 : " + this.getChannel());
		System.out.println("볼륨 : " + this.getVolume());
	}
}
