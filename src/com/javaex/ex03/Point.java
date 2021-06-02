package com.javaex.ex03;

public class Point {
	
	/*
	//필드
	private int x;
	private int y;
	

	
	//세터(setter)
	public void setX(int coordinatesX) {
		x = coordinatesX;
	}
	
	public void setY(int coordinatesY) {
		y = coordinatesY;
	}
	
	
	//게터(getter)
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x=" + x + " y=" + y + "]을 그렸습니다.");
		System.out.println("점[x=" + x + " y=" + y + "]을 그렸습니다.");
	}
	*/
	
	//필드
	private int x;
	private int y;
	
	
	public void setX(int x) { //()밖에서 받은값
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public int getX() {
		return x;
	}
		
	public int getY() {
		return y;
	}
	
	
	public void draw() {
		//그리는 복잡한 기능을 구현해야 한다고 가정.........
		System.out.println("점[x=" + x + " , y=" + y + "]을 그렸습니다.");
		
	}
}
