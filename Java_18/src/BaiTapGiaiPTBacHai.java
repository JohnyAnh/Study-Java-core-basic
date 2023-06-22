import java.util.Scanner;

public class BaiTapGiaiPTBacHai {
	public static void main(String[] args) {
		//Phương trình bậc 2: ax^2 + bx + c = 0
		// Các biến cần có: a, b, c, x1, x2, delta
		/*
		 * Nếu a == 0 báo lỗi
		 * B1. delta = b^2 -4ac
		 * B2. Kiểm tra delta
		 * 2.1 delta < 0 => Pt vô nghiệm
		 * 2.2 delta == 0 => PT có nghiệm kép x1 = x2 = -b/2a
		 * 2.3 delta > 0 => Phương trình có 2 nghiệm
		 * x1 = (-b -sqrt(delta))/(2a)
		 * x2 = (-b +sqrt(delta))/(2a)
		 * */
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào a: ");
		a = sc.nextDouble();
		System.out.println("Nhập vào b: ");
		b = sc.nextDouble();
		System.out.println("Nhập vào c: ");
		c = sc.nextDouble();
		// Giải phương trình
		delta = Math.pow(b, 2) - 4 * a* c;
		if (a == 0) {
			System.out.println("Nhập dữ liệu sai");
		}else {
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			}else if(delta == 0) {
				//delta == 0 => PT có nghiệm kép x1 = x2 = -b/2a
				x1 = x2 = -b/(a * 2);
				System.out.println("Phương trình có nghiệm kép x1 = x2 =" + x1);
			}else {
				//delta > 0 => Phương trình có 2 nghiệm
				// x1 = (-b -sqrt(delta))/(2a)
				// x2 = (-b +sqrt(delta))/(2a)
				x1 = (-b - Math.sqrt(delta))/(2*a); 
				x2 = (-b + Math.sqrt(delta))/(2*a); 
				System.out.println("Phương trình có nghiệm x1 =" + x1 +" x2 =" +x2);
			}
		}
	}
}
