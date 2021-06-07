package com.javaex.ex15;

public class PointApp {

	public static void main(String[] args) {
		

		Point p00 = new Point(4,4);
		p00.toString();
		
		p00.showInfo();
		
		
		
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		
		System.out.println(cp1.toString());
		
		System.out.println(cp2.toString());
		
		cp1.showInfo();
		
		cp2.showInfo();
	}

}
