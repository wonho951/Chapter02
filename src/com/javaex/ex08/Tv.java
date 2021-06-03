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
			if (on == true) {
				this.power = true;
			} else {
				this.power = false;
			}
		}					
		
		//볼륨 영역
		public void volume (int volume) {
			if(power == true) {
				if (volume > 100) {
					this.volume = 100;
				}else {
					this.volume = volume;
				}
			}		
		}
		
		
		public void volume (boolean up) {
			if (up == true) {
				volume ++;
			} else {
				volume--;
			}
		}
		
		
		
		//채널 영역
		public void channel (int channel) {
			if (power == true) {
				if (channel > 255 || channel < 1) {
					System.out.println("채널을 확인해주세요.");
				} else {
					this.channel = channel;
				}
			}
				
		}
		
		public void channel (boolean up) {
			if (up == true) {
				channel++;
			} else {
				channel--;
			}
		}
				
		//최종출력
		
		public void status() {
			if (power == true ) {
				System.out.println("전원이 켜져있습니다.");
				System.out.println("채널 :" + channel + " 볼륨 : " + volume);
			} else {
				System.out.println("전원이 꺼져있습니다.");
			}
			System.out.println("");
		}
	
	}
