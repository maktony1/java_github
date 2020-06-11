//package test0608;
//
//interface Eatable {
//	public String eat();
//}
//
//class Apple implements Eatable {
//	public String eat() {
//		return "It tastes good";
//	}
//
//}
//
//class Box<T extends Eatable> {
//	T ob;
//
//	public void set(T o) {
//		ob = o;
//	}
//
//	public T get() {
//		System.out.println(ob.eat());
//		return ob;
//	}

//class Box<T>{
//	private T ob;
//	
//	public void set(T o) {
//		ob=o;
//	}
//	public T get() {
//		return ob;
//	}
//}
//public class PrimitivesAndGeneric {
//
//	public static void main(String[] args) {
//		Box<Integer> iBox= new Box<Integer>();
//		iBox.set(125);
//		int num = iBox.get();
//		System.out.println(num);
//	}
//
//}
