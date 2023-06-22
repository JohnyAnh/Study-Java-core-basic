import java.util.Scanner;

public class BaiTapGiaiPTBacNhat {
	public static void main(String[] args) {
		// PTBN: ax+b=0
		/*
		 *Nếu a = 0
		 *	 b = 0 => PT Vô số Nghiệm
		 *	 b != 0 => PT vô nghiệm 
		 *Nếu a != 0
		 *	Có nghiệm x = - b/a
		 * */
		
		double a, b, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a = ");
		a = sc.nextDouble();
		System.out.println("Nhập b = ");
		b = sc.nextDouble();
		
		if (a == 0) {
			// tình huống a = 0
			if (b == 0) {
				// a = 0 và b =0
				System.out.println("Phương trình có vô số nghiệm!");
			}else {
				// a = 0 và b != 0
				System.out.println("Phương trình vô nghiệm!");
				
			}
		}else {
			// tình huống a!= 0
			x = -b/a;
			System.out.println("Có nghiệm x = " + x);
		}
	}
}
