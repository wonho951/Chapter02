package com.javaex.ex21;

import java.util.Scanner;

public class ArithException { //어떤 수를 0으로 나눌 때 발생하는 오류.

	public static void main(String[] args) {

		/*
		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		num = sc.nextInt();
		
		result = 100/num;  //java.lang.ArithmeticException 발생(예외)
		
		System.out.println(result);  // 0입력시 예외발생으로 수행되지 않음
		
		sc.close();
		*/
		
		
		
		
		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		num = sc.nextInt();
		
		
		
		try {
			result = 100/num; //try는 감시한다고 생각. 최소한으로 줘야함. 예외 발생 가능성 있는 코드넣어줌.
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("0 % 1로 처리했습니다."); //예외발생시에 여기서 잡힌다고 생각하기.
			result = 100/1; // 예외 발생해서 넘어오면 강제로 1로 나눈다.
			System.out.println(result);
		} finally {
			System.out.println("Finally 영역");
		}
		
		
		
		
		  // 0입력시 예외발생으로 수행되지 않음
		
		sc.close();
	}

}
