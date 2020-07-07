


class ColorTV{
	String IP;
	int inch;
	public ColorTV(String IP,int inch) {
		this.IP=IP;
		this.inch=inch;
	}
	
}
public class IPTV {

	public IPTV(String string, int i, int j) {

	}

	private void printProperty() {
		
	}
	
	
	public static void main(String args[]) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048 컬러
		iptv.printProperty();
		}


}
