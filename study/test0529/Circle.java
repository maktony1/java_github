package test0529;

public class Circle {
	int radius;
	
	
	public Circle(int radius) {
		this.radius=radius;
	}


	public static Circle maxCircle(Circle c1, Circle c2, Circle c3) {
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
