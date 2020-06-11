package test0605;

public class Rectangle {
	int width,height;
	
	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	
	int getArea() {
		return width*height;
	}

	public static Rectangle[] getSortingRec(Rectangle[] rec) {
		Rectangle temp=rec[0];
		for (int i = 0; i < rec.length-1; i++) {
			for (int j = 0; j < rec.length; j++) {
				
				if(rec[i].getArea() < rec[i+1].getArea()) {
					temp=rec[i+1];
					rec[i+1]=rec[i];
					rec[i]=temp;
				}
			}
		}
		
		return rec;
	}
	
}
