package com.javaex.ex17;

public class Shape {

	//필드
	protected String fillColor;
	protected String lineColor;
	
	
	//생성자
	public Shape() {
		super();
		System.out.println("Shape()");
	}
	
	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("Shape(2)");
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

	//메소드-일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + "도형] 을 그렸습니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
