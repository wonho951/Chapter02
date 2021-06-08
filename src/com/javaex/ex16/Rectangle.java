package com.javaex.ex16;

public class Rectangle {

	// 필드
	private String fillColor;
	private String LineColor;
	private int width;
	private int height;

	// 생성자
	public Rectangle() {

	}

	public Rectangle(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		LineColor = lineColor;
		this.width = width;
		this.height = height;
	}

	// 메소드g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return LineColor;
	}

	public void setLineColor(String lineColor) {
		LineColor = lineColor;
	}

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


	
	// 메소드-일반
	@Override
	public String toString() {
		return "Rectangle [fillColor=" + fillColor + ", LineColor=" + LineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	
	
	
	public void draw() {
		System.out.println("[면색: " + fillColor + ", 선색: " + LineColor + ", 가로: " + width + ", 세로: " + height + "] 사각형을 그렸습니다.");
	}
	
	
	
}
