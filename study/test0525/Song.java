package test0525;

public class Song {
	String title, artist,country;
	int year;
	
	Song(){}
	
	Song(String title,String artist,String country,int year){
		this.title=title;
		this.artist=artist;
		this.country=country;
		this.year=year;
	}
	
	void show() {
		System.out.printf("%d�� %s������ %s�� �θ� %s",year,country,artist,title);
	}
}
