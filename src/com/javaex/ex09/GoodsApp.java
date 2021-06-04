package com.javaex.ex09;

public class GoodsApp {
	//static 관련 업무---> static 예제
	// count용도로 static 잘 사용하지 않는다 --> 배열 --> 리스트
	public static void main(String[] args) {
		
		
		
		
		//카운트가 안올라감
		Goods computer = new Goods("그램", 1000000);
		//count = count +1;
		computer.showInfo();
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
	}

}
