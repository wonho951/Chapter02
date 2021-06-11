package com.javaex.ex22;

import java.io.IOException;

public class MyApp {

	public static void main(String[] args) {
		
		
		FileReader fr = new FileReader();

		
		//파일이 있을때-->정상적일때		
		fr.Read("C:/school.text"); //정상적인 경우 파일을 읽어줌.
		
		
		//파일이 없을때
		fr.Read2("C:/school.text");
		
		
		
		
		//예외발생
		try {
			fr.Read3("C:/school.text");
		} catch (IOException e) { //빨간 밑줄일때 컨쉬+o누르면 import해줌. 
			System.out.println("******No File******");
		}
		
		
		
		
		
	}

}
