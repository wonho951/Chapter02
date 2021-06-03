package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods(); //---> Goods() 는 생성자를 부름
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		
		
		
		
	}

}
