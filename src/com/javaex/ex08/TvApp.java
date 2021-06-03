package com.javaex.ex08;

public class TvApp {

	public static void main(String[] args) {
		
		
		Tv tv = new Tv(7,20,false); //채널 7 볼륨 20 전원 off  ---> 초기값
		
		tv.status();    // tv상태
		
		tv.power(true); // 전원on
		tv.volume(120); // 볼륨 100이상이므로 100으로 고정
		tv.status();    // tv상태
		
		tv.volume(false); // 볼륨 -1
		tv.status();      // tv상태

		tv.channel(0);   //채널 0이면 없는채널
		tv.status();     // tv상태
		
		tv.channel(true); // 채널 true일때 +1 
		tv.channel(true); // 채널 true일때 +1 
		tv.channel(true); // 채널 true일때 +1 
		tv.status();      // tv상태
		
		
		tv.power(false);  // 전원off
		tv.status();      // tv상태
			
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
