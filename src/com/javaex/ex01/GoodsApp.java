package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		//메인 시나리오.
		
		
		Goods camera = new Goods();		
		camera.name = "니콘";    // String으로 만들어둬서 숫자 입력 못함.
		camera.price = 400000; // 정수형으로 만들었기때문에 숫자만 가능.		
		System.out.println(camera.name + "," + camera.price);
		
		
		
		Goods computer = new Goods();		
		computer.name = "LG그램";
		computer.price = 1000000;		
		System.out.println(computer.name + "," + computer.price);
		
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		System.out.println(cup.name + "," + cup.price);
	
	}

}
