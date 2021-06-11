package com.javaex.ex22;

import java.io.IOException;
//컨쉬+o 하면 임포트
public class FileReader {
	//필드
	//만들게 없음
	//생성자
	//디폴트 생성자라서 안만들어도됨
	//메소드 - g/s
	
	//정상메소드
	public void Read(String path) {
		//파일을 읽음
		String file = "학교종이 땡땡땡 어서 모이자 선생님이 우리를 기다리신다.";
		System.out.println(file);
	}
	
	
	
	//예외발생 메소드
	public void Read2(String path) {
		//파일을 읽음 ---> 가정:파일이 없는 경우
		
		try {
			//파일을 읽는다.
			throw new  IOException(); //파일이 없다.
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
	}
	
	
	
	//예외발생 처리.
	public void Read3(String path) throws IOException{
		//파일을 읽음 ---> 가정:파일이 없는 경우
		throw new  IOException(); //파일이 없다. 사용시 컨쉬+o 눌러서 import해줘야함.
	}
	
	
}
