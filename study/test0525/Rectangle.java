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
		System.out.printf("ũ�Ⱑ %d*%d�� �簢���� ������ %d �Դϴ�.",width,height,square());
		
	}
}
