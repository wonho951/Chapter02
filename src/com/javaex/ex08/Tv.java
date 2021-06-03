package com.javaex.ex08;

public class Tv {

	//필드
		private int channel;
		private int volume;
		private boolean power;
		
		//생성자
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
		
		//볼륨 영역
		public void volume (int volume) {
			if(power == true) {
				if (this.volume > 100) {
					volume = 100;
				}
			} else {
				status();
			}			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//최종출력
		public void status() {
			if (power == true ) {
			System.out.println("채널 :" + channel + " 볼륨 : " + volume + " "+ power );
			} else {
				System.out.println("전원이 꺼져있습니다.");
			}
		}
	}
