package test0529;

public class ColorTV extends TV {
	private int inch;
	
	public ColorTV(int size, int inch) {
		super(size);
		this.inch=inch;
	}

	public int getInch() {
		return inch;
	}
	
	public void printProperty() {
		System.out.println(super.getSize()+" 인치는"+this.getInch());
		//그냥 inch 도 가능한데 colorTV에 private 빼고 해야함. private 사용하면
		//접근할 수 없으니 this.getInch()로 리턴값 받아서 사용해야함
	}

}
