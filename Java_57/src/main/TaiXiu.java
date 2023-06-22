package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng
 * số tiền họ đang có.
 * Luật chơi như sau:
 * Có 3 viên xúc xắc. Mõi viên xúc có 6 mặt có giá tị từ 1 đến 6.
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3
 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
 * 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 */
public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000;
		Scanner sc = new Scanner(System.in);
		
		Locale lc = new Locale("vi", "VN");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc); 
		System.out.println("-------Mời Bạn Chọn------");
		int luaChon = 0;
		// Tạo Menu
		do {
			System.out.println("Chọn (1) tiếp tục chơi.");
			System.out.println("Bất kỳ phím nào để thoát.");
			luaChon = sc.nextInt();
			if (luaChon == 1) {
				System.out.println("-------Bắt đầu chơi------");
				// Đặt cược
				System.out.println("Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi) + " bạn muốn đặt cược bao nhiêu?");
				double datCuoc = 0;
				do {
					System.out.println("Đạt cược số tiền > 0 số tiền cược <= " + numf.format(taiKhoanNguoiChoi) + ":");
					datCuoc = sc.nextDouble();
				} while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);
				// chọn tài xỉu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("Chọn 1 Tài -- 2 Xỉu");
					luaChonTaiXiu = sc.nextInt();
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				// Tung xúc xắc
				Random xucxac1 = new Random();
				Random xucxac2 = new Random();
				Random xucxac3 = new Random();
				
				int giaTri1 = xucxac1.nextInt(5) + 1;
				int giaTri2 = xucxac2.nextInt(5) + 1;
				int giaTri3 = xucxac3.nextInt(5) + 1;
				int tong = giaTri1 + giaTri2 + giaTri3;
				
				System.out.println("Kết quả lắc xì ngầu xx1:" + giaTri1 + ", xx2:" + giaTri2 + ", xx3:" + giaTri3);
				if (tong == 3 || tong == 18) {
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("Tổng 3 XX " + tong + "=> Nhà cái ăn hết, bạn đã thua!");
					System.out.println("Tài khoản còn lại là: " + numf.format(taiKhoanNguoiChoi));

				} else if (tong >= 4 && tong <= 10) {
					System.out.println("Tổng 3 XX " + tong + "=> Xỉu!");
					if (luaChonTaiXiu == 2) {
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("Bạn đã thắng tài khoản bạn được cộng: " + numf.format(datCuoc) + " vào tài khoản");
						System.out.println("Số dư hiện tại: " + numf.format(taiKhoanNguoiChoi));
					} else {
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("=> Bạn đã thua. Tài khoản bạn bị trừ: " + numf.format(datCuoc) + " vào tài khoản!");
						System.out.println("Số dư hiện tại: " + numf.format(taiKhoanNguoiChoi));
					}
				} else {
					System.out.println("Tổng 3 XX " + tong + "=> Tài!");
					if (luaChonTaiXiu == 1) {
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("Bạn đã thắng tài khoản bạn được cộng: " + numf.format(datCuoc) + " vào tài khoản");
						System.out.println("Số dư hiện tại: " + numf.format(taiKhoanNguoiChoi));
					} else {
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("=> Bạn đã thua. Tài khoản bạn bị trừ: " + numf.format(datCuoc) + " vào tài khoản!");
						System.out.println("Số dư hiện tại: " + numf.format(taiKhoanNguoiChoi));
					}
				}
			}

		} while (luaChon == 1);
	}
}
