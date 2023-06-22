import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào họ và tên: ");
		String hoVaTenString = sc.nextLine();

		System.out.println("Nhâp mã sinh viên: ");
		long maSinhVien = sc.nextLong();

		System.out.println("Nhập điểm thi: ");
		float diemThi = sc.nextFloat();

		System.out.println("--------");
		System.out.println("Tên: " + hoVaTenString);
		System.out.println("Mã sinh viên: " + maSinhVien);
		System.out.println("Nhập điểm thi:" + diemThi);
	}
}
