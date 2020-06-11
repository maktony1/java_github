package test0603;

public class SumArea {
	int radius;
	
	int recWidth,recHeight;
	
	int triWidth,triHeight;
	
	public SumArea(int radius,int recWidth, int recHeight, int triWidth, int triHeight) {
		this.radius=radius;
		this.recWidth=recWidth;
		this.recHeight=recHeight;
		this.triWidth=triWidth;
		this.triHeight=triHeight;
	}
	
	int sumArea() {
		return circleGetArea()+recangleGetArea()+triangleGetArea();
	}
	
	int circleGetArea() {
		return radius*radius*(int)Math.PI;
	}
	int recangleGetArea() {
		return recWidth*recHeight;
	}
	int triangleGetArea() {
		return triWidth*triHeight/2;
	}
}
