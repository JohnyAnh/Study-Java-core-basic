import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		// khai báo biến
		int a, b;

		// Nhập dữ liệu
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào a= ");
		a = scanner.nextInt();
		System.out.println("Nhập vào b= ");
		b = scanner.nextInt();

		int tong = a + b;
		System.out.println(a + " + " + b + " = " + tong);
		
		int hieu = a - b;
		System.out.println(a + " - " + b + " = " + hieu);
		
		int nhan = a * b;
		System.out.println(a + " * " + b + " = " + nhan);
		
		float chia =(float) a / b;
		System.out.println(a + " / " + b + " = " + chia);
		
		int soDu = a % b;
		System.out.println(a + " % " + b + " = " + soDu);

	}
}
