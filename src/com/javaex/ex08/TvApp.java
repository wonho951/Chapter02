package com.javaex.ex08;

public class TvApp {

	public static void main(String[] args) {
		
		
		Tv tv = new Tv(7,20,false); //채널 7 볼륨 20 전원 off
		
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();

		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		
		tv.power(false);
		tv.status();
		
	}

}
