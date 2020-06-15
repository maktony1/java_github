package test0615;

class Box<T>{
	private T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}
class BoxFactory {

	public static Box<String> makeBox(String string) {
		return null;
	}

	public static Box<Double> makeBox(double d) {
		return null;
	}

}
public class GenericsTest {

	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
		
	}

}
