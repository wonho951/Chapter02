package com.javaex.ex16;

public class Circle {

	//필드
	private String fillColor;
	private String lineColor;
	private int radius;
	
	//생성자
	public Circle() {
	
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}

	
	//메소드 g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//메소드-일반
	//데이터 테스트
	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}
	
	
    public void draw() {
    	System.out.println("]면색: " + fillColor + ", 선색: " + lineColor + ", 반지름: " + radius + "] 원을 그렸습니다.");
    }
	
	
	
}
