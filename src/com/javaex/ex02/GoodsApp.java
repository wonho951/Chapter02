package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
						
		//camera.name ="니콘";		
		camera.setName("니콘");
				
		//camera.price = 400000;
		camera.setPrice(400000);
		
		//computer.name = "그램";
		computer.setName("그램");
				
		//computer.price = 1000000;
		computer.setPrice(1000000);
		
		//cup.name = "머그컵";
		cup.setName("머그컵");
		
		//cup.price = 2000;
		cup.setPrice(2000);
	
		//System.out.println("상품명 :" + camera.setName("니콘") + " , " + "가격: " + camera.price );
		//String cameraName = camera.getName(); //--> 호출해옴. 클래스 파일에 정의하지 않고 바로 불러옴.상황에 맞게 사용
		
		//System.out.println("상품명 : " + camera.getName() + " , " + "가격: " + camera.getPrice() );				
		camera.showInfo();  // --> 클래스파일에 만들어두면 한번에 출력됨.
		
		
		//System.out.println("상품명:" + computer.name + " , " + "가격: " + computer.price );
		//System.out.println("상품명 : " + computer.getName() + " , " + "가격: " + computer.getPrice() );
		computer.showInfo();
		
		
		//System.out.println("상품명:" + cup.name + " , " + "가격: " + cup.price );
		//System.out.println("상품명 : " + cup.getName() + " , " + "가격: " + cup.getPrice() );
		cup.showInfo();
		
		

	}

}
