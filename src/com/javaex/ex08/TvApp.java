package com.javaex.ex08;

public class TvApp {

	public static void main(String[] args) {
		
		
		Tv tv = new Tv(7,20,false); //채널 7 볼륨 20 전원 off
		
		
		tv.status(); //tv상태
				
		tv.power(false); //false일 경우 전원 off
		tv.volume(120); //100으로 유지
		tv.status();     // tv 상태.
		
		tv.volume(false);	//볼륨 볼륨 최대치 볼륨 --
		tv.status();  // tv상태
		
		tv.channel(0);  //채널 0번
		tv.status();    // tv상태
		
		tv.channel(true); //채널 1씩 증가
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false); //전원 off
		tv.status();
	}

}
