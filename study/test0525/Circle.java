package test0525;

public class Circle {
	int radius;
	int max;
	
	Circle (){}
	
	Circle (int radius){
		this.radius=radius;
	}
	
	void max(int max) {
		this.max=max;
	}
	int maxCircle(Circle c1,Circle c2,Circle c3){
		if((c1.radius > c2.radius) && (c1.radius > c3.radius)) {
			max=c1.radius;
		}else if((c2.radius > c1.radius) && (c2.radius > c3.radius)) {
			max=c2.radius;
		}else {
			max=c3.radius;
		}
		return max;
	}
}
