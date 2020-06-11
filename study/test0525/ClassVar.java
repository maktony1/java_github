package test0525;

class InstCnt{
	static int instNum=0;
	
	public InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}

	public void instCnt() {
		// TODO Auto-generated method stub
		
	}
}

public class ClassVar {
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		cnt3.instCnt();
		}

}