//package test0601;
//
//import java.awt.Rectangle;
//
////
//class Price {
//	int price;
//
//	int getPrice() {
//		return price;
//	}
//}
//
//class Computer extends Price {
//
//}
//
//class Client {
//
//	Price price[];
//
//	void calcu() {
//		int totalPrice = 0;
//		for (Price price : price) {
//			totalPrice = totalPrice + price.getPrice();
//
//		}
//	}
//
//}
//
///**
// * ǥ��(����)�� ���� �� �ִ�. - ĸ��ȭ�� �⺻ ���������� �����ϴ�.
// * 
// * @author bit
// *
// */
//
////==================================================
//class Shape {
//
//	int getArea() {
//		return 0;
//	}
//}
//
//class RectAngle extends Shape {
//
//	private int width;
//	private int height;
//
//	RectAngle(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
//
//	int getArea() {
//		return width * height;
//
//	}
//
//}
//
//class TriAngle extends Shape {
//
//	private int width;
//	private int height;
//
//	TriAngle(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
//
//	int getArea() {
//		return width * height / 2;
//
//	}
//
//}
//
//class Circle extends Shape {
//
//	private int radius;
//
//	Circle(int radius) {
//		this.radius = radius;
//	}
//
//	int getArea() {
//		return radius * radius * (int) Math.PI;
//
//	}
//
//	public String toString() {
//		return "�޷�";
//	}
//
//}
//
//public class AreaTest {
//
//	public static void main(String[] args) {
//		Circle circle = new Circle(10);
//		Object obj = new Circle(10);
//		System.out.println(circle);
//
//	}
//
//}
