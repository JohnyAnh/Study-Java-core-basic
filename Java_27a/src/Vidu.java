import java.util.Scanner;

import javax.sound.midi.Soundbank;

@SuppressWarnings("unused")
public class Vidu {
	public static void main(String[] args) {
		double[] mang1;
		double mang2[];
		// đặt cặp ngoặc vuông sau hay trước tên biến là được
		// dùng để lưu trữ dữ liệu giống nhau số lượng lớn thì dùng mảng

		// Trước khi gán gtri cho mảng cần khởi tạo mảng có kích cỡ
//		mang1 = new double[10]; // mảng 1 double có 10 phần tử
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < mang1.length; i++) {// dùng vòng lặp để nhập vào mảng
//			System.out.println("Nhập phần tử thứ " + i + " : ");
//			mang1[i] = sc.nextDouble();// nhập vào mảng
//		}
//		double tong = 0;
//		for (int i = 0; i < mang1.length; i++) {
//			tong += mang1[i];
//		}
//		System.out.println("Tổng : " + tong);
		
		// Cách gán khác
		System.out.println("Mảng 2");
		mang2 = new double[]{1,2,3,4,5};
		for (int i = 0; i < mang2.length; i++) {
			System.out.println(mang2[i]);
		}
		

	}
}
