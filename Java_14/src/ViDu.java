import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Nhập a = ");
		a = sc.nextInt();
		System.out.println("Nhập b = ");
		b = sc.nextInt();

		// Xuất kết quả ra màn hình
		System.out.println(a + " = " + b + " : " + (a == b));// (a==b)=> cho ra kết quả T of F
		System.out.println(a + " != " + b + " : " + (a != b));
		System.out.println(a + " < " + b + " : " + (a < b));
		System.out.println(a + " <= " + b + " : " + (a <= b));
		System.out.println(a + " > " + b + " : " + (a > b));
		System.out.println(a + " >= " + b + " : " + (a >= b));
		System.out.println("----");
		System.out.println("Cả hai số chẵn: " + (a % 2 == 0 && b % 2 == 0));
		System.out.println("Có ít nhấn 1 số chẵn: " + (a % 2 == 0 || b % 2 == 0));
	}
}
/**
 * Nhập a = 
6
Nhập b = 
3
6 = 3 : false
6 != 3 : true
6 < 3 : false
6 <= 3 : false
6 > 3 : true
6 >= 3 : true
----
Cả hai số chẵn: false
Có ít nhấn 1 số chẵn: true
 * */
 