package test0601;
/**
 * 다형성의 활용
 * 원의 넓이
 * 사각형 넓이
 * 삼각형 넓이
 * ========
 * 객체 3개가 있다.
 * 3개 넓이의 총합을 구하는 프로그램
 */
public class Area {
	int CirRadius,RecWidth,RecHeight,TriWidth,TriHeight;
	
	public Area(int CirRadius,int RecWidth, int RecHeight,int TriWidth,int Triheight) {
//		System.out.println("반지름, 사각형밑변, 사각형높이, 삼각형가로, 삼각형높이를 차례로 입력하세요");
//		System.out.print("원,사각형,삼각형의 합 :");
		
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
