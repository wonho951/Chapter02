package com.javaex.ex07;
//import 있나 없나 확인하기. 같은 패키지에서는 굳이 불러 올 필요가 없음.
public class SongApp {

	public static void main(String[] args) {
		
		
		Song Iu = new Song();
		Iu.setArtist("아이유");
		Iu.setTitle("좋은날");
		Iu.setAlbum("Real");
		Iu.setYear(2010);
		Iu.setTrack(3);
		Iu.setComposer("이민수");
		Iu.showInfo();
		
		
		Song BigBang = new Song("Bigbang", "거짓말", "Always", 2007, 2, "G-DRAGON" );
		BigBang.showInfo();
		
		
		Song Busker = new Song("버스커버스커", "벚꽃엔딩");		
		Busker.showInfo();
		
		
		Song iu = new Song("이민수", 3, 2010, "Real", "좋은날", "아이유");
		iu.showInfo();
		
		   
		
	}

}
