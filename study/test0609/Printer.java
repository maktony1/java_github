package test0609;

public class Printer {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
	
	Printable prn = new SprinterDriver();
	prn.print(myDoc);
	System.out.println();
	
	prn = new LPrinterDriver();
	prn.print(myDoc);
	}
}
