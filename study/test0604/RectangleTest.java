package test0604;

public class RectangleTest {
	int width,height;
	
	public RectangleTest(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	int getArea() {
		return this.width*this.height;
	}
	
	static RectangleTest getMaxRec(RectangleTest[] rec) {
		RectangleTest max=rec[0];
		for (int i = 0; i < rec.length; i++) {
			if(max.getArea() < rec[i].getArea()) {
				max=rec[i];
			}
		}
		return max;
	}
	
	static RectangleTest[] getSortingRecDesc(RectangleTest[] rec) {
		RectangleTest temp;
		
		for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < rec.length-1; j++) {
				if(rec[j].getArea() < rec[j+1].getArea()) {
				temp=rec[j];
				rec[j]=rec[j+1];
				rec[j+1]=temp;
				}
			}
		}
		return rec;
	}
	static RectangleTest[] getSortingRecAsc(RectangleTest[] rec) {
		RectangleTest temp;
		
		for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < rec.length-1; j++) {
				if(rec[j].getArea() > rec[j+1].getArea()) {
					temp=rec[j];
					rec[j]=rec[j+1];
					rec[j+1]=temp;
				}
			}
		}
		return rec;
	}
	
}
