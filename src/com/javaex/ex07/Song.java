package com.javaex.ex07;

public class Song {

	// 필드 
	private String title; 
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	// 생성자 
	
	//상황 복잡하게 만들기 위해 생성자 하나 생성
	public Song(String title, int track) {
		this.title = title;
		this.track = track;
	}
	
	public Song() {
	
	  }

	public Song(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}

	public Song(String artist, String title, String album, int year, int track, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}

	public Song(String composer, int track, int year, String album, String title, String artist) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}

	// 메소드(게터,세터) 
	//위 형식대로 생성자 해뒀을땐 굳이 게터 필요없음 
	public String getTitle() { return
	title;

	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public String getComposer() {
		return composer;
	}

	public int getYear() {
		return year;
	}

	public int getTrack() {
		return track;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 메소드-일반

	public void showInfo() {
		System.out.println(artist + ", " + title + " " + "( " + album + ", " + year + ", " + track + "번 track, "
				+ composer + " 작곡 )");
	}

}
