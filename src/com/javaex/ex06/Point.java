package com.javaex.ex06;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		//디폴트 내부조건이 비어있어도 어쩔수 없음.
	}
	
	public Point(int x, int y) {
		//Point 힙에 올리는 일
		this.x = x;
		this.y = y;
	}
	
	public Point(int x) {
		this.x = x;
	}
	
	/*
	public point(int y) {//파라미터의 자료형이 같으면 구별 불가능
		this.y = y;
	}
	*/
	
	
	//메소드(게터세터)
	public void setX(int x) { 
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
	
	
	//메소드-일반
	public void draw() {		
		System.out.println("점[x=" + x + " , y=" + y + "]을 그렸습니다.");
		
	}
	
	
	
}
