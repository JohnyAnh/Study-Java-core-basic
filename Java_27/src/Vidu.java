import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {// không có try catch chương trình ngừng luôn//try cố gắng thực hiện lệnh
			System.out.println("nhập vào số nguyên n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("nhập giá trị không đúng");
		} finally {// dù chương trình lỗi hay không lỗi vẫn in
			System.out.println("Finally!");
		}
		System.out.println("Giá trị nhập : " + n);
		System.out.println("kết thúc chương trình");
	}
}
