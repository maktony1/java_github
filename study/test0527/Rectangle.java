package test0527;

public class Rectangle {
	private int width;
	int height;

	Rectangle() {
	}
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
/*
 * 리턴타입결정
 * 함수명 결정
 * 파라미터 선언
 * 리턴값 설정
 */


	int getArea() {
		return width * height;
	}

	static Rectangle compareRect(Rectangle r1,Rectangle r2) {
		
		Rectangle max;
		
		if((r1.getArea()) > (r2.getArea())) {
			max=r1;
		}else {
			max=r2;
		}
		return max;
		
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	
}
