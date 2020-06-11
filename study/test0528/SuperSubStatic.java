package test0528;

class SuperCLS {
	protected static int count = 0;
	public SuperCLS() {
		count++;
	}
}
class SubCLS extends SuperCLS {
public void showCount() {
	
	System.out.println(count);
	}
}
class SubsubCLS extends SubCLS {
	public void showCount() {
		
		System.out.println(count);
	}
}

public class SuperSubStatic {

	public static void main(String[] args) {
		SuperCLS obj1= new SuperCLS();
		SuperCLS obj2= new SuperCLS();
		
		SubCLS obj3 = new SubCLS();
		obj3.showCount();
		
		SubsubCLS subobj3=new SubsubCLS();
		subobj3.showCount();
	}
}
