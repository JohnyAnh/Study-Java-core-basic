import java.util.Iterator;
import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("-----------");

		// Hàm length() = Độ dài của chuỗi
		System.out.println(s.length());
		int doDai = s.length();
		System.out.println("-----------");
		// Hàm charAt(vị trí ) => lấy ra một ký tự tại vị trí
		for (int i = 0; i < doDai; i++) {
			System.out.println("Tại vị trí " + i + " là: " + s.charAt(i));
		}
		System.out.println("-----------");
		//getChars(vị trí bắt đầu, vị trí kết thúc - 1, mảng lưu dữ liệu, vị trí bắt đầu lưu mảng)
		char[] arrayChar = new char[100];
		s.getChars(2, 5, arrayChar, 0);
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.println("Giá trị của mảng " + i + " là: " +arrayChar[i]);
		}
		System.out.println("-----------");
		// Hàm getBytes => có 3 cách, lấy ra giá trị của các ký tự  trả về trong bẳng ASCII
		byte[] arrayBytes = s.getBytes();
		for (byte b : arrayBytes) {
			System.out.println(b);
		}
	}
}
