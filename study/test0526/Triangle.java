package test0526;

public class Triangle {
	int width,height;
	
	public Triangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	void equalTriangle(Triangle t) {
		if((this.height==t.height)&&(this.width==t.width)) {
			System.out.println("���� �ﰢ�� �Դϴ�.");
		}else {
			System.out.println("�ٸ� �ﰢ�� �Դϴ�.");
		}
	}
}
