package test0525;

class InstCntt {
	static int instNum = 100;
	
	InstCntt(){
		instNum++;
		System.out.println("�ν��Ͻ� ����: " +  instNum);
	}
}
public class OnlyClassNoUnstance {

	public static void main(String[] args) {
		InstCntt.instNum -=15;
		System.out.println(InstCntt.instNum);

	}

}
