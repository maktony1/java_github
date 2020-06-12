/**
 *
 * @author maktony
 * 정올 입력-형성평가4
 *
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double oneYard = 91.44;
		System.out.print("yard? ");
		double yard = sc.nextDouble();
//
		System.out.printf("%.1fyard = %.1fcm", yard, (yard * oneYard));
	}
}
