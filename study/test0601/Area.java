package test0601;
/**
 * �������� Ȱ��
 * ���� ����
 * �簢�� ����
 * �ﰢ�� ����
 * ========
 * ��ü 3���� �ִ�.
 * 3�� ������ ������ ���ϴ� ���α׷�
 */
public class Area {
	int CirRadius,RecWidth,RecHeight,TriWidth,TriHeight;
	
	public Area(int CirRadius,int RecWidth, int RecHeight,int TriWidth,int Triheight) {
//		System.out.println("������, �簢���غ�, �簢������, �ﰢ������, �ﰢ�����̸� ���ʷ� �Է��ϼ���");
//		System.out.print("��,�簢��,�ﰢ���� �� :");
		
		this.CirRadius=CirRadius;
		this.RecWidth=RecWidth;
		this.RecHeight=RecHeight;
		this.TriWidth=TriWidth;
		this.RecHeight=RecHeight;
}
	double getSumArea() {
		return (CirRadius*CirRadius*3.14)+(RecHeight*RecWidth)+(TriHeight*TriWidth/2);
	}
	
}
