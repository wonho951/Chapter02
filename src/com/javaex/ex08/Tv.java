package com.javaex.ex08;

public class Tv {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv() {
		
	}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	//메소드(세터 없어도 됨)
	
	
	
	public int getChanner() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	
	//메소드 - 일반
	
	//전원
	public void power (boolean on) {
		this.power = on;
	}
	
	//채널
	public void channel(int channel) {
		if(channel > 255) {
			channel = this.channel--;			
		} 
	}
	
	
	public void channel(boolean up) {
		if (channel < 256) {
			channel++;
			System.out.println(channel + "번 입니다.");
		} else {
			channel--;
			System.out.println("마지막 채널입니다");
		}
	}
	
	
	public void volume(int volume) {
		if (volume < 100) {
			System.out.println("볼륨을 올립니다.");
		} else if(volume>100) {
			volume = 100;
			System.out.println("볼륨이 너무 큽니다. 볼륨을 100으로 낮춥니다.");
		}
	}
	
	
	public void volume(boolean up) {
		if (volume <100 == true) {
			volume++;
			System.out.println("현재 볼륨은 " + volume + "입니다.");
		}else {
			volume=100;
			System.out.println("볼륨이 최대치입니다.");
		}
	}
	
	
	public void status() {
		if (power == true) {
		System.out.println("전원이 꺼져있습니다. 정보를 보시려면 전원을 켜주세요.");
		} else {
			 System.out.println("현재 채널은" + channel + "번, 볼륨은 " + this.volume + ", 전원이 켜져있습니다.");
		}
	}
}
