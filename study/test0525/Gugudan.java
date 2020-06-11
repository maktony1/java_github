package test0525;

public class Gugudan {

	int dan;
	
	Gugudan(int dan){
		this.dan=dan;
	}

	void show() {
		for (int i = 1; i <=9 ; i++) {
			System.out.printf("%d X %d = %d\n",dan,i,(dan*i));
			
		}
	}
	
	void setDan(int dan){
		this.dan=dan;
	}
	
}
