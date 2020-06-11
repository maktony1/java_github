package test0605;

import java.util.Scanner;

interface IGugudan {
	void gugudan();
}

interface IStarPrint{
	void starPrint(int n);
}
public class Main implements IGugudan,IStarPrint {
	
	
	
	public void gugudan() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\t",j,i,(j*i));
			}System.out.println();
		}
	}

	@Override
	public void starPrint(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Main gugu=new Main();
//		gugu.gugudan();
		Main star = new Main();
//		star.starPrint(6);
		Scanner sc = new Scanner(System.in);
		
		Rectangle[] rec = new Rectangle[3];
		for (int i = 0; i < rec.length; i++) {
			System.out.printf("%d번째 사각형의 가로와 세로를 각각 입력해 주세요:",i+1);
			rec[i]=new Rectangle(sc.nextInt(),sc.nextInt());
		}
		
		for (int i = 0; i < rec.length; i++) {
			System.out.print(rec[i].getArea()+" ");
		}
		System.out.println();
		Rectangle[] recSorting = Rectangle.getSortingRec(rec);
		for (int i = 0; i < rec.length; i++) {
			System.out.print(rec[i].getArea()+" ");
		}
	}

}
