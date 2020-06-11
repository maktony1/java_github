package test0602;

class Rectangle{
	int width,height;
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	int getArea() {
		return width*height;
	}
	
	static Rectangle getMaxRec(Rectangle[] rec) {
		Rectangle max=rec[0];
		
		for (int i = 0; i < rec.length; i++) {
			if(max.getArea() < rec[i].getArea()) {
				max = rec[i];
			}
		}
		return max;
	}
	
	
	
}
