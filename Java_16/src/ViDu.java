import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số a: ");
		a = sc.nextDouble();
		System.out.println("Nhập vào số b: ");
		b = sc.nextDouble();
		// Hàm trị tuyệt đối
		System.out.println("|a|= " + Math.abs(a));

		// Hàm tìm Min
		System.out.println("min(a, b) = " + Math.min(a, b));

		// Hàm tìm Max
		System.out.println("max(a, b) = " + Math.max(a, b));

		// Hàm ceil làm tròn lên gần nhất
		System.out.println("ceil(a) = " + Math.ceil(a));

		// Hàm floor làm tròn xuống gần nhất
		System.out.println("floor(a) = " + Math.floor(a));

		// Hàm căn bậc hai sqrt
		System.out.println("sqrt(a) = " + Math.sqrt(a));

		// Hàm tính a^b
		System.out.println("a^b = " + Math.pow(a, b));

	}
}
/*
 * Nhập vào số a: 
9,5
Nhập vào số b: 
2
|a|= 9.5
min(a, b) = 2.0
max(a, b) = 9.5
ceil(a) = 10.0
floor(a) = 9.0
sqrt(a) = 3.082207001484488
a^b = 90.25
 * */
