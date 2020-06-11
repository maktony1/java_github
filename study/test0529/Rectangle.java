package test0529;

public class Rectangle {

	int width,height;
	
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}

	int getArea() {
		return width*height;
	}
	
	public static Rectangle getMaxRec(Rectangle[] arrRec){
		Rectangle maxRec = arrRec[0];
		
		for(Rectangle rectangle : arrRec){
			if(maxRec.getArea() < rectangle.getArea())
				maxRec = rectangle;
		}		
		
		return maxRec;		
	}
	
	public static Rectangle[] getSortRec(Rectangle[] arrRec){
		
		Rectangle temp=null;
		
		for(int i = 0 ; i < arrRec.length ; i++) {
			
			for(int j = 0 ; j < arrRec.length -i -1 ; j++) {
				
				if(arrRec[j].getArea() < arrRec[j+1].getArea()) {
					temp = arrRec[j];
					arrRec[j] = arrRec[j+1];
					arrRec[j+1] = temp;
				}
			}
		}
		
		return arrRec;		
	}
}
