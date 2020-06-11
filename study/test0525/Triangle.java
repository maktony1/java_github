package test0525;

public class Triangle {

	private int width,height;
	
	Triangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	void equalTriangle(Triangle t) {
		if((t.width==width) && (t.height==height)) {
			System.out.println("같은 삼각형 입니다.");
		}else {
			System.out.println("다른 삼각형 입니다.");
		}
	}

		
	}
	
