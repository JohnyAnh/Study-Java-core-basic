import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a = ");
		int a = sc.nextInt();

		String ketQua = (a % 2 == 0) ? "Số chẵn" : "Số lẻ";
		System.out.println(a + " là " + ketQua);
	}
}
/*
 * Nhập a = 
15
15 là Số lẻ
Nhập a = 
10
10 là Số chẵn*/
