package test0525;

public class Rectangle {
	int width,height;
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	int square() {
		return width*height;
	}
	
	void show() {
		System.out.printf("크기가 %d*%d인 사각형의 면적은 %d 입니다.",width,height,square());
		
	}
}
