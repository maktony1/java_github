
package test0604;

class Point implements Cloneable {
    private int xPos;
    private int yPos;
    
    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }
    public class Image1 {
        // pointer to the native image data
        private int nativeImg;
        private Point pos;

        // it disposes of the native image;
        // successive calls to it will be ignored
        private native void disposeNative();
        public void dispose() { disposeNative(); }
        protected void finalize() {  }

}
    public void showPosition() {
        System.out.printf("[%d, %d]", xPos, yPos);
        System.out.println();
      
    }

    public void changePos(int x, int y) {
        xPos = x;
        yPos = y;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Rectangle implements Cloneable {
    private Point upperLeft;     // 좌측 상단 좌표
    private Point lowerRight;     // 우측 하단 좌표
    
    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    // 좌표 정보를 수정함
    public void changePos(int x1, int y1, int x2, int y2) {
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 직사각형 좌표 정보 출력    
    public void showPosition() {
        System.out.print("좌측 상단: ");
        upperLeft.showPosition();
        
        System.out.print("우측 하단: ");
        lowerRight.showPosition();
        System.out.println(); 
    }
   
}

class ShallowCopy {
    public static void main(String[] args) {
        Rectangle org = new Rectangle(1, 1, 9, 9);
        Rectangle cpy;
        
        try {
            // 인스턴스 복사
            cpy = (Rectangle)org.clone();

            // 한 인스턴스의 좌표 정보를 수정
            org.changePos(2, 2, 7, 7);

            org.showPosition();
            cpy.showPosition();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

//		Rectangle[] rec = new Rectangle[4];
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < rec.length; i++) {
//			System.out.print(i + 1 + "번째 사각형 가로와 세로 입력: ");
//			rec[i] = new Rectangle(sc.nextInt(), sc.nextInt());
//		}
//		//최대 넓이 구하기 및 출력
//		Rectangle maxRec = Rectangle.getMaxRec(rec);
//		System.out.println("최대 넓이 " + maxRec.getArea());
//
//		
//		// 정렬 전 확인
//		System.out.print("원래 순서 ->");
//		for (int i = 0; i < rec.length; i++) {
//			System.out.print(rec[i].getArea()+" ");
//		}
//		System.out.println();
//		
//		
//		// 내림차순 정렬
//		Rectangle[] recSortingDesc = Rectangle.getSortingRecDesc(rec);
//		
//		// 내림차순 정렬 후 확인
//		System.out.print("내림차순 정렬 후 ->");
//		for (int i = 0; i < recSortingDesc.length; i++) {
//			System.out.print(rec[i].getArea()+" ");
//		}
//		
//		System.out.println();
//		// 오른차순 정렬
//		Rectangle[] recSortingAsc = Rectangle.getSortingRecAsc(rec);
//		// 오른차순 정렬 후 확인
//		System.out.print("오름차순 정렬 후 ->");
//		for (int i = 0; i < recSortingDesc.length; i++) {
//			System.out.print(rec[i].getArea()+" ");
//		}
//	}
//}
//		String myDoc = "This is a report about...";
//		
//		Printable prn = new SPrinterDriver();
//		prn.print(myDoc);
//		System.out.println();
//		
//		
//		prn = new LPrinterDriver();
//		prn.print(myDoc);
