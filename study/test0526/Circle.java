package test0526;

public class Circle {
	int radius;
	
	public Circle() {
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	static Circle maxCircle(Circle c1,Circle c2,Circle c3){
		Circle max;
		if((c1.radius > c2.radius) && (c1.radius > c3.radius)) {
			max=c1;
		}else if((c2.radius > c3.radius) && (c2.radius > c1.radius)){
			max=c2;
		}else {
			max=c3;
		}
		return max;
		
	}
}
