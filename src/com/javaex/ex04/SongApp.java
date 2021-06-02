package com.javaex.ex04;

public class SongApp {

	public static void main(String[] args) {
		
		//아이유
		Song Iu = new Song();
		Iu.setArtist("아이유");
		Iu.setTitle("좋은날");
		Iu.setAlbum("Real");
		Iu.setYear(2010);
		Iu.setTrack(3);
		Iu.setComposer("이민수");
		
		//Big-bang
		Song Bigbang = new Song();
		Bigbang.setArtist("BIGBANG");
		Bigbang.setTitle("거짓말");
		Bigbang.setAlbum("Always");
		Bigbang.setYear(2007);
		Bigbang.setTrack(2);
		Bigbang.setComposer("G-DRAGON");
		
		//버스커버스커
		Song Busker = new Song();
		Busker.setArtist("버스커버스커");
		Busker.setTitle("벚꽃엔딩");
		Busker.setAlbum("버스커버스커1집");
		Busker.setYear(2012);
		Busker.setTrack(4);
		Busker.setComposer("장범준");
			
		
		Iu.showInfo();
		Bigbang.showInfo();
		Busker.showInfo();

	}

}
