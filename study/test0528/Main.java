package test0528;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle[] rec=new Rectangle[4];
		int width,height;
		int max=0;
		
		for (int i = 0; i < rec.length ; i++) {
			System.out.println(i+1+"번 사각형 가로를 입력해주세요 :");
			width=sc.nextInt();
			System.out.println(i+1+"번 사각형 세로를 입력해주세요 :");
			height=sc.nextInt();
			rec[i]=new Rectangle(width,height);//수정해야함 .. 주소로 값이 들어가서 마지막 들어간값이 최종 값이 됨 다 같은곳 바라봄
		}
		System.out.println(rec[0].getArea());
		System.out.println(rec[1].getArea());
		System.out.println(rec[2].getArea());
		System.out.println(rec[3].getArea());
		
		for (int i = 0; i < rec.length; i++) {
			if(max < rec[i].area) {
				max=rec[i].area;
			}
		}
		System.out.println("최대 넓이: "+max);
		System.out.println(Rectangle.getArea());
	}
}


class Rectangle{
	
	int width,height;
	static int area;
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
		this.area=width*height;
	}
	
	static int getArea() {
		return area;
	}
	
	void getMaxRec(Rectangle r){
	}
	
}

