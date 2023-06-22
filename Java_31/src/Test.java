
public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung nguyen", 100000, 1.5);
		HoaDonCaPhe hd1 = new HoaDonCaPhe("Trung nguyen", 100000, 5.5);
		System.out.println("Tong tien hd = "+hd.tinhTongTien());
		System.out.println("Tong tien hd1 = "+hd1.tinhTongTien());
		System.out.println("kiem tra khoi luong > 2kg " +hd.kiemTraKhoiLuongLonHon(2));
		System.out.println("kiem tra khoi luong > 2kg " +hd.kiemTraKhoiLuongLonHon(1));
		System.out.println("kiem tra tong tien > 500k " +hd.kiemTraTongTienLonHon500K());
		System.out.println("kiem tra tong tien > 500k " +hd1.kiemTraTongTienLonHon500K());
		System.out.println("HD giảm giá của HD:" + hd.giamGia(10));
		System.out.println("HD giảm giá của HD:" + hd1.giamGia(10));
		System.out.println("HD sau giảm giá của HD:" + hd.giaSauKhiGiam(10));
		System.out.println("HD sau giảm giá của HD1:" + hd1.giaSauKhiGiam(10));
		
	}
}
