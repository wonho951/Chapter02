package com.javaex.ex18;

public class Rectangle extends Shape {

	// 필드
	private int width;
	private int height;
	
	
	// 생성자
	public Rectangle() {
		//super();--> 부모의 디폴트생성자 불러옴
		//System.out.println("Rectangle()");
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor); // 부모의 생성자 불러옴
		this.width = width;
		this.height = height;
		//System.out.println("Rectangle(4)");
	}

	// 메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	//메소드-일반
	//데이터 테스트
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";//width hteight는 this.width, this.height 가능  fillColor, lineColor은 super.fillColor 사용 가능
	}


	
	
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + ", 가로:" + width + ", 세로:" + height +"] 사각형을 그렸습니다.");
	}



	public double area() {
		return width*height;
	}

	

}
