package com.javaex.ex07;

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
		Busker.setAlbum("버스커버스커 1집");
		Busker.setYear(2012);
		Busker.setTrack(4);
		Busker.setComposer("장범준");
		Busker.showInfo();
		
		
		Song iu = new Song("이민수", 3, 2010, "Real", "좋은날", "아이유");
		iu.showInfo();
	}

}
