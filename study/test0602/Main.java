package test0602;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rectangle[] rec = new Rectangle[3];
		Scanner sc = new Scanner(System.in);
		int width,height;
		
		for (int i = 0; i < rec.length; i++) {
			System.out.print(i+1+"��° �簢���� �غ��� �Է����ּ��� :");
			width=sc.nextInt();
			System.out.print(i+1+"��° �簢���� ���̸� �Է����ּ��� :");
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
		

		//���� ���
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
//		System.out.println("���:"+size+"��ġ "+color+"�÷�");
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
//		return "���� 100";
//	}
//}
/////////////////////////////////////////////////////