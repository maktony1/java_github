package test0605;

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}
class Orange{
	public String toString() {
		return "I am an orange.";
	}
}

class AppleBox{ //사과상자
	private Apple ap; 
	
	public void set(Apple a) { //사과 담기
		ap=a;
	}
	public Apple get() {
		return ap;
	}
}
class OrangeBox{
	private Orange or;
	
	public void set(Orange o) {
		or = o;
	}
	
	public Orange get() {
		return or;
	}
}
public class FruitAndBox {

	public static void main(String[] args) {
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}

}
