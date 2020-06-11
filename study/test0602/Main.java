package test0602;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rectangle[] rec = new Rectangle[3];
		Scanner sc = new Scanner(System.in);
		int width,height;
		
		for (int i = 0; i < rec.length; i++) {
			System.out.print(i+1+"번째 사각형의 밑변을 입력해주세요 :");
			width=sc.nextInt();
			System.out.print(i+1+"번째 사각형의 높이를 입력해주세요 :");
			height=sc.nextInt();
			rec[i]=new Rectangle(width,height);
		}
		
		for (int i = 0; i < 1; i++) {
			Rectangle num;
			if(rec[i].getArea() > rec[i+1].getArea() && rec[i].getArea() > rec[i+2].getArea()) {
				num=rec[i];
				System.out.println(num.getArea());

			}
			}
		

		//최종 출력
		for (int i = 0; i < rec.length; i++) {
			System.out.println(rec[i].getArea());
		}
		System.out.println();
	}
}

////////////////////////////////////////////
//class TV {
//	private int size;
//
//	public TV(int size) {
//		this.size = size;
//	}
//
//	protected int getSize() {
//		return size;
//	}
//}
//
//class ColorTV extends TV {
//	int size,color;
//	
//	public ColorTV(int size, int color) {
//		this.size=size;
//		this.color=color;
//	}
//
//	public ColorTV(int size) {
//		
//	}
//
//
//	public void printProperty() {
//		System.out.println("출력:"+size+"인치 "+color+"컬러");
//	}
//	
//}
/////////////////////////////////////////////////////////////



//////////////////////////////////////////////////////////////
//class Circle{
//	int radius;
//	public Circle(int radius) {
//		this.radius=radius;
//	}
//	
//	int CircleArea() {
//		return radius*radius*(int)Math.PI;
//	}
//	
//}
//class Rectangle{
//	int width,height;
//	public Rectangle(int width,int height) {
//		this.width=width;
//		this.height=height;
//	}
//	
//	int RectangleArea() {
//		return width*height;
//	}
//}
//class Triangle{
//	int width,height;
//	public Triangle(int width,int height) {
//		this.width=width;
//		this.height=height;
//	}
//
//	int TriangleArea() {
//		return width*height/2;
//	}
//}
//
//class Sum {
//	int sum;
//	public Sum() {
//		System.out.println();
//	}
//}
/////////////////////////////////////////////////////
/////////////////////////////////////////////////////
//class Circle{
//	int radius;
//	
//	public Circle(int radius) {
//		this.radius=radius;
//	}
//	
//	public String toString(){
//		return "넓이 100";
//	}
//}
/////////////////////////////////////////////////////