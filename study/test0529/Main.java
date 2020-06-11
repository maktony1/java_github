package test0529;

import java.util.Random;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
    	
    	ColorTV myTV = new ColorTV(32, 1024); myTV.printProperty();
    	
    	
    	int[] arr=new int[10];
    	
    	Random random = new Random();
    	
    	for (int i = 0; i < arr.length; i++) { arr[i] = random.nextInt(100)+1;
    	System.out.print(arr[i]+" "); } System.out.println(); int max=
    			ArrSortMax.getMaxValue(arr); System.out.println("max:"+max);
    			System.out.println("===============");
    			
    			int[] arr2= ArrSortMax.getSortDESC(arr); System.out.println("max:"+max);
    			System.out.println("==============="); 
    }
}

  
 
/////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////
//		Rectangle r1 = new Rectangle(5,6);
//		Rectangle r2 = new Rectangle(7,9);
//		
//		Rectangle r3 = Rectangle.compareRect(r1,r2);
//		
//		System.out.println();
//		}
//	}
/////////////////////////////////////////////////////////////
/**
 * MAX max=new MAX(); max.getMaxValue(); } }
 * 
 **/
/////////////////////////////////////////////////////////////
/**
 * Lotto lotto=new Lotto(); lotto.execute(); } }
 **/
/////////////////////////////////////////////////////////////
/**
 * Circle
 * 
 * Circle c1 = new Circle(6); Circle c2 = new Circle(7); Circle c3 = new
 * Circle(8);
 * 
 * Circle max = Circle.maxCircle(c1,c2,c3);
 * 
 * System.out.println(max.radius); } }
 **/
