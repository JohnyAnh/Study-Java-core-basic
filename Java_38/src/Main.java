
public class Main {
	public static void main(String[] args) {
		// Test contrustor
		QuocGia QG1 = new QuocGia("za", "Dai Loan");
		QuocGia QG2 = new QuocGia("us", "Hoa Ky");
		QuocGia QG3 = new QuocGia("jp", "Nhat Ban");
		
		Ngay day1 = new Ngay(13, 5, 2022);
		Ngay day2 = new Ngay(11, 8, 2021);
		Ngay day3 = new Ngay(16, 2, 2023);
		
		HangSanXuat hang1 = new HangSanXuat("Asus", QG1);
		HangSanXuat hang2 = new HangSanXuat("Dell", QG2);
		HangSanXuat hang3 = new HangSanXuat("Sony", QG3);
		
		MayTinh mt1 = new MayTinh(hang1, day1, 1000, 12);
		MayTinh mt2 = new MayTinh(hang2, day2, 3000, 24);
		MayTinh mt3 = new MayTinh(hang3, day3, 2000, 18);
		
		System.out.println("So sanh gia ban:");
		System.out.println("Gia may tinh 1 > gia may tinh 2 " + mt1.kiemTraGiaThapHon(mt2));
		System.out.println("Gia may tinh 1 > gia may tinh 3 " + mt1.kiemTraGiaThapHon(mt3));
		System.out.println("Gia may tinh 2 > gia may tinh 3 " + mt2.kiemTraGiaThapHon(mt3));
		
		System.out.println("Ten quoc gia san xuat may tinh");
		System.out.println("May tinh 1 của quốc gia: "+ mt1.inTenQuocGiaSanXuatMayTinh());
		System.out.println("May tinh 2 của quốc gia: "+ mt2.inTenQuocGiaSanXuatMayTinh());
		System.out.println("May tinh 3 của quốc gia: "+ mt3.inTenQuocGiaSanXuatMayTinh());
		
	}
}
