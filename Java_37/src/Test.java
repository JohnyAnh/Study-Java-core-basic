
public class Test {
	public static void main(String[] args) {
		//Test cac contrustor
		Lop lp1 = new Lop("12A6", "Khoa Ngon Ngu");
		Lop lp2 = new Lop("10A4", "Khoa May Tinh");
		Lop lp3 = new Lop("11A8", "Khoa Toan Hoc");
		
		Ngay ngaysinh1 = new Ngay(11, 2, 2003);
		Ngay ngaysinh2 = new Ngay(14, 3, 1999);
		Ngay ngaysinh3 = new Ngay(11, 2, 2003);
		
		SinhVien sv1 = new SinhVien("0001", "Nguyen Van A", ngaysinh1, 7.5, lp1);
		SinhVien sv2 = new SinhVien("0002", "Nguyen Van B", ngaysinh2, 4.5, lp2);
		SinhVien sv3 = new SinhVien("0003", "Nguyen Van C", ngaysinh3, 8.5, lp3);
		
		System.out.println("Kiem Tra thong tin khoa Sinh Vien");
		System.out.println("Ten khoa cua sinh vien 1 la: " + sv1.layTenKhoa());
		System.out.println("Ten khoa cua sinh vien 2 la: " + sv2.layTenKhoa());
		System.out.println("Ten khoa cua sinh vien 3 la: " + sv3.layTenKhoa());
		
		System.out.println("Kiem Tra sinh vien co dat hay khong");
		System.out.println("Sinh vien 1 dat hay khong: "  + sv1.kiemTraThiDat());
		System.out.println("Sinh vien 2 dat hay khong: "  + sv2.kiemTraThiDat());
		System.out.println("Sinh vien 3 dat hay khong: "  + sv3.kiemTraThiDat());
		
		System.out.println("Sinh vien cio trung ngay sinh khong");
		System.out.println("So sanh ngay sinh sinh vien 1 va sinh vien 2: " + sv1.kiemTraTrungNgaySinh(sv2));
		System.out.println("So sanh ngay sinh sinh vien 1 va sinh vien 3: " + sv1.kiemTraTrungNgaySinh(sv3));
		System.out.println("So sanh ngay sinh sinh vien 2 va sinh vien 3: " + sv2.kiemTraTrungNgaySinh(sv3));
	}
}
