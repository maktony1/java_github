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
		System.out.println(super.getSize()+" ��ġ��"+this.getInch());
		//�׳� inch �� �����ѵ� colorTV�� private ���� �ؾ���. private ����ϸ�
		//������ �� ������ this.getInch()�� ���ϰ� �޾Ƽ� ����ؾ���
	}

}
