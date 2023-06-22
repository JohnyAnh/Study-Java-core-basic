import java.util.Scanner;

public class BaiTapHinhTron {
	public static void main(String[] args) {
		double r, dienTich, chuVi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập bán kính r: ");
		r = sc.nextDouble();

		// Tính chu vi
		chuVi = 2 * Math.PI * r;
		System.out.println("Chu vi = " + chuVi);
		System.out.println("Chu vi = " + Math.round(chuVi));// Làm tròn
		System.out.println("Chu vi = " + Math.round(chuVi*100.0)/100.0);// Lấy sau dấu phẩy 2 số 

		// Tính diện tích
		dienTich = Math.PI * Math.pow(r, 2);
		System.out.println("Diện tích = " + dienTich);
		System.out.println("Diện tích = " + Math.round(dienTich));// làm tròn
		System.out.println("Diện tích = " + Math.round(dienTich*100.0)/100.0);// Lấy sau dấu phẩy 2 số
	}
}

/**
 *  Nhập bán kính r: 
5
Chu vi = 31.41592653589793
Chu vi = 31
Chu vi = 31.42
Diện tích = 78.53981633974483
Diện tích = 79
Diện tích = 78.54
 */
