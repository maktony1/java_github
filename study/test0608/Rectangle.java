package test0608;

public class Rectangle {
	int width,height;
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	int getArea() {
		return width*height;
	}
	
	static Rectangle[] getSortingRec (Rectangle[] rec) {
		Rectangle temp;
		
		for (int i = 0; i < rec.length; i++) {
			for (int j = 0; j < rec.length-1; j++) {
				if(rec[j].getArea() < rec[j+1].getArea() ) {
					temp=rec[j];
					rec[j]=rec[j+1];
					rec[j+1]=temp;
				}
			}
		}
		return rec;
	}
	
}
