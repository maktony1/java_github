package test0526;

public class Rectangle {
	int width;
	int height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	Rectangle() {
	}

	static Rectangle compareRect(Rectangle r1, Rectangle r2){
		Rectangle max;
		
		if((r1.width*r1.height) > (r2.width*r2.height)) {
			max=r1;
		}else {
			max=r2;
		}
		return max;
		
	}
	int getHeight() {
		return height;
	}
	
	int getWidth() {
		return width;
	}
}
