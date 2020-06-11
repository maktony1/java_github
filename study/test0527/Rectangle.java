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
 * ����Ÿ�԰���
 * �Լ��� ����
 * �Ķ���� ����
 * ���ϰ� ����
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
