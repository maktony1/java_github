package test0525;

public class Triangle {

	private int width,height;
	
	Triangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	void equalTriangle(Triangle t) {
		if((t.width==width) && (t.height==height)) {
			System.out.println("���� �ﰢ�� �Դϴ�.");
		}else {
			System.out.println("�ٸ� �ﰢ�� �Դϴ�.");
		}
	}

		
	}
	
