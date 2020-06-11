package test0527;

public class Circle {
	int radius;
	
	
	public Circle() {
	}
	
	Circle(int radius){
		this.radius=radius;
	}
	
	static Circle maxCircle(Circle c1,Circle c2, Circle c3) {
		Circle max=c1;
		
		if(max.radius < c2.radius) {
			max=c2;
		}
		
		if(max.radius < c3.radius) {
			max=c3;
		}
		return max;
		
	}
	
}
