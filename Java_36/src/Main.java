
public class Main {
	public static void main(String[] args) {
		// Test xem các hàm contrustor chạy được không xem có lỗi gì 
		// chạy không báo lỗi là 
		// khai báo cho class
		Ngay ngay1 = new Ngay(30, 10, 2023);
		Ngay ngay2 = new Ngay(31, 9, 2022);
		Ngay ngay3 = new Ngay(29, 4, 2021);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hang A", "Viet Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hang B", "USA");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Hang C", "UK");
		
		BoPhim BP1 = new BoPhim("Boo phim 1", 2022, hangSanXuat1, 200, ngay1);
		BoPhim BP2 = new BoPhim("Boo phim 2", 2021, hangSanXuat2, 300, ngay2);
		BoPhim BP3 = new BoPhim("Boo phim 3", 2023, hangSanXuat3, 500, ngay3);
		
		// Phương thức so sánh giá bộ phim nếu giá tiền nhỏ hơn trả về true sai về false
		System.out.println("So sanh gia tien bo phim 1 re hon 2 "+ BP1.kiemTraGiaVeReHon(BP2));
		System.out.println("So sanh gia tien bo phim 3 re hon 2 "+ BP3.kiemTraGiaVeReHon(BP2));
		// Lấy tiên hãng sản xuất dựa vào phương thức đã tạo 
		System.out.println("Hang san xuat phim 1: "+ BP1.layTenHangSanXuat());
		System.out.println("Hang san xuat phim 2: "+ BP2.layTenHangSanXuat());
		System.out.println("Hang san xuat phim 3: "+ BP3.layTenHangSanXuat());
		// Tạo phương thức giá vé đã giảm rồi trả kết quả về main
		System.out.println("Gia ve bo phim 1 giam 10% la: "+ BP1.giaVeKhuyenMai(10));
		System.out.println("Gia ve bo phim 2 giam 20% la: "+ BP1.giaVeKhuyenMai(20));
		System.out.println("Gia ve bo phim 3 giam 50% la: "+ BP1.giaVeKhuyenMai(50));
	}
}
