package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods(); //---> Goods() 는 생성자를 부름(디폴트 생성자)
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		
		
		Goods computer = new Goods("그램" , 1000000);
		
		
	}

}
