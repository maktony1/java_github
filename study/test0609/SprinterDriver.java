package test0609;

public class SprinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From is Samsung printer");
		System.out.println(doc);
	}

}
