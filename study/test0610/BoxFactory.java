//package test0610;
//
////class Box{
////	private Object ob;
////	public void set(Object ob) { this.ob=ob;}
////	public Object get() {return ob;}
////		
////	}
////}
//class Box<T> {
//    private T ob;     
//    public void set(T o) { ob = o; }
//    public T get() { return ob; }
//
//    @Override
//    public String toString() {
//        return ob.toString();
//    }
//}
//
//public class BoxFactory {
//	Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
//	Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
//	
//	
//	public static void main(String[] args) {
//		Box<String> sBox = new Box<String>();
//		Box<Double> dBox = new Box<Double>();
//		
//	}
//}
