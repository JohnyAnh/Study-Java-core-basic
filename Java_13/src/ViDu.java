import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a;
		System.out.println("Nhập vào số a= ");
		// Các phép gán
		a = scanner.nextFloat();
		System.out.println("a = " + a);
		a += 3;// a = a + 3;
		System.out.println("a += 3: " + a);
		a -= 2;// a = a - 2;
		System.out.println("a -= 2: " + a);
		a *=3;// a = a * 3;
		System.out.println("a *= 3: " + a);
		a /=3;// a = a / 3;
		System.out.println("a /= 3: " + a);
		a %=3;// a = a 5 3;
		System.out.println("a %= 3: " + a);

	}
}
/**
 * Nhập vào số a= 
5
a = 5.0
a += 3: 8.0
a -= 2: 6.0
a *= 3: 18.0
a /= 3: 6.0
a %= 3: 0.0
*/
 