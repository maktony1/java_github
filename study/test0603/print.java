package test0603;

interface Printable { // MS�� �����ϰ� ������ �������̽�
	   public void print(String doc);
	}




public class print {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		// �Ｚ �����ͷ� ���
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		// LG �����ͷ� ���
		prn = new LPrinterDriver();
		prn.print(myDoc);

	}

}
