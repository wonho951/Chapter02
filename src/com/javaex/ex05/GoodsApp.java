package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {
		
		/*
		Goods camera = new Goods(); //---> Goods() 는 생성자를 부름--->생성자 복수일때 디폴트 생성자 없으면 오류나므로 생성자 복수일때는 디폴트 생성자 만들기.
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		//생성자는 한번만 사용가능. 다시 호출 불가능하다.
		//camera.Goods ("니콘2", 500000) ---> 이미 Good()생성자 불렀기 때문에 이런식으로 새로 쓰려면 다른 생성자 불러와야함.
		
		Goods computer = new Goods("그램" , 1000000);
		
		computer.showInfo();
		*/
		
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		/*
		camera.setName("니콘2");
		camera.showInfo();
		*/
		
		Goods camera2 = new Goods("니콘2", 500000); //--> 변수인 camera가 겹침. 2로 바꾸면 오류 안남
		camera2.showInfo();
		
		camera = new Goods("니콘3" , 500);  //--> 오류 안나는 이유는 맨 앞에 Goods없기때문.기존에 있는 생성자에 덧씌웠기때문임.
		
		
		
	}

}
