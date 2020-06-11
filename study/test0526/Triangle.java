package test0526;

public class Triangle {
	int width,height;
	
	public Triangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	void equalTriangle(Triangle t) {
		if((this.height==t.height)&&(this.width==t.width)) {
			System.out.println("같은 삼각형 입니다.");
		}else {
			System.out.println("다른 삼각형 입니다.");
		}
	}
}
