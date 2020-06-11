
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
    private Point upperLeft;     // ���� ��� ��ǥ
    private Point lowerRight;     // ���� �ϴ� ��ǥ
    
    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    // ��ǥ ������ ������
    public void changePos(int x1, int y1, int x2, int y2) {
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // ���簢�� ��ǥ ���� ���    
    public void showPosition() {
        System.out.print("���� ���: ");
        upperLeft.showPosition();
        
        System.out.print("���� �ϴ�: ");
        lowerRight.showPosition();
        System.out.println(); 
    }
   
}

class ShallowCopy {
    public static void main(String[] args) {
        Rectangle org = new Rectangle(1, 1, 9, 9);
        Rectangle cpy;
        
        try {
            // �ν��Ͻ� ����
            cpy = (Rectangle)org.clone();

            // �� �ν��Ͻ��� ��ǥ ������ ����
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
//			System.out.print(i + 1 + "��° �簢�� ���ο� ���� �Է�: ");
//			rec[i] = new Rectangle(sc.nextInt(), sc.nextInt());
//		}
//		//�ִ� ���� ���ϱ� �� ���
//		Rectangle maxRec = Rectangle.getMaxRec(rec);
//		System.out.println("�ִ� ���� " + maxRec.getArea());
//
//		
//		// ���� �� Ȯ��
//		System.out.print("���� ���� ->");
//		for (int i = 0; i < rec.length; i++) {
//			System.out.print(rec[i].getArea()+" ");
//		}
//		System.out.println();
//		
//		
//		// �������� ����
//		Rectangle[] recSortingDesc = Rectangle.getSortingRecDesc(rec);
//		
//		// �������� ���� �� Ȯ��
//		System.out.print("�������� ���� �� ->");
//		for (int i = 0; i < recSortingDesc.length; i++) {
//			System.out.print(rec[i].getArea()+" ");
//		}
//		
//		System.out.println();
//		// �������� ����
//		Rectangle[] recSortingAsc = Rectangle.getSortingRecAsc(rec);
//		// �������� ���� �� Ȯ��
//		System.out.print("�������� ���� �� ->");
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
